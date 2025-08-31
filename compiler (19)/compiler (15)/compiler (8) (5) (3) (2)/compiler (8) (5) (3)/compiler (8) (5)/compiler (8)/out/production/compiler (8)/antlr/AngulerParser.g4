parser grammar AngulerParser;

options { tokenVocab = AngulerLexer; }

/* Top-Level Structure */
prog
    : anguler_import*
      |component_declaration*
      |(EXPORT INTERFACE class_declaration)*
      EOF
    ;

/* Import Statements */
anguler_import
    : IMPORT OPEN_BRACE IDENTIFIER (COMMA IDENTIFIER)* CLOSE_BRACE FROM STRING_LITERAL SEMICOLON
    ;

/* Component System */
component_declaration
    : COMPONENT OPEN_PAREN component_metadata CLOSE_PAREN
      class_declaration
    ;

component_metadata
    : OPEN_BRACE (metadata_property (COMMA metadata_property)*) CLOSE_BRACE
    ;

metadata_property
    : SELECTOR COLON STRING_LITERAL             #metadataSelector
    | STANDALONE COLON BOOLEAN                  #metadataStandalone
    | IMPORTS COLON (imports_array )   #metadataImports
    | TEMPLATE COLON TEMPLATE_LITERAL           #metadataTemplate
    | TEMPLATE_URL COLON STRING_LITERAL         #metadataTemplateUrl
    | STYLES COLON (STRING_LITERAL | array)     #metadataStyles
    | STYLE_URLS COLON imports_array            #metadataStyleUrls
    ;

/* Type System */
type_annotation
: base_type_annotation (PIPE base_type_annotation)*;

base_type_annotation
: IDENTIFIER                                                            #simpleType
| primitive_type                                                        #primitiveType
| NULL                                                                  #nullType
| VOID                                                                  #voidType
| structured_type                                                       #structuredType
| array_type                                                            #arrayType;

primitive_type
    : STRING
    | NUMBER
    | BOOLEAN
    | ANY
    | UNDEFINED
    ;

array_type
    : IDENTIFIER OPEN_BRACKET CLOSE_BRACKET
    ;

structured_type
    : OPEN_BRACE type_pair (SEMICOLON type_pair)* SEMICOLON? CLOSE_BRACE
    ;

type_pair
    : IDENTIFIER COLON base_type_annotation
    ;


/* Class System */
class_declaration
    : EXPORT? CLASS IDENTIFIER OPEN_BRACE class_body CLOSE_BRACE
    ;

class_body
    : property_declaration*    #classBodyProperty
      | method_declaration*    #classBodyMethod
      | function_declaration*  #classBodyFunction
      | class_declaration*      #classBodyClass
      | instruction*            #classBodyInstruction
    ;

    property_declaration
        : (PUBLIC | PRIVATE | PROTECTED)? IDENTIFIER (COLON type_annotation)? (EQUAL expression)? SEMICOLON?
        | OUTPUT OPEN_PAREN CLOSE_PAREN IDENTIFIER (EQUAL expression)? SEMICOLON?
        ;
        method_declaration
            : IDENTIFIER method_body
            ;



method_body
    : OPEN_PAREN parameter_list? CLOSE_PAREN (COLON type_annotation)?
      OPEN_BRACE instruction* CLOSE_BRACE
    ;

/* Functions */
function_declaration
    : IDENTIFIER function_body
    ;

function_body
    : OPEN_PAREN parameter_list? CLOSE_PAREN
      OPEN_BRACE instruction* CLOSE_BRACE
    ;

parameter_list
    : parameter (COMMA parameter)*
    ;

parameter
    : IDENTIFIER COLON (base_type_annotation | structured_type)
    ;

/* Variables and Assignments */
declaraiton_keywords
    : CONST
    | LET
    | VAR
    ;

variable_declaration
    : declaraiton_keywords? IDENTIFIER (COLON type_annotation)? (EQUAL expression)? SEMICOLON
    ;


primary
    : literal_value       #primaryLiteral
    | IDENTIFIER          #primaryIdentifier
    | OPEN_PAREN CLOSE_PAREN  #primaryEmptyParens
    | NULL               #primaryNull
    | json_object        #primaryJsonObject
    | array             #primaryArray
    | BOOLEAN           #primaryBoolean
    ;

postfix_expression
    : primary ( (DOT IDENTIFIER)
                | (OPEN_BRACKET expression CLOSE_BRACKET)
                | (OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN)
              )*
    ;

/* Now use postfix_expression where we previously used value/function_call/member_expression */
/* Expressions and Values (reworked) */
value
: literal_value                                                             #literalValue
| IDENTIFIER                                                                #identifierValue
| NULL                                                                      #nullValue
| json_object                                                               #objectValue
| array                                                                     #arrayValue
| OPEN_PAREN expression CLOSE_PAREN                                         #parenthesizedValue
;

/* assignment supports assigning to member-like targets; reuse postfix_expression for LHS via member-like match */
assignment
    : postfix_expression EQUAL value SEMICOLON?
    | IDENTIFIER DOLLAR? EQUAL value DOLLAR? SEMICOLON?
    ;

/* Literal */
literal_value
    : DECIMAL_INTEGER_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | TEMPLATE_LITERAL
    ;

/* Arithmetic & Logical */
arithmetic_expression
    : value (MUL | SLASH | MOD) value
    | value (SUM | MIN) value
    ;

unary_expression
    : (SUM | MIN) value
    | (INCREMENT | DECREMENT) value
    | value (INCREMENT | DECREMENT)
    | NOT value
    ;
relational_expression
    : value (OPENTAG | CLOSETAG | LESS_EQUAL | GRETER_EQUAL) value
    ;

equality_expression
    : value (IS_EQUAL | NOT_EQUAL | IS_EQUAL_TYPE | NOT_EQUAL_TYPE) value
    ;
  logical_expression
      : logical_expression AND equality_expression
      | logical_expression OR equality_expression
      | equality_expression
      ;
    conditional_expression
        : value QUESTION expression COLON expression
        ;




    /* expression now composes from non-left-recursive building blocks */
expression
    : conditional_expression      #conditionalExpr
    | logical_expression         #logicalExpr
    | postfix_expression         #postfixExpr
    | relational_expression      #relationalExpr
    | equality_expression        #equalityExpr
    | arithmetic_expression      #arithmeticExpr
    | unary_expression           #unaryExpr
    ;

    /* Data Structures */
    json_object
        : OPEN_BRACE (json_pair (COMMA json_pair)*)? CLOSE_BRACE
        ;

    json_pair
        : (IDENTIFIER | STRING_LITERAL) COLON value
        ;

    imports_array
        : OPEN_BRACKET (value (COMMA value)*)? CLOSE_BRACKET
        ;

    array
        : OPEN_BRACKET (value (COMMA value)*)? CLOSE_BRACKET
        ;

    /* Statements */
    instruction
        : postfix_expression SEMICOLON?                                  #expressionStatement
        | variable_declaration                                             #declarationStatement
        | assignment                                                       #assignmentStatement
        | class_declaration                                                #classDeclaration
        | function_declaration                                             #functionDeclaration
        | EXPORT variable_declaration                                      #exportStatement
        | conditional_statements                                           #conditionalStatement
        | interface_Declaration                                            #interfaceDeclaration
        | generic_Type                                                      #genericType
        | method_declaration                                                #methodDeclaration
        ;
        /* conditional and control flow (unchanged) */
          conditional_statements
              : if_statement                                                          #ifStatementRule
              | switch_statement                                                      #switchStatementRule
              | while_statement                                                       #whileStatementRule
              | do_while_statement                                                    #doWhileStatementRule
              | for_statement                                                         #forStatementRule
              | continue_Statement                                                    #continueStatementRule
              | return_Statement                                                       #returnStatementRule
              | break_statement                                                        #breakStatementRule
              ;

            block
                : OPEN_BRACE instruction* CLOSE_BRACE
                ;

            if_statement
                : IF OPEN_PAREN expression CLOSE_PAREN block (ELSE if_statement | ELSE block)?
                ;

            for_statement
                : FOR OPEN_PAREN
                  (variable_declaration | expressionSequence | SEMICOLON)
                  expressionSequence? SEMICOLON
                  expressionSequence?
                  CLOSE_PAREN block
                ;

            switch_statement
                : SWITCH OPEN_PAREN value CLOSE_PAREN OPEN_BRACE switch_body CLOSE_BRACE
                ;

            switch_body
                : (switch_case | switch_default)*
                ;

            switch_case
                : CASE value COLON instruction*
                ;

            switch_default
                : DEFAULT COLON instruction*
                ;

            while_statement
                : WHILE OPEN_PAREN value CLOSE_PAREN block
                ;

            do_while_statement
                : DO block WHILE OPEN_PAREN value CLOSE_PAREN SEMICOLON
                ;

            continue_Statement
                : CONTINUE (IDENTIFIER)? eos
                ;

            return_Statement
                : RETURN (expressionSequence)? eos?
                ;

            break_statement
                : BREAK SEMICOLON
                ;

            expressionSequence
                : value (COMMA value)*
                | IDENTIFIER
                ;

            interface_Declaration
                : INTERFACE IDENTIFIER structured_type
                ;

            generic_Type
                : IDENTIFIER OPENTAG type_annotation (COMMA type_annotation)* CLOSETAG
                ;

            eos
                : SEMICOLON
                | EOF
                ;

            /* Template System */
            html_value
                : (open_tag html_value* close_tag?)   #nestedHtml
                | single_tag                          #selfClosingTag
                | template_variable                   #templateVariable
                | ng_content                          #ngContent
                | ng_template                         #ngTemplate
                ;

            tags
                : DIV_TAG
                | H1_TAG
                | H2_TAG
                | H3_TAG
                | P_TAG
                | IMG_TAG
                | A_TAG
                | SPAN_TAG
                | BUTTON_TAG
                ;

            open_tag
                : (OPENTAG )
                  (tags | IDENTIFIER)
                  html_attribute*
                  CLOSETAG
                ;



            html_attribute
                :  EQUAL expression
                ;

            close_tag
                : (OPENTAG ) SLASH
                  (tags | IDENTIFIER)
                  CLOSETAG
                ;
                single_tag
                    : (OPENTAG )
                      (tags | IDENTIFIER)
                      html_attribute*
                      SLASH CLOSETAG
                    ;

                template_variable
                    : HASH IDENTIFIER
                    ;

                ng_content
                    : OPENTAG NG_CONTENT html_attribute* CLOSETAG
                    ;

                ng_template
                    : OPENTAG NG_TEMPLATE html_attribute* CLOSETAG html_value* OPENTAG SLASH NG_TEMPLATE CLOSETAG   #ngTemplateWithContent
                    | OPENTAG NG_TEMPLATE html_attribute* SLASH CLOSETAG                                            #ngTemplateSelfClosing
                    ;