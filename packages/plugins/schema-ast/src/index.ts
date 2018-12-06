import { GraphQLSchema, printSchema } from 'graphql';
import { DocumentFile, PluginFunction, PluginValidateFn, Types } from 'graphql-codegen-core';
import { extname } from 'path';

export const plugin: PluginFunction = async (schema: GraphQLSchema): Promise<string> => {
  return printSchema(schema, { commentDescriptions: true });
};

export const validate: PluginValidateFn<any> = async (
  schema: GraphQLSchema,
  documents: DocumentFile[],
  config: any,
  outputFile: string,
  allPlugins: Types.ConfiguredPlugin[]
) => {
  const singlePlugin = allPlugins.length === 1;

  if (singlePlugin && extname(outputFile) !== '.graphql') {
    throw new Error(`Plugin "schema-ast" requires extension to be ".graphql"!`);
  }
};
