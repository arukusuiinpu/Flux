grammar Flux;

program:   (declaration)+ EOF ;

declaration
    :   functionDecl
    |   varDecl ';'
    ;

type:   'float' | 'double' | 'int' | 'bool' | 'void' | ID ;

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

block: '{' statement* '}' ;

statement
    :   block                                                   # BlockStatement
    |   varDecl ';'                                             # VarDeclStatement
    |   'if' '(' expression ')' block ('else' block)?           # IfStatement
    |   'return' expression? ';'                                # ReturnStatement
    |   assignmentStat ';'                                      # AssignmentStatement
    |   expression ';'                                          # ExpressionStatement
    ;

assignmentStat
    :   ID ('[' expression ']')? '=' expression
    ;

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
    |   ID '(' expressionList? ')'                              # FunctionCallExpr
    |   ID '[' expression ']'                                   # ArrayAccessExpr
    |   ID                                                      # IdExpr
    |   INT                                                     # IntExpr
    |   DECIMAL                                                 # DecimalExpr
    |   BOOL                                                    # BoolExpr
    ;

expressionList : expression (',' expression)* ;

INT :   [0-9]+ ;
DECIMAL : [0-9]+ '.' [0-9]+ ('f' | 'F' | 'd' | 'D')? ;
BOOL : ('true' | 'false') ;
ID  :   (LETTER | '_') (LETTER | [0-9] | '_')* ;

fragment LETTER : [a-zA-Zа-яА-Я] ;

WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;

ML_COMMENT
    :   '/*' .*? '*/' -> skip
    ;
