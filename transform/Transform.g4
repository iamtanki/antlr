grammar Transform;

// 语法
transform : ( WS* sentence WS* )+ ;

sentence :
            TRANSLATE LP valueList  RP
         |  ROTATE  LP valueList  RP
         |  MATRIX LP valueList  RP
         |  SKEWX  LP valueList  RP
         |  SKEWY  LP valueList  RP
         |  SCALE  LP valueList  RP
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
