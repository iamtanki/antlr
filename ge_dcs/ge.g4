grammar GE;

// 语法
file :  layer+ ;

layer : layerdef objs layerend ;

objs : obj* ;

obj : objstart expr*  objend ;

expr :
       obj
     | upt
     | TEXT LINE ;

upt : UPT WS* EQ WS* TEXT LINE ;

layerend : LAYEREND LINE;
layerdef : LAYERDEF LINE;

objend : OBJEND LINE ;
objstart : OBJSTART LINE ;

end : END LINE* ;

// 词法
END : 'END' ;

UPT : [uU][pP][tT] ;

LAYEREND : 'LayerEnd' ;
LAYERDEF : 'Layer' WS+ ID ;

OBJEND : 'ObjEnd' ;
OBJSTART : 'Obj' ID  ;

EQ : '=' ;

ID : [a-zA-Z]+ ;

LINE : '\r'? '\n' ;

WS : ('\t' | ' ')+ -> skip ;

TEXT : (~[\r\n]+?)+ ;
