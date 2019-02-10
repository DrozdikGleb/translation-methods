package ru.drozdov.results;

import java.text.ParseException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    Matcher matcher;
    private Token curToken;
    private Character curChar;
    private int curPos;
    private String curWord;
    private String expression;
    private HashMap<Token, Pattern> regexTokenContainer;

    public Lexer(String expression) {
        this.expression = expression;
        curChar = expression.charAt(0);
        createTokenRegexContainer();
        curPos = 0;
    }

    public void createTokenRegexContainer() {
        regexTokenContainer = new HashMap<>();
        regexTokenContainer.put(Token.MUL, Pattern.compile("\\*"));
        regexTokenContainer.put(Token.SUB, Pattern.compile("\\-"));
        regexTokenContainer.put(Token.ADD, Pattern.compile("\\+"));
        regexTokenContainer.put(Token.DIV, Pattern.compile("\\/"));
        regexTokenContainer.put(Token.POW, Pattern.compile("\\^"));
        regexTokenContainer.put(Token.LPAREN, Pattern.compile("\\("));
        regexTokenContainer.put(Token.RPAREN, Pattern.compile("\\)"));
        regexTokenContainer.put(Token.NUMBER, Pattern.compile("[0]|[1-9][0-9]*"));
        regexTokenContainer.put(Token.EPS, Pattern.compile("e"));
    }

    private boolean isBlank(Character c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private void skipWhitespaces() {
        int k = 0;
        while (isBlank(curChar)) {
            k++;
            curChar = expression.charAt(k);
        }
        curPos += k;
        expression = expression.substring(k);
    }

    public void nextToken() throws ParseException {
        skipWhitespaces();

        if (expression.length() == 0) {
            curToken = Token.END;
            curWord = "$";
            return;
        }

        boolean flag = false;
        for (Token token : Token.values()) {
            if (token == Token.END) continue;
            Pattern curPattern = regexTokenContainer.get(token);
            matcher = curPattern.matcher(expression);
            if (matcher.find()) {
                int start = matcher.start();
                if (start != 0) continue;
                int end = matcher.end();
                curWord = expression.substring(0, end);
                expression = expression.substring(end);
                curToken = token;
                curPos += end;
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new ParseException("Illegal character at position", curPos);
        }
        if (expression.length() != 0) {
            curChar = expression.charAt(0);
        }
    }

    public Token getCurrentToken() {
        return curToken;
    }

    public String getCurrentWord() {
        return curWord;
    }

    public int getCurPos() {
        return curPos;
    }
}
