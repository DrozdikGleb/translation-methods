package ru.drozdov.generator.class_generators;

import ru.drozdov.generator.ParsedGrammar;
import ru.drozdov.generator.tokens.Terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class TokenGenerator {
    PrintWriter pw;
    ParsedGrammar parsedGrammar;
    private String TAB = "    ";
    private String PATH_TO_DIR = System.getProperty("user.dir") + "/src/main/java/ru/drozdov/results/";
    StringBuilder stringBuilder = new StringBuilder();
    public TokenGenerator(ParsedGrammar grammar) {
        parsedGrammar = grammar;
        try {
            pw = new PrintWriter(new File(PATH_TO_DIR + "Token.java"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printTokenClass() {
        printPackage();
        printDeclaration("Token");
        printTokens();
        printEnd();
        pw.write(stringBuilder.toString());
        pw.close();
    }

    public void printPackage() {
        stringBuilder.append("package ru.drozdov.results;\n");
    }

    public void printDeclaration(String className) {
        stringBuilder.append("public enum ").append(className).append(" {\n");
    }

    public void printTokens() {
        List<Terminal> grammarTerminals = parsedGrammar.getTerminals();
        stringBuilder.append(TAB);
        for (int i = 0; i < grammarTerminals.size(); i++) {
            stringBuilder.append(grammarTerminals.get(i).getName()).append(", ");
        }
        stringBuilder.append("END").append("\n");
    }

    public void printEnd() {
        stringBuilder.append("}\n");
    }
}
