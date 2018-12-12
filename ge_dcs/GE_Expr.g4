grammar GE_Expr ;

// 语法
prog : assign+ ;

assign : id WS* EQ WS* ( expr (WS* ',' WS* expr)* )? LINE ;

expr :
       id WS* (parenthesis)?                         # Call
     | RGB '[' exprList? ']'                       # Index
     | parenthesis                                  # Paren
     | INT                                         # Int
     | STRING                                      # String
     | text+                                       # Wenben
     |                                             #Empty
     ;

id : EXID | ID ;

parenthesis : WS* '(' WS* exprList? WS* ')' ; 

exprList : expr (WS* ',' WS* expr )*  ;

text : (~(LINE|',') | CC )+ ;

// 词法
EQ : '=' ;
STRING :  '"' .*? '"' ;

RGB : [rR][gG][bB] ;

EXID :
       [pP][eE][nN]
     | [uU][pP]
     | [pP][tT]INT
     | [pP][oO][kK][eE]
     | [cC][oO][lL][oO][rR]INT
     | [aA][rR][rR][oO][wW]
     | [sS][zZ]
     | [rR][mM]
     | [bB][rR][uU][sS][hH]
     ;


ID :
     [uU][pP][tT]
   | [uU][pP]
   | [bB][mM][pP]
   | [cC][mM][dD]
   | [sS][tT][cC]
   | [aA][cC][cC]
   | [pP][aA][rR][aA]
   | [pP[nN][tT]
   | [fF][nN][tT]
   | [dD][yY][nN]
   | [aA][uU][tT][oO][wW][rR][aA][pP]
   | [tT][rR][aA][nN][sS][lL][aA][tT][eE]
   | [sS][tT][rR]
   ;

INT: [+-]?[0-9]+ ;

LINE : '\r' '\n' | '\n' ;

WS : [ \t]+  ;

CC : (.)+? ;

//TEXT : ~[,\r\n]+ ;
