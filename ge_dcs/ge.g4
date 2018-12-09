grammar GE;

// 语法
file : layer+ LINE* END LINE*;

layer : LAYER ID LINE* objs* LINE* LAYEREND LINE*;

objs : OBJSTART LINE* expr* LINE* OBJEND LINE* ;

expr :
       ID EQ TEXT LINE ;

// 词法
LAYER : 'Layer' ;
LAYEREND : 'LayerEnd' ;
OBJSTART : 'ObjAlmHis' ;
OBJEND : 'ObjEnd' ;
END : 'END' ;
EQ : '=' ;

ID : [a-zA-Z]+ ;

LINE : '\r'? '\n' ;

WS : (' ' | '\t' | '\r')+ -> skip ;

WSLINE : [ \t]* '\r'? '\n' -> skip;


TEXT : ~[\r\n]+? ;
