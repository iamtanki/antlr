grammar ge;

file : desc headers layers 'End' ;

desc : HEADCONTENT ;

headers : (head)+ ;

head :
       'Version' '=' HEADCONTENT
     | 'Description' '=' HEADCONTENT
     | 'Template' '=' HEADCONTENT
     | 'Size' '=' HEADCONTENT
     | 'background' '=' HEADCONTENT
     | 'backBmpFile' '=' HEADCONTENT
     | 'Period' '=' HEADCONTENT
     | 'leftfig' '=' HEADCONTENT
     | 'rightfig' '=' HEADCONTENT
     | 'downfig' '=' HEADCONTENT
     | 'upfig' '=' HEADCONTENT
     | 'TranslateKeyFile' '=' HEADCONTENT
     |  TEXT '=' HEADCONTENT
     ;

HEADCONTENT : TEXT LINE ;

layers : (layer)+ ;

layer : 'Layer' (TEXT)* 'LayerEnd' ;

ID : ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z|_] ;
fragment DIGIT : [0-9] ;


TEXT : ~[\r\n]+
     |
     ;

LINE : '\r'? '\n' ;

WS : [ \t\r\n]+ -> skip ;
