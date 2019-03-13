grammar GE;

// 语法
file :  layer+ ;

layer : layerdef objs layerend
      | libdef libhead objs libend
      ;

objs : obj* ;

obj :
      objgroup expr* objend     # OGroup
    | objstart expr*  (objend | objend objend)    # ObjOther
    ;

objgroup : OBJGROUP LINE ;

libhead : (TEXT LINE)+ ;

expr :
        obj                 # EObj
      | TEXT LINE           # EText
     ;

layerend : LAYEREND LINE ;
layerdef : LAYERDEF LINE ;

libend : LIBEND LINE ;
libdef : LIBDEF LINE ;

objend : OBJEND LINE ;
objstart : OBJSTART LINE ;
// objtrend : OBJTREND LINE ;

// 词法

EQ : '=' ;

LIBEND : 'LibEnd' ;
LIBDEF : 'LibDef' ',' TEXT ;

// OBJTREND : 'Obj'[tT][rR][eE][nN][dD] ;
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
