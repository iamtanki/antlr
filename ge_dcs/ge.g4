grammar GE;

// 语法
file : layer+ LINE* END LINE*;

layer : LINE* LAYERDEF LINE* objs* LINE* LAYEREND LINE*;

objs : LINE* OBJSTART LINE* expr* LINE* OBJEND LINE* ;

expr :
      LINE* ID EQ TEXT LINE* ;

// 词法
LAYERDEF : 'Layer' ID ;
LAYEREND : 'LayerEnd' ;
OBJSTART : 'Obj' ID ;
OBJEND : 'ObjEnd' ;
END : 'END' ;
EQ : '=' ;

ID : [a-zA-Z]+ ;

LINE : '\r'? '\n' ;

WS : ('\t')+ -> skip ;

WSLINE : [ \t]* '\r'? '\n' -> skip;

TEXT : ~[\r\n]+? ;
