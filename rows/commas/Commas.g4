grammar Commas;

file : (row NL)+ ;

row : (STUFF (',' STUFF)*) ;

STUFF : ~[\n]+ ;
NL : [\n]+ ;
