package ru.drozdov.tojavatranslation;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.Test;
import ru.drozdov.gen.FunctionalLanguageLexer;
import ru.drozdov.gen.FunctionalLanguageParser;

public class TranslatorTest {

    @Test
    public void severalInputsTest() {
        String input = "sum :: Integer a -> Integer b -> Integer k -> Integer\n" +
                "sum 4 2 1 = 7:\n" +
                "a | a < 0 = 0:\n" +
                "a b k = a + b + k;";
        testIt(input);
    }

    @Test
    public void noParametersTest() {
        String input = "num2 :: Integer\n" +
                "num2 = 2;";
        testIt(input);
    }

    @Test
    public void conditionsTest() {
        String input = "mul :: Integer a -> Integer b -> Integer\n" +
                "mul a 2 = a * 2\n" +
                "2 4 = 8\n" +
                "a b | a > 0 && b > 0 = a * b\n" +
                "= a * b;";
        testIt(input);
    }

    @Test
    public void differentTypesTest() {
        String input = "mulDouble :: Double a -> Double b -> Double\n" +
                "mulDouble 0.0 = 0.0:\n" +
                "a 0.0 = 0.0:\n" +
                "a b | a < 0 && b < 0 = a * (b * a - d + e / c * mulDouble(a,b,c,d)):\n" +
                "a b = a * b;";
        testIt(input);
    }

    @Test
    public void booleanAndStringTest() {
        String input = "boolString :: Boolean b -> String\n" +
                "boolString b | b == true = \"True\":\n" +
                "b | b == false = \"False\";";
        testIt(input);
    }

    @Test
    public void gcd() {
        String string = "gcd :: Integer a -> Integer b -> Integer\n" +
                "gcd b | b == 0 = a:\n" +
                "4 2 = 2:\n" +
                "a b = gcd(b,b % a);";
        testIt(string);
    }

    @Test
    public void defaultBranch() {

    }
    private void testIt(String functionalLangProgram) {
        System.out.println("----------functional language----------");
        System.out.println(functionalLangProgram + "\n");
        System.out.println("----------imperative language----------");

        FunctionalLanguageLexer lexer = new FunctionalLanguageLexer(CharStreams.fromString(functionalLangProgram));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FunctionalLanguageParser parser = new FunctionalLanguageParser(tokens);

        Translator translator = new Translator();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(translator, parser.start());
        System.out.println(translator.getImperativeLanguage() + "\n");
    }

}
