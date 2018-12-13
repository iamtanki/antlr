grammar GE_Expr ;

// 语法
prog : assign+ ;

assign : id WS* EQ WS* ( expr (WS* ',' WS* expr)* )? LINE ;

expr :
       id WS* '(' exprList? ')'                        # Call
     | RGB '[' exprList? ']'                       # Index
     | parenthesis                                  # Paren
     | number                                         # Num
     | STRING                                      # String
     | text+                                       # Wenben
     |                                             #Empty
     ;

id :
     ID
   | EXID ;

number : NUMBER ;

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
     | [fF][iI][lL][lL][cC][oO][lL][oO][rR]INT
     | [cC][oO][lL][oO][rR]INT
     | [aA][rR][rR][oO][wW]
     | [sS][zZ]
     | [rR][mM]
     | [bB][rR][uU][sS][hH]
     | [tT][oO][pP]
     | [bB][aA][sS][eE]
     ;


ID :
     [uU][pP][tT]
   | [uU][pP]
   | [fF][iI][lL][lL][bB][mM][pP]
   | [bB][mM][pP]
   | [cC][mM][dD]
   | [sS][tT][cC]
   | [aA][cC][cC]
   | [pP][rR][oO][nN]
   | [pP][nN][tT]
   | [pP][aA][rR][aA]
   | [fF][nN][tT]
   | [dD][yY][nN]
   | [aA][uU][tT][oO][wW][rR][aA][pP]
   | [tT][rR][aA][nN][sS][lL][aA][tT][eE]
   | [sS][tT][rR]
   ;

NUMBER : [+-]? INT '.' INT EXP? | [+-]? INT EXP? ;
fragment EXP : [eE] [+-]? INT ;

INT: [0-9]+ ;

LINE : '\r' '\n' | '\n' ;

WS : [ \t]+  ;

CC : (.)+? ;

//TEXT : ~[,\r\n]+ ;
