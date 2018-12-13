grammar GE_Expr ;

// 语法
prog : assign+ ;

assign : id WS* EQ WS* ( expr (WS* ',' WS* expr)* )? LINE ;

expr :
       id WS* '(' exprList? ')'                        # Call
     | RGB '[' exprList? ']'                       # Rgb
     | parenthesis                                  # Paren
     | number                                         # Num
     | STRING                                      # String
     | text+                                       # Wenben
     |                                             #Empty
     ;

id :
     ID         # Identy
   | EXID       # Exid
   ;

number : NUMBER ;

parenthesis : WS* '(' WS* exprList? WS* ')' ;

exprList : expr (WS* ',' WS* expr )* ;

text : (~(LINE|',') | CC )+ ;

// 词法
EQ : '=' ;
STRING :  '"' .*? '"' ;

RGB : [rR][gG][bB] ;

EXID :
       [pP][eE][nN]                                // # Pen
     | [uU][pP]                                    // # Up
     | [pP][tT]INT                                 // # Pt
     | [pP][oO][kK][eE]                            // # Poke
     | [bB][uU][tT][tT][oO][nN]                    // # Btn
     | [bB][kK][cC][oO][lL][oO][rR]                // # BkColor
     | [tT][eE][xX][tT][cC][oO][lL][oO][rR]        // # TxtColor
     | [fF][iI][lL][lL][cC][oO][lL][oO][rR]INT     // # FillColor
     | [cC][oO][lL][oO][rR]INT                     // # Color
     | [aA][rR][rR][oO][wW]                        // # Arrow
     | [sS][zZ]                                    // # Sz
     | [rR][mM]                                    // # Rm
     | [bB][rR][uU][sS][hH]                        // # Brush
     | [tT][oO][pP]                                // # Top
     | [bB][aA][sS][eE]                            // # Base
     ;


ID :
     [uU][pP][tT]
   | [uU][pP]
   | [fF][iI][lL][lL][bB][mM][pP]
   | [bB][mM][pP]
   | [bB][uU][tT]
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
