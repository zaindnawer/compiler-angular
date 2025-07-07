parser grammar parserZain;

options { tokenVocab=lexerZain; }

program: statement+;

statement   :
             componentDeclaration
            |classDeclaration
            | interfaceDeclaration
            | methodDeclaration
            | variableDeclaration
            | importDeclaration
            ;

componentDeclaration
    : DECORATOR COMPONENT LPAREN LBRACE componentDeclarationBody RBRACE RPAREN
     ;
    componentDeclarationBody
        : (componentBodyElement COMMA? (COMMA componentBodyElement)* )?;

    componentBodyElement
        : selector
        | standalone
        | importDeclaration
        | template
        | styles;

selector :SELECTOR COLON STRING_LIT ;
standalone : STANDALONE COLON isboolean;

template
    : TEMPLATE COLON_HTML BACKTICK_HTML  element* END_TEMPLATE
    ;

styles :STYLES COLON_CSS OPEN_LIST cssBody CLOSE_LIST COMMA? ;

isboolean :TRUE | FALSE;


classDeclaration :
    EXPORT? CLASS ID  classDeclarationBody
    ;

classDeclarationBody
    : LBRACE (classMember SEMICOLON?)* RBRACE
    ;

classMember
    : methodDeclaration
    | propertyDeclaration
    ;

propertyDeclaration
    : ID COLON type ASSIGN initvalue SEMICOLON?         #TypedAssignedProperty
    | ID COLON type  (OR ID ASSIGN ID)? SEMICOLON?     #OptionalTypedProperty
    ;

methodDeclaration
    : ID LPAREN parameterList? RPAREN COLON type? LBRACE methodBody RBRACE
    ;
methodBody :(statementMethod)* ;



statementMethod :
            ID ASSIGN expression SEMICOLON                               #AssignStatement
            | THIS DOT ID ASSIGN ID SEMICOLON                              #ThisAssignID
             | THIS DOT ID ASSIGN expression SEMICOLON                      #ThisAssignExpr
              | expression SEMICOLON                                         #ExprStatement
                     ;

interfaceDeclaration
    : INTERFACE ID LBRACE interfaceMember* RBRACE
    ;

interfaceMember
    : propertyDeclaration
    | methodDeclaration
    ;

parameter
    : ID COLON type
    ;
parameterList
    : parameter (COMMA parameter)*
    ;
variableDeclaration
    : (CONST | LET | VAR ) ID   ASSIGN expression
    ;

importDeclaration
        : IMPORT LBRACE ID RBRACE FROM STRING_LIT SEMICOLON             #ImportSingle
        | IMPORT LBRACE COMPONENT RBRACE FROM STRING_LIT SEMICOLON      #ImportComponent
        | IMPORTS COLON LBRACKET ID? RBRACKET                           #ImportArray
        ;



type        : STRING_TYPE
            | NUMBER_TYPE
            | BOOLEAN_TYPE
            | ANY_TYPE
            | VOID_TYPE
            | ID
            | list;

list
    : ID LBRACKET RBRACKET
    ;
bodylist
    : (initvalue (COMMA initvalue)*)?
    ;

object
    : LBRACE bodyobject RBRACE COMMA?
    ;

bodyobject
    : (ID COLON initvalue (COMMA ID COLON initvalue COMMA?)*)?

    ;

   initvalue
     : NUMBER_LIT
     | STRING_LIT
     | isboolean
     | LBRACKET bodylist RBRACKET
     | object
 ;

expression  : STRING_LIT
            | NUMBER_LIT
            | ID
            |isboolean
            | functionCall
            | variableDeclaration
            ;

functionCall
    : ID LPAREN argument* RPAREN
    ;

argument    : expression
            ;
element
    : tag
    | NAME_HTML (COLON_HTML)?
    | interpolation
    ;

tag
    : openingTag element* closingTag   #NormalTag
    | selfClosingTag                   #SelfTag
    ;

openingTag
    : TAG_OPEN_START_HTML attributes* TAG_CLOSE_END_HTML
    ;

closingTag
    : TAG_CLOSE_START_HTML NAME_HTML TAG_CLOSE_END_HTML
    ;

selfClosingTag
    : TAG_OPEN_START_HTML attributes* TAG_END_HTML
    ;

attributes
        : NAME_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML              #NormalAttr
        | STRUCTURAL_DIR_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML    #StructuralAttr
        | BINDING_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML           #BindingAttr
        | EVENT_BINDING_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML     #EventAttr
        ;

interpolation
    : INTERPOLATION_START_HTML NAME_HTML INTERPOLATION_END_HTML
    ;


    cssBody : BACKTICK_CSS  cssObjects  BACKTICK_CSS COMMA_CSS?;
cssObjects : csselement? (COMMA_CSS? csselement)*;
    csselement : DOT_CSS ID_CSS+ LBRACE_CSS bodyelement+ RBRACE_CSS;
    bodyelement : ID_CSS COLON_CSS cssValue SEMICOLON_CSS;
     cssValue : (PERCENT | ID_CSS) (ID_CSS ID_CSS?)? ;
