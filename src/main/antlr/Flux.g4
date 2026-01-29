grammar Flux;

program:   terminator? (declaration | terminator)* EOF ;

declaration
    :   functionDecl
    |   varDecl terminator
    ;

type:   'float' | 'double' | 'int' | 'bool' | 'string' | 'void' | ID ;

terminator : TERMINATOR+ ;

accessModifier: 'public' | 'protected' | 'private' ;
implementationModifier: 'abstract' | 'static' | 'native' ;
staticMd : 'static' ;
finalMd : 'final' ;
transientMd : 'transient' ;
volatileMd : 'volatile' ;
synchronizedMd : 'synchronized' ;
nativeMd : 'native' ;
strictfpMd : 'strictfp' ;

variableModifiers
    :
    accessModifier?
    staticMd?
    finalMd?
    transientMd?
    volatileMd?
    ;

varDecl
    :   variableModifiers type ID ('=' expression)?
    ;

functionModifiers
    :
    accessModifier?
    implementationModifier?
    finalMd?
    transientMd?
    volatileMd?
    synchronizedMd?
    nativeMd?
    strictfpMd?
    ;

functionDecl
    :   functionModifiers
        type ID '(' formalParameters? ')' block
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type ID
    ;

block: '{' (statement | terminator)* '}' ;

statement
    :   block                                                   # BlockStatement
    |   varDecl terminator                                      # VarDeclStatement
    |   'if' '(' expression ')' block ('else' block)?           # IfStatement
    |   'return' expression? terminator                         # ReturnStatement
    |   functionDecl                                            # FunctionDeclStatement
    |   assignmentStat terminator                               # AssignmentStatement
    |   expression terminator                                   # ExpressionStatement
    ;

assignmentStat
    :   qualifiedName ('[' expression ']')? '=' expression
    ;

qualifiedName : ID ('.' ID)* ;

expression
    :   '(' expression ')'                                      # ParenthesizedExpr
    |   '[' expression ']'                                      # SqParenthesizedExpr // Not Implemented
    |   expression operator=('++' | '--')                       # PostfixExpr
    |   '(' type ')' expression                                 # CastExpr
    |   expression '**' expression                              # ExpExpr
    |   operator=('++' | '--' | '+' | '-' | '~') expression     # UnaryExpr
    |   ('!' expression | 'not' '(' expression ')')             # NotExpr
    |   expression operator=('*' | '/' | '%') expression        # MulDivExpr
    |   expression operator=('+' | '-') expression              # AddSubExpr
    |   expression operator=('<<' | '>>' | '>>>') expression    # ShiftExpr
    |   expression operator=('<' | '>' | '<=' | '>=' | 'instanceof') expression  # RelationalExpr
    |   expression operator=('==' | '!=') expression            # EqualityExpr
    |   expression '&' expression                               # BitwiseANDExpr
    |   expression '^' expression                               # BitwiseXORExpr
    |   expression '|' expression                               # BitwiseORExpr
    |   expression ('&&' | 'and') expression                    # LogicalANDExpr
    |   expression ('||' | 'or') expression                     # LogicalORExpr
    |   expression '?' expression ':' expression                # TernaryExpr
    |   qualifiedName '(' expressionList? ')'                   # FunctionCallExpr
    |   qualifiedName '[' expression ']'                        # ArrayAccessExpr
    |   qualifiedName                                           # IdExpr
    |   INT                                                     # IntExpr
    |   DECIMAL                                                 # DecimalExpr
    |   BOOL                                                    # BoolExpr
    |   STRING                                                  # StringExpr
    ;

expressionList : expression (',' expression)* ;

TERMINATOR : ';' | ( '\r'? '\n' )+ ;
INT :   [0-9]+ ;
DECIMAL : [0-9]+ '.' [0-9]+ ('f' | 'F' | 'd' | 'D')? ;
BOOL : ('true' | 'false') ;
STRING : '"' ( '\\' . | ~[\\\r\n"] )* '"' ;
ID  :   (LETTER | '_') (LETTER | [0-9] | '_')* ;

fragment LETTER : [a-zA-Zа-яА-Я] ;

NL : ( '\r'? '\n' ) ;
WS : [ \t]+ -> skip ;

SL_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN) ;

ML_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
