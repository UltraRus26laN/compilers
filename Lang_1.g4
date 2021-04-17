grammar Lang;

// High Level PART

program
:line line
;

line
: value | variable_definition | variable_declaration | for_cycle SEMI
;



// Variable PART
variable_declaration // int a;
: var_type identifier
;

variable_definition // int a = 5;
: var_type identifier ASSIGN value
;



// Expressions PART
value
: identifier
| function_call
| logic_expression
| NUM_INT
;

expression
: LPAREN expression  RPAREN
| expression operation expression
| value
;

expression_right
: operation value
;

logic_expression
: LPAREN? identifier logic_expression_right* RPAREN?
;

logic_expression_right
: bool_operation value
;




variable_change_expression
: identifier operation value
;

function_call
: identifier LPAREN RPAREN
;




// For Cyelce PART
for_head
: FOR LPAREN identifier COMMA logic_expression COMMA variable_change_expression RPAREN
;



for_cycle
: for_head NEWLINE
LCURLY NEWLINE?
line+
RCURLY NEWLINE?
;



// Operations PART
bool_operation
: GE
| GT
| LE
| LT
| EQUAL
| NOT_EQUAL
;

operation
: ASSIGN
| PLUS
| MINUS
| STAR
| SLASH
;

// System PART
identifier
: IDENT
;



// Types part
var_type
: array_type
| bool_type
| int_type
;

array_type
: ARRAY_TYPE
;

bool_type
: TRUE
| FALSE
;

int_type
: NUM_INT_TYPE
;




// Lexers


// alphabet
fragment A
   : ('a' | 'A')
   ;
fragment B
   : ('b' | 'B')
   ;
fragment C
   : ('c' | 'C')
   ;
fragment D
   : ('d' | 'D')
   ;
fragment E
   : ('e' | 'E')
   ;
fragment F
   : ('f' | 'F')
   ;
fragment G
   : ('g' | 'G')
   ;
fragment H
   : ('h' | 'H')
   ;
fragment I
   : ('i' | 'I')
   ;
fragment J
   : ('j' | 'J')
   ;
fragment K
   : ('k' | 'K')
   ;
fragment L
   : ('l' | 'L')
   ;
fragment M
   : ('m' | 'M')
   ;
fragment N
   : ('n' | 'N')
   ;
fragment O
   : ('o' | 'O')
   ;
fragment P
   : ('p' | 'P')
   ;
fragment Q
   : ('q' | 'Q')
   ;
fragment R
   : ('r' | 'R')
   ;
fragment S
   : ('s' | 'S')
   ;
fragment T
   : ('t' | 'T')
   ;
fragment U
   : ('u' | 'U')
   ;
fragment V
   : ('v' | 'V')
   ;
fragment W
   : ('w' | 'W')
   ;
fragment X
   : ('x' | 'X')
   ;
fragment Y
   : ('y' | 'Y')
   ;
fragment Z
   : ('z' | 'Z')
   ;


NEWLINE
: ('\r'? '\n' | '\r' | '\n')+
;

NUM_INT
: ('0' .. '9') +
;

NUM_INT_TYPE
: I N T
;

ARRAY_TYPE
: A R R A Y
;

TRUE
   : T R U E
   ;


FALSE
   : F A L S E
   ;


ASSIGN
   : '='
   ;


SEMI
   : ';'
   ;

COMMA
   : ','
   ;


EQUAL
   : '=='
   ;


NOT_EQUAL
   : '!='
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;



FOR
   : F O R
   ;



LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


IDENT // some variable or func name
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


WS
   : ' ' //-> skip
   ;