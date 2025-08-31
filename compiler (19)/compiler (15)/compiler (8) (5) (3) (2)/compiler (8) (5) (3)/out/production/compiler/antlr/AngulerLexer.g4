lexer grammar AngulerLexer;

// ===== WHITESPACE AND COMMENTS FIRST =====
WS: [ \t\r\n\u000C]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// ===== ANGULAR DECORATORS AND SPECIFIC TOKENS =====
COMPONENT: '@Component';
INJECTABLE: '@Injectable';
INPUT: '@Input';
OUTPUT: '@Output';
VIEW_CHILD: '@ViewChild';
CONTENT_CHILD: '@ContentChild';

// ===== ANGULAR METADATA PROPERTIES =====
SELECTOR: 'selector';
STANDALONE: 'standalone';
IMPORTS: 'imports';
TEMPLATE: 'template';
TEMPLATE_URL: 'templateUrl';
STYLES: 'styles';
STYLE_URLS: 'styleUrls';
STYLE_URL: 'styleUrl';
PROVIDED_IN: 'providedIn';

// ===== ANGULAR DIRECTIVES =====
NG_IF: '*ngIf';
NG_FOR: '*ngFor';
NG_CLASS: 'ngClass';
NG_STYLE: 'ngStyle';
NG_MODEL: 'ngModel';

// ===== ANGULAR LIFECYCLE HOOKS =====
NG_ON_INIT: 'ngOnInit';
NG_ON_CHANGES: 'ngOnChanges';
NG_ON_DESTROY: 'ngOnDestroy';

// ===== KEYWORDS (MUST COME BEFORE IDENTIFIER) =====
PRIVATE: 'private';
PUBLIC: 'public';
PROTECTED: 'protected';
CLASS: 'class';
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
CONST: 'const';
LET: 'let';
VAR: 'var';
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
NEW: 'new';
THIS: 'this';
SUPER: 'super';
FUNCTION: 'function';
INTERFACE: 'interface';
VOID: 'void';
NULL: 'null';
UNDEFINED: 'undefined';
EMIT: 'emit';

// ===== TYPE KEYWORDS =====
STRING: 'string';
NUMBER: 'number';
BOOLEAN: 'boolean';
ANY: 'any';

// ===== OPERATORS =====
ELLIPSIS: '...';
INCREMENT: '++';
DECREMENT: '--';
NOT: '!';
QUESTION: '?';
SUM: '+';
MIN: '-';
MUL: '*';
SLASH: '/';
MOD: '%';
AND: '&&';
OR: '||';
PIPE: '|';
ARROW: '=>';

// ===== COMPARISON OPERATORS =====
IS_EQUAL: '==';
NOT_EQUAL: '!=';
IS_EQUAL_TYPE: '===';
NOT_EQUAL_TYPE: '!==';
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';

// ===== SYMBOLS =====
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';  // Move these BEFORE OPENTAG/CLOSETAG
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
COLON: ':';
EQUAL: '=';
DOLLAR: '$';
HASH: '#';
OPENTAG: '<';        // Move these after bracket symbols
CLOSETAG: '>';

// ===== HTML TAGS =====
DIV_TAG: 'div';
H1_TAG: 'h1';
H2_TAG: 'h2';
H3_TAG: 'h3';
P_TAG: 'p';
IMG_TAG: 'img';
A_TAG: 'a';
SPAN_TAG: 'span';
BUTTON_TAG: 'button';
NG_CONTENT: 'ng-content';
NG_TEMPLATE: 'ng-template';

// ===== HTML ATTRIBUTES =====
STYLE_ATTR: 'style';
ALT_ATTR: 'alt';
SRC_ATTR: 'src';
HREF_ATTR: 'href';

// ===== ROUTER =====
ROUTER_LINK: 'routerLink';
ROUTER_OUTLET: 'router-outlet';

// ===== FORM DIRECTIVES =====
FORM_CONTROL_NAME: 'formControlName';
FORM_GROUP: 'formGroup';
FORM_ARRAY: 'formArray';

// ===== LITERALS =====
BOOLEAN_LITERAL: 'true' | 'false';
DECIMAL_INTEGER_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]* '.' [0-9]+;
STRING_LITERAL: '\'' .*? '\'' | '"' .*? '"';
TEMPLATE_LITERAL: '`' .*? '`';

// ===== GENERAL TOKENS (MUST COME LAST) =====
IDENTIFIER: [a-zA-Z_] [a-zA-Z_0-9]*;
ANGULAR: '@angular';

// ===== ESCAPE SEQUENCES =====
fragment ESC: '\\' [btnfr"'\\];

// ===== UNEXPECTED_TOKEN MUST BE LAST =====
UNEXPECTED_TOKEN: . -> skip;