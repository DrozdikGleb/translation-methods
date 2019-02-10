grammar Grammar;

@header {
    package ru.drozdov.antlrgen;
    import  ru.drozdov.generator.tokens.*;
}

start returns [ParsedGrammar parsedGrammar]
        : GRAMMARWORD CLASS_NAME NOTTERMINAL notterms terms
        { $parsedGrammar = new ParsedGrammar($NOTTERMINAL.text, $CLASS_NAME.text, $notterms.notTerminals, $terms.terminals); };

terms returns [List<Terminal> terminals]
        : term { $terminals = new ArrayList<>(); }
               { $terminals.add($term.val);      }
        ( term { $terminals.add($term.val);      })* ;

term returns [Terminal val]
        : TERMINAL COLON STRING SEMICOLON { $val = new Terminal($TERMINAL.text, $STRING.text); };

notterms returns [List<NotTerminal> notTerminals]
        : notterm { $notTerminals = new ArrayList<>(); }
                  { $notTerminals.add($notterm.notTerminal);   }
        ( notterm { $notTerminals.add($notterm.notTerminal);   })* ;

notterm returns [NotTerminal notTerminal]
        : NOTTERMINAL productionsCommon
                { $notTerminal = new NotTerminal($NOTTERMINAL.text, $productionsCommon.productionsList); }
        | NOTTERMINAL RETURNS LSBRACKET argument RSBRACKET productionsCommon
                { $notTerminal = new NotTerminal($NOTTERMINAL.text, $productionsCommon.productionsList, $argument.val); }
        | NOTTERMINAL LSBRACKET arguments RSBRACKET productionsCommon
                { $notTerminal = new NotTerminal($NOTTERMINAL.text, $productionsCommon.productionsList, $arguments.vals); }
        | NOTTERMINAL LSBRACKET arguments RSBRACKET RETURNS LSBRACKET argument RSBRACKET productionsCommon
                { $notTerminal = new NotTerminal($NOTTERMINAL.text, $productionsCommon.productionsList, $arguments.vals, $argument.val); };

arguments returns [List<Argument> vals]
        : argument  { $vals = new ArrayList<>(); }
                    { $vals.add($argument.val); }
        | (COMMA argument { $vals.add($argument.val); })*;

argument returns [Argument val]
        : type NOTTERMINAL { $val = new Argument($type.t, $NOTTERMINAL.text); };

type returns [String t]
        : CLASS_NAME    { $t = $CLASS_NAME.text; }
        | NOTTERMINAL   { $t = $NOTTERMINAL.text; };

productionsCommon returns [List<Production> productionsList]
        : COLON productions SEMICOLON { $productionsList = $productions.productionsList; };

productions returns [List<Production> productionsList]
        : production { $productionsList = new ArrayList<>();  }
                     { $productionsList.add($production.val);       }
        (OR production  { $productionsList.add($production.val); })*;

production returns [Production val]
        :  tokenss { $val = new Production($tokenss.tokenList); };

tokenss returns [List<MyToken> tokenList]
        : token     { $tokenList = new ArrayList<>();   }
                    { $tokenList.add($token.val);       }
         (token     { $tokenList.add($token.val);       })*;

token   returns [MyToken val]
        : TERMINAL      { $val = new Terminal($TERMINAL.text); }
        | NOTTERMINAL   { $val = new NotTerminal($NOTTERMINAL.text); }
        | JAVA_CODE     { $val = new JavaCode($JAVA_CODE.text); }
        | NOTTERMINAL IN_VALUE { $val = new NotTerminal($NOTTERMINAL.text, $IN_VALUE.text); };


        
//Lexer

EQUAL       : '=';
RETURNS     : 'returns';
COLON       : ':';
SEMICOLON   : ';';
LBRACKET    : '(';
RBRACKET    : ')';
LCBRACKET   : '{';
RCBRACKET   : '}';
LSBRACKET   : '[';
RSBRACKET   : ']';
COMMA       : ',';
OR          : '|';
GRAMMARWORD : 'grammar';

TERMINAL    :   [A-Z][A-Z0-9]*;
NOTTERMINAL :   [a-z][a-zA-Z0-9]*;
STRING      :   '"' ~('"')* '"';
JAVA_CODE   :   '{' ~[\r\n]+ '}';
CLASS_NAME  :   [A-Z][a-zA-Z0-9]+;
IN_VALUE    :   '(' ~[\r\n]+ ')';


WS          : [ \t\r\n]+ -> skip;

