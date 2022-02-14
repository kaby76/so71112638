grammar Expression;

// the rule that attempts to match the whole input against expression.
root : expression EOF;

expression : 
    number # NumberExpr
    | VARIABLE_NAME # VariableExpr
    | '(' expression ')' # GroupedExpr
    | expression '+' expression  # SumExpr
    | expression '*' expression # ProductExpr
    ;
    
number : 
    INTEGER # IntegerNum
    | REAL # RealNum
    ;

/*
 * Lexer rules
 */

INTEGER : [0-9]+ ;
REAL : INTEGER?'.'INTEGER ;

VARIABLE_NAME : [_a-zA-Z][_0-9a-zA-Z]* ;

/* Tell Antlr to ignore whitespaces around tokens. */
WS : [ \t]+ -> skip;
