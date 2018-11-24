lexer grammar commonLexerRules;

// 词法  '\r'?

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

ID : [a-zA-Z]+ ;
INT  : [0-9]+ ;
SEMI : ';' ;
NEWLINE : '\r'? '\n' -> skip ;
WS      : [ \t]+ -> skip   ;
