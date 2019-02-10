import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import static utils.Util.*;

public class LexicalAnalyzer {
    private Token curToken;
    private InputStream is;
    private int curChar;
    private int curPos;
    private String curWord;


    public LexicalAnalyzer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    public LexicalAnalyzer(String expression) throws ParseException {
        this(new ByteArrayInputStream(expression.getBytes()));
    }

    private boolean isBlank(int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        while (isBlank(curChar)) nextChar();
        if (curChar == ',') {
            curToken = Token.COMMA;
            curWord = ",";
            nextChar();
        } else if (curChar == ':') {
            curToken = Token.COLON;
            curWord = ":";
            nextChar();
        } else if (curChar == ';') {
            curToken = Token.SEMICOLON;
            curWord = ";";
            nextChar();
        } else if (curChar == -1) {
            curToken = Token.END;
        } else if (isLetter(curChar) || isNumber(curChar) || curChar == '_') {
            StringBuilder curString = new StringBuilder();
            while (isLetter(curChar) || isNumber(curChar) || curChar == '_' || curChar == '.') {
                curString.append(String.valueOf((char) curChar));
                nextChar();
            }
            detectTokenByString(curString.toString().toLowerCase());
        } else {
            throw new ParseException("Illegal character " + (char) curChar, curPos);
        }

    }

    private void detectTokenByString(String word) {
        if (isType(word)) {
            curToken = Token.TYPE;
        } else if (isNumberType(word)) {
            curToken = Token.TYPENUMBER;
        } else if (word.toLowerCase().equals("var")) {
            curToken = Token.START;
        } else {
            curToken = Token.VARIABLE;
        }
        curWord = word;
    }

    public Token getCurrentToken() {
        return curToken;
    }

    public String getCurrentWord() {
        return curWord;
    }

    public int getPosition() {
        return curPos;
    }

}
