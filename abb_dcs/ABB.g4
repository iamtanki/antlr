grammar ABB ;

// 语法
fgr : obj+ ;

obj : objname objcontent ;

objname : LB (exprlist)* RB ;

objcontent : LCB (sentence)* RCB  ;

id :
     ID
   | NUMBER
   | STRING
   ;

sentence : CC SEMI ;

exprlist : id (',' id)* ;

// 词法

STRING :  '"' .*? '"' ;

LB : '[' ;
RB : ']' ;
LCB : '{' ;
RCB : '}' ;
LP : '(' ;
RP : ')' ;
SEMI : ';' ;

LETTER : [a-zA-Z] ;

ID : LETTER(LETTER|INT)* ;

NUMBER : [+-]? INT '.' INT EXP? | [+-]? INT EXP? ;
fragment EXP : [eE] [+-]? INT ;

INT: [0-9]+ ;


WS : [ \t] -> skip;

LINE : ('\r' '\n' | '\n') -> skip ;

CC : (.)+? ;
