package ru.drozdov;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.drozdov.antlrgen.GrammarLexer;
import ru.drozdov.antlrgen.GrammarParser;
import ru.drozdov.generator.class_generators.LexerGenerator;
import ru.drozdov.generator.class_generators.ParserGenerator;
import ru.drozdov.generator.class_generators.TokenGenerator;
import ru.drozdov.generator.ParsedGrammar;
import ru.drozdov.results.Parser;

import java.io.IOException;
import java.text.ParseException;

public class CalculatorGrammarTest {

    private static final String PATH_TO_GRAMMARS = System.getProperty("user.dir") + "/src/main/java/ru/drozdov/grammars/";

    @Test(enabled = false)
    public void simpleTest() {
        String input = "2 + 3 + 7 - 4";
        countExpression(input);
    }

    @Test
    public void bracketsTest() {
        String input = "5 * (3 + 7) + 4 / 2";
        countExpression(input);
    }

    @Test(enabled = false)
    public void zeroTest() {
        String input = "4 + 0";
        countExpression(input);
        String input2 = "4 * 0";
        countExpression(input2);
    }

    @Test
    public void numberTest() {
        String input = "137";
        countExpression(input);
    }

    @Test
    public void powTest() {
        String input = "2 ^ 2 ^ 3";
        String input2 = "2 ^ 3 ^ 2";
        String input3 = "(2 ^ 2) ^ 3";
        String input4 = "2 ^ 3 ^ 3";
        String input5 = "1 - 2 - 3";
        countExpression(input);
        countExpression(input2);
        countExpression(input3);
        countExpression(input4);
        countExpression(input5);
    }

    @BeforeClass
    public void generateGrammar() {
        GrammarLexer lexer = null;
        try {
            lexer = new GrammarLexer(CharStreams.fromFileName(PATH_TO_GRAMMARS + "pow"));
        } catch (IOException e) {
            return;
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser grammarParser = new GrammarParser(tokens);
        ParsedGrammar parsedGrammar = grammarParser.start().parsedGrammar;
        TokenGenerator tokenGenerator = new TokenGenerator(parsedGrammar);
        LexerGenerator lexerGenerator = new LexerGenerator(parsedGrammar);
        ParserGenerator parserGenerator = new ParserGenerator(parsedGrammar);
        tokenGenerator.printTokenClass();
        lexerGenerator.printClass();
        parserGenerator.printClass();
    }

    private void countExpression(String input) {
        Parser parser = new Parser();
        try {
            Integer node = parser.parse(input);
            System.out.println(input + " = " + node);
        } catch (ParseException e) {
            System.out.println(e.getMessage() + " " + e.getErrorOffset());
        }
    }
}
