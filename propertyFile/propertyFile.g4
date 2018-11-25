grammar propertyFile ;

import commonLexerRules;

@members{
    void startFile() {}
    void finishFile() {}
    void defineProperty(Token name, Token value) {}
}

file : {startFile();} prop+ {finishFile();} ;

prop : ID '=' STRING ';' {defineProperty($ID, $STRING);} ;
