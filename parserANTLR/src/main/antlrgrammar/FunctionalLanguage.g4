grammar FunctionalLanguage;

@header {
    package ru.drozdov.antlrgrammar;
}

start : functions EOF;

functions : function*;

function : input_return_types method_declaration;

input_return_types : NAME DOUBLECOLON (input_types ARROW)* return_type;

input_types : type ( ARROW type )* ;

type: TYPE NAME;

return_type : TYPE;

method_declaration : NAME declaration SEMICOLON;

declaration : inputs_output (COLON inputs_output)*;

inputs_output :   inputs ASSIGN output
                | ASSIGN defaultBranch;

defaultBranch : output;

inputs : condition_parser | (input)+;

condition_parser : (var)+ CONDITIONDIVIDER condition;

var : NAME;

condition : CONDITION_LEXEM;

input : INT
        | DOUBLE
        | STRING
        | NAME;

output : INT
         | DOUBLE
         | STRING
         | RETURN_LEXEM
         | recursion
         | NAME
         ;

recursion : NAME '(' EXPR ')';

//Lexers

ASSIGN : '=';
SEMICOLON : ';';
COLON : ':';
ARROW : '->';
DOUBLECOLON : '::';
CONDITIONDIVIDER : '|';

INT : [1-9][0-9]*|[0];
BOOLEAN : 'true' | 'false';
DOUBLE : ([1-9][0-9]*| [0])[.][0-9]+;

ALL_TYPES : INT | DOUBLE | BOOLEAN;

STRING : '"' ~('"')* '"';

OPERATIONS : '+'
            | '-'
            | '*'
            | '/'
            | '%';


BRACKETS : '('
          | ')';

CONDITION_LEXEM : NAME [ ]* ([!><][=]*|'==') [ ]* ALL_TYPES [ ]* ([&|]+ [ ]* NAME [ ]* [!><][=]* [ ]* ALL_TYPES)*;

RETURN_LEXEM : [A-Za-z0-9]+([ ]*OPERATIONS[ ]*[A-Za-z0-9()+-/]+)+;

EXPR : NAME [ ]* (OPERATIONS [ ]* NAME)* (',' NAME[ ]* (OPERATIONS [ ]* NAME)*);

TYPE
    : 'Integer'
    | 'String'
    | 'Double'
    | 'Boolean';

// for variables and functions names
NAME
    : [a-zA-Z][a-zA-Z0-9]*;

WS
    : [ \t\r\n]+ -> skip;
