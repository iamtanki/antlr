grammar GE_Expr ;

// 语法
prog : assign+ ;

assign : ID  EQ  ( expr (',' expr)* )* LINE ;

expr :
     EXID '(' exprList? ')'       # Call
     | expr '[' expr ']'        # Index
     | '-' expr                 # Negate
     | '!' expr                 # Not
	 | ID                       # Var
     | INT                      # Int
     | '(' expr ')'             # Parens
//     | TEXT                     # Text
     ;

exprList : expr (',' expr )* ;

// 词法
EQ : '=' ;
STRING :  '"' .*? '"' ;

ID :
     [uU][pP][tT]
   | [sS][tT][cC]
   | [aA][cC][cC]
   | [pP][aA][rR][aA]
   | [fF][nN][tT]
   | [dD][yY][nN]
   | [aA][uU][tT][oO][wW][rR][aA][pP]
   | [tT][rR][aA][nN][sS][lL][aA][tT][eE]
   | [sS][tT][rR]
   ;


EXID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z|_] ;
fragment DIGIT : [0-9];

INT: [0-9]+ ;

LINE : '\r'? '\n' ;

// TEXT : (~[,\r\n]+?)+ ;

WS : [ \t]+ -> skip ;
