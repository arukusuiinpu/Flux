grammar Flux;

program:   terminator? (declaration | terminator)* EOF ;

declaration
    :   importDecl terminator
    |   functionDecl
    |   varDecl terminator
    ;

type:   'float' | 'double' | 'int' | 'bool' | 'string' | 'void' | qualifiedId ;

terminator : TERMINATOR+ ;

accessModifier : 'public' | 'protected' | 'private' ;
implementationModifier : 'abstract' | 'static' | 'native' ;
staticMd : 'static' ;
finalMd : 'final' ;
transientMd : 'transient' ;
volatileMd : 'volatile' ;
synchronizedMd : 'synchronized' ;
nativeMd : 'native' ;
strictfpMd : 'strictfp' ;

importDecl
    :   'import' qualifiedId (wildcard=WILDCARD)?
    |   'import static' qualifiedId (wildcard=WILDCARD)?
    ;

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
        'void' ID '(' formalParameters? ')' voidBlock           # RunnableFunctionDecl
    |   functionModifiers
        type ID '(' formalParameters? ')' returnBlock           # ConsumerFunctionDecl
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type ID
    ;

// TODO allow for statements to not need the last terminator (ex. string NewFunc(string str) { return str.repeat(7); System.out.println(wow) } )
voidBlock : '{' (statement | terminator)* voidReturn* '}' ;
returnBlock : '{' (statement | terminator)* expressionReturn* '}' ;

block
    :   returnBlock                                             # ReturnBlockOption
    |   voidBlock                                               # VoidBlockOption
    ;

expressionReturn : 'return' expression terminator? ;
voidReturn : 'return' terminator? ;

statement
    :   '(' statement ')'                                       # ParenthesizedStatement
    |   voidBlock                                               # VoidBlockStatement
    |   returnBlock                                             # ReturnBlockStatement
    |   varDecl terminator                                      # VarDeclStatement
    |   'if' '(' expression ')' block ('else' block)?           # IfStatement
    |   expressionReturn                                        # ExpressionReturnStatement
    |   voidReturn                                              # VoidReturnStatement
    |   functionDecl                                            # FunctionDeclStatement
    |   assignmentStat terminator                               # AssignmentStatement
    |   expression terminator                                   # ExpressionStatement
    ;

assignmentStat
    :   qualifiedId ('[' expression ']')? '=' expression
    ;

expression
    :   '(' expression ')'                                      # ParenthesizedExpr
    |   '[' expression ']'                                      # SqParenthesizedExpr // TODO Implement
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
    |   qualifiedId '(' expressionList? ')'                     # FunctionCallExpr
    |   qualifiedId '[' expression ']'                          # ArrayAccessExpr
    |   expression '.' expression                               # VariableAccessExpr
    |   qualifiedId                                             # IdExpr
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
SYMBOL : (LETTER | '_') ;
WILDCARD : '.*' ;

ID  :   SYMBOL (SYMBOL | [0-9])* ;
qualifiedId : ID ('.' ID)* ;

fragment LETTER : [a-zA-Zа-яА-Я] ;

NL : ( '\r'? '\n' ) ;
WS : [ \t]+ -> skip ;

SL_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN) ;

ML_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
