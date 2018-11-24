grammar Rows;

@parser::members{
    int col;
    public RowsParser(TokenStream input, int col){
           this(input);
           this.col = col;
    }
}

file : (row SEMI)+ ;

row
locals[int i=0] :
(
    STUFF{
        $i++;
        if($i == col) System.out.println($STUFF.text);
    }

)+  ;

WS : [ \t\r\n] -> skip ;
SEMI : ';' ;
STUFF : ~[ \t\r\n';']+ ;
