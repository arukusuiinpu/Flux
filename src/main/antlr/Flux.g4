grammar Flux;

program:    (declaration | statement | terminator)* EOF ;

declaration
    :   importDecl terminator
    |   functionDecl
    |   varDecl terminator
    ;

type:   type '<' type? '>' | VAR | qualifiedId ;

terminator : TERMINATOR+ ;

accessModifier : 'public' | 'protected' | 'private' ;
unfinishedMd : 'unfinished' | 'illegal' ;
implementationModifier : 'abstract' | 'static' | 'native' ;
staticMd : 'static' ;
finalMd : 'final' ;
transientMd : 'transient' ;
volatileMd : 'volatile' ;
synchronizedMd : 'synchronized' ;
nativeMd : 'native' ;
strictfpMd : 'strictfp' ;

importDecl
    :   ('import' | 'using') qualifiedId (wildcard=WILDCARD)?
    |   ('import' | 'using') 'static' qualifiedId (wildcard=WILDCARD)?
    ;

variableModifiers
    :
    accessModifier?
    unfinishedMd?
    staticMd?
    finalMd?
    transientMd?
    volatileMd?
    ;

localVarDecl
    :   VAR? ID '=' expression                                 # LooselyTypedLocalVar
    |   type ID ('=' expression)?                               # StrictlyTypedLocalVar
    ;

varDecl
    :   variableModifiers localVarDecl
    ;

functionModifiers
    :
    accessModifier?
    unfinishedMd?
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
        VOID ID '(' formalParameters? ')' voidBlock             # RunnableFunctionDecl
    |   functionModifiers
        VAR? ID '(' formalParameters? ')' returnBlock           # VarFunctionDecl
    |   functionModifiers
        type ID '(' formalParameters? ')' returnBlock           # ConsumerFunctionDecl
    ;



formalParameters
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type ID
    ;

// TODO allow for statements to not need the last terminator
//  (ex. string NewFunc(string str) { return str.repeat(7); System.out.println(wow) } )
voidBlock : FIGURE_BRACKET_L voidLines FIGURE_BRACKET_R ;
returnBlock : FIGURE_BRACKET_L expressionLines FIGURE_BRACKET_R ;

voidLines : (statement | voidReturn | terminator)* ;
expressionLines : (statement | expressionReturn | terminator)* ;

block
    :   voidBlock                                               # VoidBlockOption
    |   returnBlock                                             # ReturnBlockOption
    ;

expressionReturn : 'return' expression terminator ;
voidReturn : 'return' terminator ;

statement
    :   functionDecl                                            # FunctionDeclStatement
    |   voidBlock                                               # VoidBlockStatement
    |   'for' '(' localVarDecl terminator expression terminator assignmentStat ')' block # ForStatement
    |   ('for' | 'foreach') '(' type? ID (':' | 'in') expression ')' block # ForeachStatement
    |   'if' '(' expression ')' block terminator? (('else if' | 'elif') '(' expression ')' block)* terminator? ('else' else=block)? # IfStatement
    |   varDecl terminator                                      # VarDeclStatement
    |   assignmentStat terminator                               # AssignmentStatement
    |   expression terminator                                   # ExpressionStatement
    |   expressionReturn                                        # ExpressionReturnStatement
    |   voidReturn                                              # VoidReturnStatement
    ;

assignmentStat
    :   qualifiedId operator=
    ( '='   | '+='  | '-='  | '*='
    | '/='  | '%='  | '&='  | '^='
    | '|='  | '<<=' | '>>=' | '>>>='
    ) expression                                                # DefaultAssigmnent
    |   qualifiedId operator='**=' expression                   # ExpAssigmnent
    |   qualifiedId operator='***=' expression                  # TetrAssigmnent
    |   qualifiedId operator='/%=' expression                   # FloorDivAssigmnent
    |   qualifiedId operator='%/=' expression                   # CeilDivAssigmnent
    |   qualifiedId operator=('++' | '--')                      # UnaryAssigmnent
    ;

expression
    :   '(' expression ')'                                      # ParenthesizedExpr
    |   '[' expressionList? ']'                                 # ArrayExpr // TODO Implement
    |   expression operator=('++' | '--')                       # PostfixExpr
    |   '(' type ')' expression                                 # CastExpr
    |   expression ('**' | '^') expression                      # ExpExpr

    // Please don't ask me about tetration, it only got here because it needed
    // a custom way of handling it, useful for many other future features
    |   expression ('***' | '^^') expression                    # TetrExpr

    |   operator=('++' | '--' | '+' | '-' | '~') expression     # UnaryExpr
    |   ('!' expression | 'not' '(' expression ')')             # NotExpr
    |   expression operator=('*' | '/' | '%') expression        # MulDivExpr
    |   expression operator='/%' expression                     # FloorDivExpr
    |   expression operator='%/' expression                     # CeilDivExpr
    |   expression operator=('+' | '-') expression              # AddSubExpr
    |   expression operator=('<<' | '>>' | '>>>') expression    # ShiftExpr
    |   expression operator=('<' | '>' | '<=' | '>=') expression # RelationalExpr
    |   expression operator='instanceof' expression             # RelationalExpr
    |   expression operator=('==' | '!=') expression            # EqualityExpr
    |   expression '&' expression                               # BitwiseANDExpr
    |   expression '^' expression                               # BitwiseXORExpr
    |   expression '|' expression                               # BitwiseORExpr
    |   expression ('&&' | 'and') expression                    # LogicalANDExpr
    |   expression ('||' | 'or') expression                     # LogicalORExpr
    |   expression '?' expression ':' expression                # TernaryExpr
    |   'new' type '(' expressionList? ')' block?               # CreationExpr
    |   qualifiedId '(' expressionList? ')'                     # FunctionCallExpr
    |   qualifiedId '[' expression ']'                          # ArrayAccessExpr
    |   expression '.' expression                               # VariableAccessExpr

    // All of the expressions below must have an autoType in the
    // JavaCodeGeneratorVisitor.getAutoType(Object object) function
    |   qualifiedId                                             # IdExpr
    |   INT                                                     # IntExpr
    |   DECIMAL                                                 # DecimalExpr
    |   BOOL                                                    # BoolExpr
    |   STRING                                                  # StringExpr
    |   CHAR                                                    # CharExpr
    ;

expressionList : expression (',' expression)* ;

CHAR : '\'' ( ESC_SEQ | ~[\\\r\n'] ) '\'' ;

STRING
    : '"'  ( ESC_SEQ | ~[\\\r\n"] )* '"'
    | '\'' ( ESC_SEQ | ~[\\\r\n'] )* '\''
    ;

fragment ESC_SEQ
    : '\\' [btnfr"'\\]
    | '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment HEX_DIGIT : [0-9a-fA-F] ;

INT :   [0-9]+ ;
DECIMAL : [0-9]+ ('.' [0-9]+)? ('f' | 'F' | 'd' | 'D')? ;
BOOL : ('true' | 'false') ;
WILDCARD : '.*' ;

VOID : 'void' ;
VAR : 'var' ;

 // Added these two bad boys because it's funny
FIGURE_BRACKET_L : '<%' | '{' ;
FIGURE_BRACKET_R : '%>' | '}' ;

ID  :   SYMBOL (SYMBOL | [0-9])* ;
SYMBOL : (LETTER | '_' | '$') ;
TERMINATOR : ';' | ( '\r'? '\n' ) ;
qualifiedId : ID ('.' ID)* ;

fragment LETTER : [a-zA-Zа-яА-Я] ;

NL : ( '\r'? '\n' ) ;
WS : [ \t]+ -> skip ;

SL_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN) ;

ML_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
