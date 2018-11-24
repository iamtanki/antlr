grammar LabeledExpr;
import commonLexerRules;

//语法
prog :  stat+ ;

stat : expr SEMI                # printExpr
     | ID '=' expr SEMI         # assign
     ;

expr : expr op=('*'|'/') expr      # MulDiv
     | expr op=('+'|'-') expr      # AddSub
     | INT                      # int
     | ID                       # id
     | '(' expr ')'             # parens
     ;
