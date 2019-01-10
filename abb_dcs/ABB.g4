grammar ABB ;

// 语法
fgr : obj+ ;

obj : objname objbody ;

objname : LB (exprlist)* RB ;

objbody : LCB sentence*? RCB  ;

id :
     ID
   | NUMBER
   | STRING
   ;

sentence :
           (text SEMI)
         ;

exprlist : id (',' id)* ;

text : (~(SEMI))+ ;

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

LINE : [\r\n]+ -> skip ;

WS : [ \t]+ -> skip ;

CC : (.)+? ;
