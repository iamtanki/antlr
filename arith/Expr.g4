grammar Expr;
import commonLexerRules;


//语法
prog :  stat+ ;

stat : expr SEMI
     | ID '=' expr SEMI;

expr : expr ('*'|'/') expr      #Mult
     | expr ('+'|'-') expr      #Add
     | INT                      #Int
     | ID                       #Id
     | '(' expr ')'             #Parenthesis
     ;
