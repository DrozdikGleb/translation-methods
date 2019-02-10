package ru.drozdov.results;

import static ru.drozdov.results.Token.*;
import java.text.ParseException;

public class Parser {
    Lexer lexer;

    public Integer parse(String input) throws ParseException {
        lexer = new Lexer(input);
        lexer.nextToken();
        Integer root = add();
        return root;
    }

    private Integer add() throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case NUMBER:
            case LPAREN: {
                Integer mul = mul();
                Integer addP = addP(mul);
                val = addP; 
                return val;
            }
            default:
                throw new AssertionError();
        }
    }

    private Integer addP(Integer i) throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case ADD: {
                consume(ADD);
                Integer mul = mul();
                Integer addP = addP(i + mul);
                val = addP; 
                return val;
            }
            case SUB: {
                consume(SUB);
                Integer mul = mul();
                Integer addP = addP(i - mul);
                val = addP; 
                return val;
            }
            case END:
            case RPAREN:
                 val = i; 
                return val;
            default:
                throw new AssertionError();
        }
    }

    private Integer mul() throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case NUMBER:
            case LPAREN: {
                Integer power = power();
                Integer mulP = mulP(power);
                val = mulP; 
                return val;
            }
            default:
                throw new AssertionError();
        }
    }

    private Integer power() throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case NUMBER:
            case LPAREN: {
                Integer fact = fact();
                Integer powerP = powerP();
                val = (int) Math.pow(fact, powerP); 
                return val;
            }
            default:
                throw new AssertionError();
        }
    }

    private Integer powerP() throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case POW: {
                consume(POW);
                Integer fact = fact();
                Integer powerP = powerP();
                val = (int) Math.pow(fact, powerP); 
                return val;
            }
            case DIV:
            case ADD:
            case SUB:
            case END:
            case MUL:
            case RPAREN:
                 val = 1; 
                return val;
            default:
                throw new AssertionError();
        }
    }

    private Integer mulP(Integer i) throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case MUL: {
                consume(MUL);
                Integer fact = fact();
                Integer mulP = mulP(i * fact);
                val = mulP; 
                return val;
            }
            case DIV: {
                consume(DIV);
                Integer fact = fact();
                Integer mulP = mulP(i / fact);
                val = mulP; 
                return val;
            }
            case ADD:
            case SUB:
            case END:
            case RPAREN:
                 val = i; 
                return val;
            default:
                throw new AssertionError();
        }
    }

    private Integer fact() throws ParseException {
        Integer val;
        String currentTokenValue = lexer.getCurrentWord();
        switch (lexer.getCurrentToken()) {
            case NUMBER: {
                consume(NUMBER);
                val = Integer.parseInt(currentTokenValue); 
                return val;
            }
            case LPAREN: {
                consume(LPAREN);
                Integer add = add();
                consume(RPAREN);
                val = add; 
                return val;
            }
            default:
                throw new AssertionError();
        }
    }

    private void consume(Token c) throws ParseException {
        if (!lexer.getCurrentToken().equals(c)) {
            throw new ParseException("Expected " + c + "but found " + lexer.getCurrentToken(), lexer.getCurPos());
        }
        lexer.nextToken();
    }

}
