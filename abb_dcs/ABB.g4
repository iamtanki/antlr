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

// id,id 形式 为objcall_sent_args
// id id,id,id 为objcal_sent_id
objcall :
           id (arglist)*        # Objcall_sent_id
         | arglist*             # Objcall_sent_args
         ;

id :
      OBJID             # Obj_id
   |  CALLID            # Call_id
   |  STRING            # Str_id
   |  ID                # Other_id
   |  NUMBER            # Num_id

   ;

text : (~(SEMI)+) ;

// 词法

STRING : '"' .*? '"' ;

LINE : [\r\n]+ -> skip ;

WS : [ \t] -> skip ;

OBJID :
        'AML' | 'AA'
      | 'BUT'
      | 'DMF'
      | 'ELP'
      | 'FGR'
      | 'GS'
      | 'TXL' | 'TCN' | 'TXT'
      | 'LIN'
      | 'ODB'
      | 'MSL' | 'MOB'
      | 'PIL' | 'PLN' | 'PLG'
      | 'REC'
      | 'SGM'
      ;

CALLID :
         'ATT' | 'ATR' | 'ANG'
       | 'COL' | 'COO' | 'CO'INT
       | 'DIR'
       | 'EDV'
       | 'FIL' | 'FIX'
       | 'MFV' | 'MAKRO'
       | 'NCO' | 'NPA'
       | 'OBJS' | 'OBJ'
       | 'POS'
       | 'SIZ' | 'SIF' | 'SY'INT
       | 'TIM' | 'TXI' | 'TI'INT
       | 'VAR' | 'VAL' | 'VPR' | 'VAO' | 'VE'INT
      ;

LB : '[' ;
RB : ']' ;
LCB : '{' ;
RCB : '}' ;
LP : '(' ;
RP : ')' ;
SEMI : ';' ;

LETTER : [a-zA-Z_#@] ;

ID : (LETTER|INT)+ ;

NUMBER : [+-]? INT '.' INT EXP? | [+-]? INT EXP? ;
fragment EXP : [eE] [+-]? INT ;

INT: [0-9]+ ;


CC : (.)+? ;
