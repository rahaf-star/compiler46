parser grammar AngulerParser;

options { tokenVocab = AngulerLexer; }

/* Top-Level Structure */
prog
    : (anguler_import | component_declaration | injectable_declaration | export_statement | class_declaration)* EOF
    ;

/* Injectable System */
injectable_declaration
    : INJECTABLE OPEN_PAREN injectable_metadata CLOSE_PAREN
      class_declaration
    ;

injectable_metadata
    : OPEN_BRACE (injectable_metadata_property (COMMA injectable_metadata_property)*)? CLOSE_BRACE
    ;

injectable_metadata_property
    : PROVIDED_IN COLON (STRING_LITERAL | IDENTIFIER)
    ;

export_statement
    : EXPORT (variable_declaration | method_declaration | function_declaration|interface_Declaration) SEMICOLON?
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
    | STANDALONE COLON BOOLEAN_LITERAL                  #metadataStandalone
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
    : (property_declaration
     | method_declaration
     | function_declaration
     | class_declaration
     | instruction
      )*
    ;


    property_declaration
        : (PUBLIC | PRIVATE | PROTECTED)? IDENTIFIER (COLON type_annotation)? (EQUAL expression)? SEMICOLON?
        | OUTPUT OPEN_PAREN CLOSE_PAREN IDENTIFIER (EQUAL expression)? SEMICOLON?
        ;



       method_declaration
           : (PUBLIC | PRIVATE | PROTECTED)?
             IDENTIFIER OPEN_PAREN parameter_list? CLOSE_PAREN
             (COLON type_annotation)?
             method_body
           ;

     method_body
         : OPEN_BRACE (variable_declaration |  return_Statement | expression SEMICOLON?)* CLOSE_BRACE
         ;

/* Functions */
function_declaration
    : IDENTIFIER function_body
    ;

function_body
    : OPEN_PAREN parameter_list? CLOSE_PAREN
      OPEN_BRACE instruction* CLOSE_BRACE
    ;
emit_statement
    : THIS DOT IDENTIFIER DOT EMIT OPEN_PAREN json_object CLOSE_PAREN SEMICOLON?
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
    : declaraiton_keywords? IDENTIFIER (COLON type_annotation)? (EQUAL expression)? SEMICOLON?
    ;


primary
    : literal_value       #primaryLiteral
    | IDENTIFIER          #primaryIdentifier
    | OPEN_PAREN CLOSE_PAREN  #primaryEmptyParens
    | NULL               #primaryNull
    | json_object        #primaryJsonObject
    | array             #primaryArray
    | BOOLEAN           #primaryBoolean
    | THIS                    #primaryThis
    | SUPER                   #primarySuper
     | NEW IDENTIFIER (type_arguments)? OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN  #newExpression
     | ELLIPSIS expression     #spreadExpression
    ;

    type_arguments
        : OPENTAG type_annotation (COMMA type_annotation)* CLOSETAG
        ;

postfix_expression
    : primary (postfix_operator)*
    ;

postfix_operator
    : DOT IDENTIFIER (OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN)?  #memberAccess
    | OPEN_BRACKET expression CLOSE_BRACKET                                       #arrayAccess
    | OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN                    #functionCall
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
| ELLIPSIS expression                                                       #spreadValue
;

/* assignment supports assigning to member-like targets; reuse postfix_expression for LHS via member-like match */
assignment
    : postfix_expression EQUAL expression SEMICOLON?
    | IDENTIFIER DOLLAR? EQUAL expression DOLLAR? SEMICOLON?
    ;


/* Literal */
literal_value
    : DECIMAL_INTEGER_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | TEMPLATE_LITERAL
    ;



unary_expression
    : (SUM | MIN) value
    | (INCREMENT | DECREMENT) value
    | value (INCREMENT | DECREMENT)
    | NOT value
    ;
logical_expression
    : postfix_expression ( (AND | OR) postfix_expression )*
    ;

relational_expression
    : postfix_expression ( (OPENTAG | CLOSETAG | LESS_EQUAL ) postfix_expression )*
    ;

equality_expression
    : postfix_expression ( (IS_EQUAL | NOT_EQUAL | IS_EQUAL_TYPE | NOT_EQUAL_TYPE) postfix_expression )*
    ;

arithmetic_expression
    : postfix_expression ( (SUM | MIN | MUL | SLASH | MOD) postfix_expression )*
    ;

conditional_expression
    : postfix_expression QUESTION expression COLON expression
    ;





    /* expression now composes from non-left-recursive building blocks */
expression
    : postfix_expression         #postfixExpr        // MOVE TO TOP
    | unary_expression           #unaryExpr
    | arithmetic_expression      #arithmeticExpr
    | equality_expression        #equalityExpr
    | relational_expression      #relationalExpr
    | logical_expression         #logicalExpr
    | conditional_expression     #conditionalExpr
    | assignment                 #assignmentExpr     // MOVE TO BOTTOM
    | BOOLEAN_LITERAL            #assignmentBoolean
    ;

    /* Data Structures */
    json_object
        : OPEN_BRACE (json_pair (COMMA json_pair)*)? CLOSE_BRACE
        ;

   json_pair
       : (IDENTIFIER | STRING_LITERAL) COLON expression
       ;

    imports_array
        : OPEN_BRACKET (value (COMMA value)*)? CLOSE_BRACKET
        ;

    array
        : OPEN_BRACKET (array_element (COMMA array_element)*)? CLOSE_BRACKET
        ;

    array_element
        : expression
        | ELLIPSIS expression
        ;

    /* Statements */
   instruction
       : variable_declaration SEMICOLON?                 #declarationStatement
       | expression SEMICOLON?                           #assignmentStatement
       | postfix_expression SEMICOLON?                   #expressionStatement
       | emit_statement                                  #emitStatement
       | class_declaration                               #classDeclaration
       | method_declaration                              #methodDeclaration
       | function_declaration                            #functionDeclaration
       | conditional_statements                          #conditionalStatement
       | interface_Declaration                           #interfaceDeclaration
       | generic_Type                                    #genericType
       | EXPORT variable_declaration SEMICOLON?          #exportStatement
       | UNEXPECTED_TOKEN                                #errorStatement
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
                : RETURN expression? eos?
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
