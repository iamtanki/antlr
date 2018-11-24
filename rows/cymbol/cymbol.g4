grammar cymbol;

file : (varDecl | funcDecl)+;

varDecl : type ID ('=' expr)? ';' ;

type : 'float' | 'int' | 'void' ;

funcDecl : type ID '(' formalParameters ')' block ;

formalParameters : formalParameter (',' formalParameter)* ;

formalParameter : type ID ;

block : '{' stat* '}' ;

stat : block  | varDecl | 'if' expr 'then' stat ('else' stat)?
	| 'return' expr? ';' | expr '=' expr ';' | expr ';'
    ;

expr : ID '(' exprList? ')' | expr '[' expr ']' | '-' expr | '!' expr
		| expr '*' expr | expr ('+'|'-') expr | expr '==' expr
		| ID | INT | '(' expr ')'
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
