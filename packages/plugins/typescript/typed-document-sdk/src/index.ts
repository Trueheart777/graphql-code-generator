import { Types, PluginValidateFn, PluginFunction } from '@graphql-codegen/plugin-helpers';
import {
  GraphQLSchema,
  isEnumType,
  isInputObjectType,
  isInterfaceType,
  isObjectType,
  isScalarType,
  isUnionType,
} from 'graphql';
import { buildInterfaceSelectionString } from './buildInterfaceSelectionString';
import { buildObjectTypeArgumentString } from './buildObjectTypeArgumentString';
import { buildObjectTypeSelectionString } from './buildObjectTypeSelectionString';
import { buildSDKObjectString } from './buildSDKObjectString';
import { buildUnionSelectionString } from './buildUnionSelectionString';
import { TypedDocumentSDKConfig } from './config';
import { importsString, contentsString } from './sdk-static';

export const plugin: PluginFunction<TypedDocumentSDKConfig> = (
  schema: GraphQLSchema,
  _: Types.DocumentFile[],
  _config: TypedDocumentSDKConfig
) => {
  const contents: Array<string> = [contentsString];
  const inputTypeMap: Array<string> = [];

  for (const graphQLType of Object.values(schema.getTypeMap())) {
    // selection set objects
    if (isObjectType(graphQLType)) {
      contents.push(buildObjectTypeSelectionString(graphQLType), buildObjectTypeArgumentString(graphQLType));
    }

    // input types
    if (isScalarType(graphQLType)) {
      inputTypeMap.push(`  ${graphQLType.name}: Scalars['${graphQLType.name}'];`);
    }

    if (isEnumType(graphQLType)) {
      inputTypeMap.push(`  ${graphQLType.name}: ${graphQLType.name};`);
    }

    if (isInputObjectType(graphQLType)) {
      inputTypeMap.push(`  ${graphQLType.name}: ${graphQLType.name};`);
    }

    if (isInterfaceType(graphQLType)) {
      contents.push(buildInterfaceSelectionString(schema, graphQLType));
    }

    if (isUnionType(graphQLType)) {
      contents.push(buildUnionSelectionString(graphQLType));
    }
  }

  contents.push(`type GeneratedSDKInputTypes = {\n${inputTypeMap.join('')}`);

  // sdk object
  contents.push(buildSDKObjectString(schema.getQueryType(), schema.getMutationType(), schema.getSubscriptionType()));

  return {
    prepend: [importsString],
    content: contents.join(`\n\n`),
  };
};

export const validate: PluginValidateFn<TypedDocumentSDKConfig> = async () => {};

export { TypedDocumentSDKConfig };
