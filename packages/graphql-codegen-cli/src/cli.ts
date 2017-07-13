import * as commander from 'commander';
import { introspectionFromFile } from './loaders/introspection-from-file';
import { introspectionFromUrl } from './loaders/introspection-from-url';
import { introspectionFromExport } from './loaders/introspection-from-export';
import { documentsFromGlobs } from './utils/documents-glob';
import {
  EInputType,
  GeneratorConfig,
  getGeneratorConfig,
  compileTemplate,
  FileOutput,
  ALLOWED_CUSTOM_TEMPLATE_EXT,
} from 'graphql-codegen-generators';
import { introspectionToGraphQLSchema, schemaToTemplateContext, transformDocument } from 'graphql-codegen-core';
import { loadDocumentsSources } from './loaders/document-loader';
import * as path from 'path';
import { scanForTemplatesInPath } from './loaders/templates-scanner';
import * as fs from 'fs';

export interface CLIOptions {
  file?: string;
  url?: string;
  'export'?: string;
  args?: string[];
  template?: string;
  project?: string;
  out?: string;
  headers?: string[];
  schema?: any;
  documents?: any;
  projectConfig?: string;
}

interface ProjectConfig {
  flattenTypes: boolean;
  primitives: {
    String: string;
    Int: string;
    Float: string;
    Boolean: string;
    ID: string;
  };
}

function collect(val, memo) {
  memo.push(val);

  return memo;
}

export const initCLI = (args): any => {
  commander
    .version(require('../../../package.json').version)
    .usage('gql-gen [options]')
    .option('-f, --file <filePath>', 'Parse local GraphQL introspection JSON file')
    .option('-u, --url <graphql-endpoint>', 'Parse remote GraphQL endpoint as introspection file')
    .option('-u, --export <export-file>', 'Path to a JavaScript (es5/6) file that exports (as default export) your `GraphQLSchema` object')
    .option('-h, --header [header]', 'Header to add to the introspection HTTP request when using --url', collect, [])
    .option('-t, --template <template-name>', 'Language/platform name templates')
    .option('-p, --project <project-path>', 'Project path(s) to scan for custom template files')
    .option('--project-config <json-file>', 'Project configuration file')
    .option('-m, --no-schema', 'Generates only client side documents, without server side schema types')
    .option('-c, --no-documents', 'Generates only server side schema types, without client side documents')
    .option('-o, --out <path>', 'Output file(s) path', String, './')
    .arguments('<options> [documents...]')
    .parse(args);

  return commander;
};

export const cliError = (err: string) => {
  if (typeof err === 'object') {
    console.log(err);
  }

  console.error('Error: ' + err);
  process.exit(1);

  return;
};

export const validateCliOptions = (options: CLIOptions) => {
  const file = options.file;
  const url = options.url;
  const fsExport = options.export;
  const template = options.template;

  if (!file && !url && !fsExport) {
    cliError('Please specify one of --file, --url or --export flags!');
  }

  if (!template) {
    cliError('Please specify language/platform, using --template flag');
  }
};

export const executeWithOptions = async (options: CLIOptions): Promise<FileOutput[]> => {
  console.log(options);
  validateCliOptions(options);

  const file: string = options.file;
  const url: string = options.url;
  const fsExport: string = options.export;
  const documents: string[] = options.args || [];
  const template: string = options.template;
  const project: string = options.project;
  const projectConfig: string = options.projectConfig || './gql-gen.json';
  const out: string = options.out || './';
  const headers: string[] = options.headers;
  const noSchema: boolean = !options.schema;
  const noDocuments: boolean = !options.documents;
  let schemaExportPromise;

  if (file) {
    schemaExportPromise = introspectionFromFile(file).then(introspectionToGraphQLSchema);
  }
  else if (url) {
    schemaExportPromise = introspectionFromUrl(url, headers).then(introspectionToGraphQLSchema);
  }
  else if (fsExport) {
    schemaExportPromise = introspectionFromExport(fsExport);
  }

  const graphQlSchema = await schemaExportPromise;
  const context = schemaToTemplateContext(graphQlSchema);
  const transformedDocuments = transformDocument(graphQlSchema, loadDocumentsSources(await documentsFromGlobs(documents)));
  let templateConfig: GeneratorConfig = null;

  if (template && template !== '') {
    templateConfig = getGeneratorConfig(template);

    if (!templateConfig) {
      throw new Error(`Unknown template: ${template}!`);
    }
  }

  if (project && project !== '') {
    const configPath = path.resolve(process.cwd(), projectConfig);

    if (fs.existsSync(configPath)) {
      const config = JSON.parse(fs.readFileSync(configPath).toString()) as ProjectConfig;
      const templates = scanForTemplatesInPath(project, ALLOWED_CUSTOM_TEMPLATE_EXT);

      templateConfig = {
        inputType: EInputType.PROJECT,
        templates,
        flattenTypes: config.flattenTypes,
        primitives: config.primitives,
      };
    } else {
      throw new Error(`Please specify --projectConfig path or create gql-gen.json in your project root!`);
    }
  }

  return compileTemplate(templateConfig, context, [transformedDocuments], {
    generateSchema: noSchema,
    generateDocuments: noDocuments
  }).map((item: FileOutput) => ({
    content: item.content,
    filename: path.resolve(process.cwd(), out, item.filename),
  }));
};
