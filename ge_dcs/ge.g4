grammar GE;

file : TEXT* ;

EQ : '=' -> skip;

TEXT : (~[=\r\n])+ ;

LINE : '\r'? '\n' ;

WS : [ \t\r\n]+ -> skip ;
