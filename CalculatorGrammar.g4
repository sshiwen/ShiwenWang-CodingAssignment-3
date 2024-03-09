grammar CalculatorGrammar;

// Parser rules
expr:   expr op=('*' | '÷' | '**') expr
    |   expr op=('+' | '-') expr
    |   'log' expr
    |   'ln' expr
    |   'sin' expr
    |   'cos' expr
    |   'tan' expr
    |   'asin' expr
    |   'acos' expr
    |   'atan' expr
    |   'sinh' expr
    |   'cosh' expr
    |   'tanh' expr
    |   expr '!'
    |   '(' expr ')'
    | function '(' expr ')'
    |   number
    ;

function: SIN | COS | TAN | ASIN | ACOS | ATAN | SINH | COSH | TANH | LOG | LN;
number: INT | FLOAT | SCIENTIFIC_NUMBER | PI | E;

// Lexer rules
PI : 'π' | 'pi' ;
E: 'e';
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]* | '.'[0-9]+;
SCIENTIFIC_NUMBER: [0-9]+ ('E' | 'e') [+-]? [0-9]+;

// Operators
MUL: '*';
DIV : '/' | '÷' ;
ADD: '+';
SUB: '-';
POW: '**';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';
ASIN: 'asin';
ACOS: 'acos';
ATAN: 'atan';
SINH: 'sinh';
COSH: 'cosh';
TANH: 'tanh';
LOG: 'log';
LN: 'ln';

WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
