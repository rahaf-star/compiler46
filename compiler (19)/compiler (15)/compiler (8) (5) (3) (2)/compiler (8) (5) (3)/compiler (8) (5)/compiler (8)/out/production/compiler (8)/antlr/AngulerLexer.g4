lexer grammar AngulerLexer;

// Tokens
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
COLON: ':';
QUOTE:'\'';
EQUAL:'=';
IS_EQUAL:'==';
NOT_EQUAL:'!=';
IS_EQUAL_TYPE:'===';
NOT_EQUAL_TYPE:'!==';
BACK_SLASH:'\\';
ARROW:'=>';
COMPONENT: '@Component';
ANGULAR:'@angular';
INCREMENT: '++';
DECREMENT: '--';
VOID: 'void';
NOT: '!';
QUESTION: '?';

OPENTAG:'<' ;
CLOSETAG:'>' ;
LESS_EQUAL: '<=';
GRETER_EQUAL: '>=';

OPERATORE:'+'|'-'|'*'|'/';
SLASH:'/';
SUM:'+' ;
MIN: '_';
MUL: '*';
MOD: '%';
DOLLAR:'$';
AND: '&&';
OR: '||';
PIPE: '|';

// Angular Component Metadata
SELECTOR: 'selector';
STANDALONE: 'standalone';
IMPORTS: 'imports';
TEMPLATE: 'template';
TEMPLATE_URL: 'templateUrl';
STYLES: 'styles';
STYLE_URLS: 'styleUrls';
STYLE_URL: 'styleUrl';


// Angular Directives
NG_IF: '*ngIf';
NG_FOR: '*ngFor';
NG_CLASS: 'ngClass';
NG_STYLE: 'ngStyle';
NG_MODEL: 'ngModel';
DIRECTIVE: NG_IF | NG_FOR | NG_CLASS | NG_STYLE | NG_MODEL | ('*' IDENTIFIER);

// Template reference variables
HASH: '#';

// Angular specific tags
NG_CONTENT: 'ng-content';
NG_TEMPLATE: 'ng-template';

// Component communication
INPUT: '@Input';
OUTPUT: '@Output';

// View queries
VIEW_CHILD: '@ViewChild';
CONTENT_CHILD: '@ContentChild';

// Lifecycle hooks
NG_ON_INIT: 'ngOnInit';
NG_ON_CHANGES: 'ngOnChanges';
NG_ON_DESTROY: 'ngOnDestroy';

// Router tokens
ROUTER_LINK: 'routerLink';
ROUTER_OUTLET: 'router-outlet';

// Form directives
FORM_CONTROL_NAME: 'formControlName';
FORM_GROUP: 'formGroup';
FORM_ARRAY: 'formArray';


// HTML Attributes
STYLE_ATTR: 'style';
ALT_ATTR: 'alt';
SRC_ATTR: 'src';
HREF_ATTR: 'href';

// HTML Tags
DIV_TAG: 'div';
H1_TAG: 'h1';
H2_TAG: 'h2';
H3_TAG: 'h3';
P_TAG: 'p';
IMG_TAG: 'img';
A_TAG: 'a';
SPAN_TAG: 'span';
BUTTON_TAG: 'button';



// Keywords
FUNCTION: 'function';
INTERFACE:'interface';
CLASS:'class';
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
BOOLEAN: 'true'|'false';
NULL: 'null';
UNDEFINED: 'undefined';
STRING:'string';
NUMBER:'number';
BOOL:'boolean';
ANY:'any';
CONST: 'const';
LET: 'let';
VAR: 'var';
INT: 'int';
PRIVATE: 'private';
PUBLIC : 'public';
PROTECTED : 'protected';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
STRING_LITERAL: '\'' .*? '\'' | '"' .*? '"';
TEMPLATE_LITERAL: '`' .*? '`';


// Numbers
DECIMAL_INTEGER_LITERAL: [1-9][0-9]* | '0';
HEX_INTEGER_LITERAL: '0x'[0-9a-fA-F]+;
OCTAL_INTEGER_LITERAL: '0'[0-7]+;
BINARY_INTEGER_LITERAL: '0b'[01]+;
FLOAT_LITERAL: [0-9]*'.'[0-9]+;

// Comments & Whitespace
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

// Escape sequences
fragment ESC: '\\' [btnfr"'\\`];

