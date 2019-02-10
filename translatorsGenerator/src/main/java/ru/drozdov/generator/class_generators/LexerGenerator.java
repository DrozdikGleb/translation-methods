package ru.drozdov.generator.class_generators;

import ru.drozdov.generator.ParsedGrammar;
import ru.drozdov.generator.tokens.Terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import static ru.drozdov.generator.utils.Constants.PATH_TO_DIR;
import static ru.drozdov.generator.utils.Constants.TABS;

public class LexerGenerator {
    PrintWriter pw;
    ParsedGrammar parsedGrammar;

    public LexerGenerator(ParsedGrammar parsedGrammar) {
        this.parsedGrammar = parsedGrammar;
        try {
            pw = new PrintWriter(new File(PATH_TO_DIR + "Lexer.java"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void printPackage() {
        pw.append("package ru.drozdov.results;\n\n");
    }

    public void printClass() {
        printPackage();
        printImports();
        printDeclaration();
        printFields();
        printConstructor();
        printCreateTokenRegexContainerMethod();
        printIsBlankMethod();
        printSkipWhitespaceMethod();
        printNextTokenMethod();
        printGetters();
        pw.append("}\n");
        pw.close();
    }

    private void printImports() {
        pw.append("import java.text.ParseException;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.regex.Matcher;\n" +
                "import java.util.regex.Pattern;\n\n");
    }

    private void printDeclaration() {
        pw.append("public class Lexer {\n");
    }

    private void printFields() {
        pw.append("    Matcher matcher;\n" +
                "    private Token curToken;\n" +
                "    private Character curChar;\n" +
                "    private int curPos;\n" +
                "    private String curWord;\n" +
                "    private String expression;\n" +
                "    private HashMap<Token, Pattern> regexTokenContainer;\n\n");
    }

    private void printConstructor() {
        pw.append("    public Lexer(String expression) {\n" +
                "        this.expression = expression;\n" +
                "        curChar = expression.charAt(0);\n" +
                "        createTokenRegexContainer();\n" +
                "        curPos = 0;\n" +
                "    }\n\n");
    }

    private void printSkipWhitespaceMethod() {
        pw.append("    private void skipWhitespaces() {\n" +
                "        int k = 0;\n" +
                "        while (isBlank(curChar)) {\n" +
                "            k++;\n" +
                "            curChar = expression.charAt(k);\n" +
                "        }\n" +
                "        curPos += k;\n" +
                "        expression = expression.substring(k);\n" +
                "    }\n\n");
    }

    private void printIsBlankMethod() {
        pw.append("    private boolean isBlank(Character c) {\n" +
                "        return c == ' ' || c == '\\r' || c == '\\n' || c == '\\t';\n" +
                "    }\n\n");
    }

    private void printNextTokenMethod() {
        pw.append("    public void nextToken() throws ParseException {\n" +
                "        skipWhitespaces();\n" +
                "\n" +
                "        if (expression.length() == 0) {\n" +
                "            curToken = Token.END;\n" +
                "            curWord = \"$\";\n" +
                "            return;\n" +
                "        }\n" +
                "\n" +
                "        boolean flag = false;\n" +
                "        for (Token token : Token.values()) {\n" +
                "            if (token == Token.END) continue;\n" +
                "            Pattern curPattern = regexTokenContainer.get(token);\n" +
                "            matcher = curPattern.matcher(expression);\n" +
                "            if (matcher.find()) {\n" +
                "                int start = matcher.start();\n" +
                "                if (start != 0) continue;\n" +
                "                int end = matcher.end();\n" +
                "                curWord = expression.substring(0, end);\n" +
                "                expression = expression.substring(end);\n" +
                "                curToken = token;\n" +
                "                curPos += end;\n" +
                "                flag = true;\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "        if (!flag) {\n" +
                "            throw new ParseException(\"Illegal character at position\", curPos);\n" +
                "        }\n" +
                "        if (expression.length() != 0) {\n" +
                "            curChar = expression.charAt(0);\n" +
                "        }\n" +
                "    }\n\n");
    }

    private void printCreateTokenRegexContainerMethod() {
        pw.append("    public void createTokenRegexContainer() {\n" +
                "        regexTokenContainer = new HashMap<>();\n");
        List<Terminal> terminals = parsedGrammar.getTerminals();
        for (int i = 0; i < terminals.size(); i++) {
            Terminal curTerminal = terminals.get(i);
            pw.append(TABS[2]).append("regexTokenContainer.put(")
                                .append("Token.")
                                .append(curTerminal.getName())
                                .append(", ")
                                .append("Pattern.compile(")
                                .append(curTerminal.getValue())
                                .append("));\n");

        }
        pw.append(TABS[1]).append("}\n\n");
    }

    private void printGetters() {
        pw.append("    public Token getCurrentToken() {\n" +
                "        return curToken;\n" +
                "    }\n" +
                "\n" +
                "    public String getCurrentWord() {\n" +
                "        return curWord;\n" +
                "    }\n\n" +
                "    public int getCurPos() {\n" +
                "        return curPos;\n" +
                "    }\n");
    }
}
