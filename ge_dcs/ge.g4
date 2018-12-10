grammar GE;

// 语法
file :  layer+ END;

layer : layerdef objs  layerend;

objs : obj* ;

obj : objstart expr*  objend ;

expr :
      TEXT LINE* ;

layerend : LAYEREND LINE;
layerdef : LAYERDEF LINE;

objend : OBJEND ;
objstart : OBJSTART ;


// 词法

LAYEREND : 'LayerEnd' ;
LAYERDEF : 'Layer' WS+ ID ;

OBJEND : 'ObjEnd' LINE* ;
OBJSTART : 'Obj' ID LINE* ;

END : 'END' LINE*;
EQ : '=' ;

ID : [a-zA-Z]+ ;

LINE : '\r'? '\n' ;

WS : ('\t' | ' ')+ -> skip ;

TEXT : (~[\r\n]+?)+ ;
