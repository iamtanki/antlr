lexer grammar commonLexerRules;

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
