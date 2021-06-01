grammar Languagee;
program : 'main_program' block;
block :BEGIN statement* END;

statement :
assign_var |
while_cycle |
if_then |
method |
print_expr;

BEGIN : 'begin';
END : 'end';
PRINT: 'print';
INT : 'int';
FLOAT : 'float';
VAR: 'var';
WHILE: 'while';
IF : 'if';
THEN : 'then';
CALL : 'call';
RETURN : 'return';

ID : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER : [0-9]+;
WS     : [ \n\t\r]+ -> skip;

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';
PERCENT: '%';
DEGREE:'^';

O_BRACKET : '(';
C_BRACKET : ')';

expression:	expression (arif|compare_op) expression
    |ID
    |br_expr
    |NUMBER
    |neg_expr
    |method
    |string
    ;

    type: INT|FLOAT|VAR;
    arif:MULTIPLY|DIVIDE|PLUS|MINUS|PERCENT|DEGREE;
    compare_op : EQUAL|NON_EQUAL|LESS|GREATER|LESS_OR_EQUALS|GREATER_OR_EQUALS;

    string:'"' ID '"';
    signature_method: (O_BRACKET ID (',' ID)* C_BRACKET);
    method : CALL ID (signature_method|(O_BRACKET C_BRACKET)) ;
    assign_var : type?  ID '=' type? expression ;
    print_expr : PRINT O_BRACKET expression C_BRACKET ;
    br_expr:O_BRACKET expression C_BRACKET;
    neg_expr : NEGATION expression;
    while_cycle: WHILE O_BRACKET expression C_BRACKET block;
    if_then: IF O_BRACKET expression C_BRACKET block THEN block_then;
    block_then: block;

    signature: (O_BRACKET type ID (',' type ID)* C_BRACKET);
    block_return : BEGIN statement* RETURN ID END;
    block_non_return : BEGIN statement* RETURN END;
    subprogram_return : 'sub_program' type ID (signature|(O_BRACKET C_BRACKET)) block_return;
    subprogram_non_return : 'sub_program' ID (signature|(O_BRACKET C_BRACKET)) (block_non_return);
    global_program: program(subprogram_non_return|subprogram_return)*;

