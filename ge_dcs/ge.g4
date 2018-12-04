grammar GE;

file : headers layers 'End' ;

headers : head+ ;

head :
       TEXT LINE
     | TEXT EQ TEXT LINE
     | TEXT EQ LINE
     | EQ TEXT LINE
     | LINE
     ;

layers : layer+ ;

layer : LAYER ID* LINE* ;


LAYER : 'Layer' ;
LAYEREND : 'LayerEnd' ;

EQ : '=' ;

WS : [ \t]+ -> skip ;

LINE : '\r'? '\n' ;

ID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z|_] ;
fragment DIGIT : [0-9] ;

TEXT : ~[=\r\n]+ ;
