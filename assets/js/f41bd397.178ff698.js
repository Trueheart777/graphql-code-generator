"use strict";(self.webpackChunk_graphql_codegen_website=self.webpackChunk_graphql_codegen_website||[]).push([[7151],{35318:function(e,t,n){n.d(t,{Zo:function(){return c},kt:function(){return m}});var r=n(27378);function a(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function o(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,r)}return n}function i(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?o(Object(n),!0).forEach((function(t){a(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):o(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function s(e,t){if(null==e)return{};var n,r,a=function(e,t){if(null==e)return{};var n,r,a={},o=Object.keys(e);for(r=0;r<o.length;r++)n=o[r],t.indexOf(n)>=0||(a[n]=e[n]);return a}(e,t);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);for(r=0;r<o.length;r++)n=o[r],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(a[n]=e[n])}return a}var p=r.createContext({}),l=function(e){var t=r.useContext(p),n=t;return e&&(n="function"==typeof e?e(t):i(i({},t),e)),n},c=function(e){var t=l(e.components);return r.createElement(p.Provider,{value:t},e.children)},u={inlineCode:"code",wrapper:function(e){var t=e.children;return r.createElement(r.Fragment,{},t)}},g=r.forwardRef((function(e,t){var n=e.components,a=e.mdxType,o=e.originalType,p=e.parentName,c=s(e,["components","mdxType","originalType","parentName"]),g=l(n),m=a,d=g["".concat(p,".").concat(m)]||g[m]||u[m]||o;return n?r.createElement(d,i(i({ref:t},c),{},{components:n})):r.createElement(d,i({ref:t},c))}));function m(e,t){var n=arguments,a=t&&t.mdxType;if("string"==typeof e||a){var o=n.length,i=new Array(o);i[0]=g;var s={};for(var p in t)hasOwnProperty.call(t,p)&&(s[p]=t[p]);s.originalType=e,s.mdxType="string"==typeof e?e:a,i[1]=s;for(var l=2;l<o;l++)i[l]=n[l];return r.createElement.apply(null,i)}return r.createElement.apply(null,n)}g.displayName="MDXCreateElement"},58831:function(e,t,n){n.r(t),n.d(t,{frontMatter:function(){return s},contentTitle:function(){return p},metadata:function(){return l},toc:function(){return c},default:function(){return g}});var r=n(25773),a=n(30808),o=(n(27378),n(35318)),i=["components"],s={id:"gatsby",title:"GatsbyJS"},p=void 0,l={unversionedId:"integrations/gatsby",id:"integrations/gatsby",isDocsHomePage:!1,title:"GatsbyJS",description:"If you are building apps using GatsbyJS, you can use GraphQL Code Generator to generate TypeScript types.",source:"@site/docs/integrations/gatsby.md",sourceDirName:"integrations",slug:"/integrations/gatsby",permalink:"/docs/integrations/gatsby",editUrl:"https://github.com/dotansimha/graphql-code-generator/edit/master/website/docs/integrations/gatsby.md",tags:[],version:"current",frontMatter:{id:"gatsby",title:"GatsbyJS"},sidebar:"sidebar",previous:{title:"Create-React-App",permalink:"/docs/integrations/create-react-app"},next:{title:"Prettier & Linters",permalink:"/docs/integrations/prettier"}},c=[{value:"Community Plugins",id:"community-plugins",children:[],level:2}],u={toc:c};function g(e){var t=e.components,n=(0,a.Z)(e,i);return(0,o.kt)("wrapper",(0,r.Z)({},u,n,{components:t,mdxType:"MDXLayout"}),(0,o.kt)("p",null,"If you are building apps using ",(0,o.kt)("a",{parentName:"p",href:"https://www.gatsbyjs.org/"},"GatsbyJS"),", you can use GraphQL Code Generator to generate TypeScript types."),(0,o.kt)("p",null,"The codegen knows automatically to look for the import of the ",(0,o.kt)("inlineCode",{parentName:"p"},"graphql")," tag for ",(0,o.kt)("inlineCode",{parentName:"p"},"gatsby")," package."),(0,o.kt)("p",null,"Using the following config file, it should cover everything specific to Gastby:"),(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-yml"},"schema: http://localhost:8000/___graphql\ndocuments:\n  - ./src/**/*.{ts,tsx}\n  - ./node_modules/gatsby*/!(node_modules)/**/*.js\ngenerates:\n  ./src/graphqlTypes.ts:\n    plugins:\n      - typescript\n      - typescript-operations\n")),(0,o.kt)("p",null,"Now, the codegen should be able to load your GraphQL operations from your source code, and also load all the internal fragments from ",(0,o.kt)("inlineCode",{parentName:"p"},"node_modules"),"."),(0,o.kt)("div",{className:"admonition admonition-caution alert alert--warning"},(0,o.kt)("div",{parentName:"div",className:"admonition-heading"},(0,o.kt)("h5",{parentName:"div"},(0,o.kt)("span",{parentName:"h5",className:"admonition-icon"},(0,o.kt)("svg",{parentName:"span",xmlns:"http://www.w3.org/2000/svg",width:"16",height:"16",viewBox:"0 0 16 16"},(0,o.kt)("path",{parentName:"svg",fillRule:"evenodd",d:"M8.893 1.5c-.183-.31-.52-.5-.887-.5s-.703.19-.886.5L.138 13.499a.98.98 0 0 0 0 1.001c.193.31.53.501.886.501h13.964c.367 0 .704-.19.877-.5a1.03 1.03 0 0 0 .01-1.002L8.893 1.5zm.133 11.497H6.987v-2.003h2.039v2.003zm0-3.004H6.987V5.987h2.039v4.006z"}))),"Note on ",(0,o.kt)("inlineCode",{parentName:"h5"},"documents")," section")),(0,o.kt)("div",{parentName:"div",className:"admonition-content"},(0,o.kt)("p",{parentName:"div"},"The glob expression above should get you started quickly, but note that it's very broad and might load many files that matches the ",(0,o.kt)("inlineCode",{parentName:"p"},"./node_modules/gatsby*/!(node_modules)/**/*.js")," pattern.\nIf you are having issues with this glob expression, or if you are seeing performance issues, please note that you need to narrow this expression to the bare minimum that is being loaded by your Gatsby instance."),(0,o.kt)("p",{parentName:"div"},(0,o.kt)("a",{parentName:"p",href:"https://github.com/dotansimha/graphql-code-generator/issues/5024"},"This issue might help")))),(0,o.kt)("h2",{id:"community-plugins"},"Community Plugins"),(0,o.kt)("p",null,"There are also community Gatsby plugins that integrate with @graphl-codegen:"),(0,o.kt)("ul",null,(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("a",{parentName:"li",href:"https://github.com/d4rekanguok/gatsby-typescript/tree/master/packages/gatsby-plugin-graphql-codegen"},"gatsby-plugin-graphql-codegen")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("a",{parentName:"li",href:"https://github.com/cometkim/gatsby-plugin-typegen"},"gatsby-plugin-typegen"))))}g.isMDXComponent=!0}}]);