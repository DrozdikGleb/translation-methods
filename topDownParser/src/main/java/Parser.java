import java.text.ParseException;

public class Parser {
    LexicalAnalyzer lexicalAnalyzer;

    private Tree S() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case START:
                lexicalAnalyzer.nextToken();
                Tree Ds = Ds();
                return new Tree("S", Ds);
            case END:
                return new Tree("S");
            default:
                throw new AssertionError();
        }
    }

    private Tree Ds() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case VARIABLE:
                Tree D = D();
                Tree Ds = Ds();
                return new Tree("Ds", D, Ds);
            case END:
                return new Tree("eps");
            default:
                throw new AssertionError();
        }
    }

    private Tree D() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case VARIABLE:
            case COLON:
                Tree Vs = Vs();
                lexicalAnalyzer.nextToken();
                Tree T = T();
                return new Tree("D", Vs, T);
            case END:
                return new Tree("eps");
            default:
                throw new ParseException("Expected : at position " + String.valueOf(lexicalAnalyzer.getPosition()), lexicalAnalyzer.getPosition());
        }
    }

    private Tree Vs() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case VARIABLE:
                Tree V = V();
                lexicalAnalyzer.nextToken();
                Tree VsPrime = VsPrime();
                return new Tree("Vs", V, VsPrime);
            case END:
                return new Tree("Vs");
            default:
                throw new AssertionError();
        }
    }

    private Tree VsPrime() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case COMMA:
                lexicalAnalyzer.nextToken();
                Tree V = V();
                lexicalAnalyzer.nextToken();
                return new Tree("Vs'", V, VsPrime());
            case COLON:
                return new Tree(":");
            default:
                throw new AssertionError();
        }
    }

    private Tree V() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case VARIABLE:
                return new Tree("V", new Tree(lexicalAnalyzer.getCurrentWord()));
            default:
                throw new AssertionError();
        }
    }

    private Tree T() throws ParseException {
        switch (lexicalAnalyzer.getCurrentToken()) {
            case TYPENUMBER:
            case TYPE:
                String curType = lexicalAnalyzer.getCurrentWord();
                lexicalAnalyzer.nextToken();
                if (lexicalAnalyzer.getCurrentToken() != Token.SEMICOLON) {
                    throw new ParseException("Не хватает ; на позиции", lexicalAnalyzer.getPosition());
                }
                lexicalAnalyzer.nextToken();
                return new Tree("T", new Tree(curType));
            default:
                throw new AssertionError();
        }
    }

    Tree parse(String input) throws ParseException {
        lexicalAnalyzer = new LexicalAnalyzer(input);
        lexicalAnalyzer.nextToken();
        Tree root = S();
        return root;
    }
}
