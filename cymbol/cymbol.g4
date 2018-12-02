grammar cymbol;

file : (varDecl | funcDecl)+;

varDecl : type ID ('=' expr)? ';' ;

type : 'float' | 'int' | 'void' ;

funcDecl : type ID '(' formalParameters? ')' block ;

formalParameters : formalParameter (',' formalParameter)* ;

formalParameter : type ID ;

block : '{' stat* '}' ;

stat : block  | varDecl | 'if' expr 'then' stat ('else' stat)?
	| 'return' expr? ';' | expr '=' expr ';' | expr ';'
    ;

expr :
     ID '(' exprList? ')'       # Call
     | expr '[' expr ']'        # Index
     | '-' expr                 # Negate
     | '!' expr                 # Not
	 | expr '*' expr            # Mult
     | expr ('+'|'-') expr      # AddSub
     | expr '==' expr           # Equal
	 | ID                       # Var
     | INT                      # Int
     | '(' expr ')'             # Parens
     ;

exprList : expr (',' expr )* ;


ID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z|_] ;

INT: [0-9]+ ;

FLOAT: DIGIT+ '.' DIGIT*  | '.' DIGIT+ ;
fragment DIGIT : [0-9];

STRING : '"'(ESC|.)*?'"';
fragment ESC : '\\"' | '\\\\' ;

LINE_COMMENT : '//' .*?  '\r'? '\n' -> skip ;

COMMENT : '/*' .*? '*/'   -> skip ;

WS : [ \t\r\n]+ -> skip ;
