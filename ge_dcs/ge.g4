grammar ge;

file : headers layers 'End' ;

headers : (head)+ ;

head :
     
     | HEADCONTENT
     ;

HEADCONTENT : TEXT LINE ;

layers : (layer)+ ;

layer : 'Layer' (TEXT)* 'LayerEnd' ;


ID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z|_] ;
fragment DIGIT : [0-9] ;


TEXT : ~[\r\n]+
     |
     ;

LINE : '\r'? '\n' ;

WS : [ \t\r\n]+ -> skip ;
