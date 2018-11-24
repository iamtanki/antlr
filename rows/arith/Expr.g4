grammar Expr;
import commonLexerRules;

//语法
prog :  stat+ ;

stat : expr SEMI
     | ID '=' expr SEMI;

expr : expr ('*'|'/') expr
     | expr ('+'|'-') expr
     | INT
     | ID
     | '(' expr ')'  ;
