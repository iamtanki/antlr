grammer Cell

//语法
prog :  stat+ ;

stat : expr SEMI
     | ID '=' expr ;

expr : expr ('*'|'/') expr
     | expr ('+'|'-') expr
     | INT
     | ID
     | '(' expr ')'  ;


// 词法  '\r'?

ID : [a-zA-Z]+ ;
INT  : [0-9]+ ;
SEMI : ';' ;
NEWLINE : '\r'? '\n' -> skip ;
WS      : [ \t]+ -> skip   ;
