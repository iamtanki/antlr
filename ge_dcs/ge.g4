grammar GE;

// 语法
file : layer+ END ;

layer : LAYER ID objs LAYEREND ;

objs : OBJSTART expr*  OBJEND ;

expr :
       ID EQ 

// 词法
LAYER : 'Layer' ;
LAYEREND : 'LayerEnd' ;
OBJSTART : 'Obj' ID ;
OBJEND : 'ObjEnd' ;
END : 'END' ;
EQ : '=' ;

LINE : '\r'? '\n' ;

WS : [\t\r\n]+ -> skip ;

ID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z|_] ;
fragment DIGIT : [0-9] ;
