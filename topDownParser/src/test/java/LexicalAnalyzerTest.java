import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class LexicalAnalyzerTest {
    @Test(description = "Тест из условия")
    public void sampleFromTaskTest() {
        String input = "var a, b: integer; c: integer;";
        Token[] correctTokens = {Token.START, Token.VARIABLE, Token.COMMA, Token.VARIABLE, Token.COLON, Token.TYPE, Token.SEMICOLON, Token.VARIABLE, Token.COLON,
                Token.TYPE, Token.SEMICOLON};
        Token[] currentTokens;
        try {
            currentTokens = getCurrentTokens(input);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            assert false;
            return;
        }
        assertEquals(correctTokens, currentTokens);
    }

    @Test
    public void emptyTest() {
        String input = "";
        Token[] correctTokens = {};
        try {
            Token[] currentTokens = getCurrentTokens(input);
            assertEquals(correctTokens, currentTokens);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            assert false;
        }
    }

    private Token[] getCurrentTokens(String input) throws ParseException {
        LexicalAnalyzer lexicalAnalyzer;
        try {
            lexicalAnalyzer = new LexicalAnalyzer(input);
        } catch (ParseException e) {
            System.err.println("Problems with reading ");
            return null;
        }

        List<Token> list = new ArrayList<Token>();
        lexicalAnalyzer.nextToken();
        while (lexicalAnalyzer.getCurrentToken() != Token.END) {
            list.add(lexicalAnalyzer.getCurrentToken());
            lexicalAnalyzer.nextToken();
        }
        return (Token[]) list.toArray(new Token[list.size()]);
    }

}
