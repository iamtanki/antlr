grammar PointTag ;

// 语法
prog : statement+ ;

statement : expr SEMI ;

expr :
            IF LP condition COMMA expr COMMA expr  RP          # Expr_If
          | PREADD LP condition COMMA expr COMMA expr  RP      # Expr_PreAdd
          | POSTADD LP condition COMMA expr COMMA expr  RP     # Expr_PostAdd
          | REPLACE LP condition COMMA expr COMMA expr  RP     # Expr_Replace
          | value                                              # Expr_Value
          ;

condition :
            op=(PRE|POST|INFIX) EQ value       # Cond
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
