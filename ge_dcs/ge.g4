grammar GE;

// 语法
file :  layer+ ;

layer : layerdef objs layerend ;

objs : obj* ;

obj : objstart expr*  objend ;

expr :
        obj
      | TEXT LINE
     ;

layerend : LAYEREND LINE ;
layerdef : LAYERDEF LINE ;

objend : OBJEND LINE ;
objstart : OBJSTART LINE ;


// 词法

EQ : '=' ;

LAYEREND : 'LayerEnd' ;
LAYERDEF : 'Layer' WS+ ID ;

OBJEND : 'ObjEnd' ;
OBJSTART : 'Obj' ID  ;


ID : [a-zA-Z]+ ;

LINE : '\r'? '\n' ;

WS : ('\t' | ' ')+ -> skip ;

TEXT : (~[\r\n]+?)+ ;
