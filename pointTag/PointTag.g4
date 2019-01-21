grammar PointTag ;

// 语法
prog : statements ;

statements : (statement SEMI)+ ;

statement :
            ifStat LP condition COMMA statement COMMA statement  RP   # IfStatement
          | value                                                     # Value_stat
          ;

ifStat :
         PREADD         # PreAdd
       | POSTADD        # PostAdd
       | REPLACE        # Replace
       | IF             # If
       ;

condition :
            (PRE|POST|INFIX) EQ value       # Cond
          ;

value :
         STRING
       | other_value
       ;

other_value : other+? ;

other : ~(STAR|STRING|LCB|RCB|COMMA|SEMI|LB|RB|QUOT|EQ) ;


// 词法

STRING : '"' .*? '"' ;

IF : 'if' ;
PREADD : 'preadd' ;
POSTADD : 'postadd' ;
REPLACE : 'replace' ;

PRE : 'pre' ;
POST : 'post' ;
INFIX : 'infix' ;

LINE : [\r\n]+ -> skip ;

WS : [ \t] -> skip ;

EQ : '=' ;
LB : '[' ;
RB : ']' ;
LP : '(' ;
RP : ')' ;
LCB : '{' ;
RCB : '}' ;
COMMA: ',' ;
SEMI : ';' ;
STAR : '*' ;
QUOT : '"' ;

CC : (.)+? ;
