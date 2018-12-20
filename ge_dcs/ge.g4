grammar GE;

// 语法
file :  layer+ ;

layer : layerdef objs layerend ;

objs : obj* ;

obj :
      objgroup expr* objend     # OGroup
    | objstart expr*  objend    # ObjOther
    ;

objgroup : OBJGROUP LINE ;

expr :
        obj                 # EObj
      | TEXT LINE           # EText
     ;

layerend : LAYEREND LINE ;
layerdef : LAYERDEF LINE ;

objend : OBJEND LINE ;
objstart : OBJSTART LINE ;


// 词法

EQ : '=' ;

OBJGROUP : 'Obj'[gG][rR][oO][uU][pP] ;

LAYEREND : 'LayerEnd' ;
LAYERDEF : 'Layer' WS+ ID ;

OBJEND : 'ObjEnd' ;
OBJSTART : 'Obj' ID  ;

INT: [0-9]+ ;

LETTER : [a-zA-Z] ;

ID : LETTER(LETTER|INT)* ;

LINE : '\r' '\n' | '\n' ;

WS : ('\t' | ' ')+ ;

TEXT : (~[\r\n]+?)+ ;
