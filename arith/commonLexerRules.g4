lexer grammar commonLexerRules;

// 词法  '\r'?

ID : [a-zA-Z]+ ;
INT  : [0-9]+ ;
SEMI : ';' ;
NEWLINE : '\r'? '\n' -> skip ;
WS      : [ \t]+ -> skip   ;
