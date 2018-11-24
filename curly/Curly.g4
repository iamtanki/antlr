grammar Curly;

// 语法
stat :
     '{' '}'
     | '{' expr (',' expr)* '}';

expr : stat
       | DIGIT ;


// 词法
DIGIT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip;

