grammar Transform;

// 语法
transform : ( WS* sentence WS* )+ ;

sentence :
           funcname  LP valueList  RP
           ;

funcname :
            TRANSLATE
          | ROTATE
          | MATRIX
          | SKEWX
          | SKEWY
          | SKEW
          | SCALE
          ;

value :
        NUMBER
       |
       ;

valueList : value ( ((WS* COMMA WS*) |WS+ | COMMA)  value )* ;


// 词法
LP : '(' ;
RP : ')' ;
WS : ' '+ ;
COMMA : ',' ;

MATRIX : 'matrix' ;
TRANSLATE : 'translate' ;
ROTATE : 'rotate' ;
SCALE : 'scale' ;
SKEWX : 'skewX' ;
SKEWY : 'skewY' ;
SKEW : 'skew' ;

NUMBER : [+-]? INT '.' INT EXP? | [+-]? INT EXP? ;
fragment EXP : [eE] [+-]? INT ;

INT: [0-9]+ ;

LINE : ('\r' '\n' | '\n') -> skip ;  
