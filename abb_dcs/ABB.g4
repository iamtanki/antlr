grammar ABB ;

// 语法
fgr : obj+ ;

obj : objname objbody ;

objname : LB (arglist)* RB ;

objbody : LCB sentence*? RCB  ;

sentence :
           objcall SEMI         # Objcall_sent
         | text SEMI            # Text_sent
         ;

arglist : id (',' id)* ;

objcall :
           id (arglist)*        # Objcall_sent_id
         | arglist*             # Objcall_sent_args
         ;

id :
      OBJID             # Obj_id
   |  CALLID            # Call_id
   |  ID                # Other_id
   |  NUMBER            # Num_id
   |  STRING            # Str_id
   ;

text : (~(SEMI))+ ;

// 词法

STRING :  '"' .*? '"' ;

LINE : [\r\n]+ -> skip ;

WS : [ \t] -> skip ;

OBJID :
        'AML'
      | 'DMF'
      | 'ELP'
      | 'FGR'
      | 'TXL' | 'TCN' | 'TXT'
      | 'LIN'
      | 'MSL'
      | 'PIL' | 'PLN' | 'PLG'
      | 'REC'
      ;

CALLID :
         'ATT' | 'ATR' | 'ANG'
       | 'COL' | 'COO'
       | 'DIR'
       | 'EDV'
       | 'FIL' | 'FIX'
       | 'MFV'
       | 'NCO'
       | 'ODB' | 'OBJS' | 'OBJ'
       | 'SIZ' | 'SIF'
       | 'TIM' | 'TXI'
      ;

LB : '[' ;
RB : ']' ;
LCB : '{' ;
RCB : '}' ;
LP : '(' ;
RP : ')' ;
SEMI : ';' ;

LETTER : [a-zA-Z] ;

ID : LETTER(LETTER|INT)* ;

NUMBER : [+-]? INT '.' INT EXP? | [+-]? INT EXP? ;
fragment EXP : [eE] [+-]? INT ;

INT: [0-9]+ ;


CC : (.)+? ;
