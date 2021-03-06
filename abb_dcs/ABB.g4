grammar ABB ;

// 语法

prog : section+ ;

section :
           macros      # MacroSec
        |  fgr         # fgrSec
        ;

macros : macro+ ;

macro : MACROHEAD text SEMI obj+ MACROEND ;

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

id :  ~(COMMA|SEMI|LB|RB|LCB|RCB|QUOTE) ;


//      OBJID             # Obj_id
//   |  CALLID            # Call_id
//   |  STRING            # Str_id
//   |  ID                # Pi_id
//   |  NUMBER            # Num_id
  // |  otherId           # Other_id
   //;

//otherId :  ~(QUOT|COMMA|SEMI|LB|RB|LCB|RCB|STRING) ;
text : (~(SEMI)+) ;


// 词法

STRING : '"' .*? '"' ;

LINE : [\r\n]+ -> skip ;

WS : [ \t] -> skip ;


MACROHEAD : 'MAKRO:HEADER:' ;
MACROEND : 'MAKRO:ENDER'  ;

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
         'ATT' | 'ATR' | 'ANG' | 'AK'INT
       | 'COL' | 'COO' | 'CO'INT
       | 'DIR' | 'DCO'
       | 'EDV'
       | 'FIL' | 'FIX' | 'FMN'
       | 'MFV' | 'MAKRO'
       | 'NCO' | 'NPA'
       | 'OBJS' | 'OBJ'
       | 'POS'
       | 'IMG'
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
QUOT : '"' ;
COMMA: ',' ;
QUOTE : '`' ;

LETTER : [a-zA-Z_#@%] ;

ID : (LETTER|INT)+ ;

NUMBER : [+-]? INT '.' INT EXP? | [+-]? INT EXP? ;
fragment EXP : [eE] [+-]? INT ;

INT: [0-9]+ ;

CC : (.)+? ;
