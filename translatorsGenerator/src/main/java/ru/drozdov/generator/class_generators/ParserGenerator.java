package ru.drozdov.generator.class_generators;

import ru.drozdov.generator.ParsedGrammar;
import ru.drozdov.generator.tokens.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import static ru.drozdov.generator.utils.Constants.PATH_TO_DIR;

public class ParserGenerator {
    PrintWriter pw;
    ParsedGrammar parsedGrammar;
    Map<String, Set<String>> firstSets;
    Map<String, Set<String>> followSets;
    private boolean hasEPS;

    public ParserGenerator(ParsedGrammar parsedGrammar) {
        this.parsedGrammar = parsedGrammar;
        try {
            pw = new PrintWriter(new File(PATH_TO_DIR + "Parser.java"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        firstSets = parsedGrammar.getFirstSets();
        followSets = parsedGrammar.getFollowSets();
    }

    public void printClass() {
        parsedGrammar.constructFIRST();
        parsedGrammar.constructFOLLOW();
        printPackage();
        printImports();
        printClassDeclaration();
        printFields();
        printParseMethod();
        printParserForNotTerminals();
        printConsumeMethod();
        pw.append("}\n");
        pw.close();
    }

    private void printImports() {
        pw.append("import static ru.drozdov.results.Token.*;\n" +
                "import java.text.ParseException;\n\n");
    }

    private void printClassDeclaration() {
        pw.append("public class Parser {\n");
    }

    private void printPackage() {
        pw.append("package ru.drozdov.results;\n\n");
    }

    private void printFields() {
        pw.append("    Lexer lexer;\n\n");
    }

    private void printParseMethod() {
        String returnTypeName = parsedGrammar.getNotTerminalsMap().get(parsedGrammar.getStartNotTerminal()).getReturnArgument().getType();
        pw.append("    public ").append(returnTypeName).append(" parse(String input) throws ParseException {\n" +
                "        lexer = new Lexer(input);\n" +
                "        lexer.nextToken();\n" +
                "        " + returnTypeName + " root = " + parsedGrammar.getStartNotTerminal() + "();\n" +
                "        return root;\n" +
                "    }\n\n");
    }

    private void printParserForNotTerminals() {
        for (NotTerminal notTerminal : parsedGrammar.getNotTerminals()) {
            //1- возвращаемое значение в зависимости от синт.аттрибута
            //передаём наследуемый
            String inputValues = getInputValues(notTerminal);
            Argument curArgument = getReturnArgument(notTerminal);
            String returnType = curArgument.getType();
            String returnValue = curArgument.getName();
            pw.append("    private ").append(returnType).append(" ").append(notTerminal.getName())
                    .append("(").append(inputValues)
                    .append(")")
                    .append(" throws ParseException {\n");
            pw.append("        ").append(returnType).append(" ").append(returnValue).append(";\n");
            pw.append("        String currentTokenValue = lexer.getCurrentWord();\n");
            pw.append("        switch (lexer.getCurrentToken()) {\n");
            hasEPS = false;
            List<Production> productions = notTerminal.getProductions();
            printCases(productions, notTerminal.getName(), returnValue);
            pw.append("    }");
            pw.append("\n\n");
        }
    }

    private void printCases(List<Production> productions, String notTerminalName, String returnValue) {
        JavaCode javaCode = null;
        for (Production curProduction : productions) {
            List<String> curFirstList = getFirst(curProduction);
            for (int i = 0; i < curFirstList.size(); i++) {
                String cur = curFirstList.get(i);
                pw.append("            case ").append(cur);
                if (i != curFirstList.size() - 1) {
                    pw.append(":\n");
                } else {
                    pw.append(": {\n");
                }
            }
            if (curProduction.getProductionTokens().get(0).getName().equals("EPS")) {
                hasEPS = true;
                List<MyToken> productionsTokens = curProduction.getProductionTokens();
                for (int j = 0; j < productionsTokens.size(); j++) {
                    MyToken curToken = productionsTokens.get(j);
                    if (curToken instanceof JavaCode) {
                        javaCode = (JavaCode) curToken;
                    }
                }
                continue;
            }
            for (MyToken curToken : curProduction.getProductionTokens()) {
                if (curToken instanceof Terminal) {
                    pw.append("                consume(").append(curToken.getName()).append(");\n");
                } else if (curToken instanceof NotTerminal) {
                    NotTerminal curNotTerminal = (NotTerminal) curToken;
                    printHeritableAttributes(curNotTerminal);
                } else if (curToken instanceof JavaCode) {
                    String code = curToken.getName().substring(1, curToken.getName().length() - 1);
                    if (code.contains("$")) {
                        String codeAnswer = code.substring(0, code.indexOf("$"));
                        codeAnswer = codeAnswer + "currentTokenValue" + code.substring(code.lastIndexOf("$") + 1);
                        pw.append("               ").append(codeAnswer).append("\n");
                    } else {
                        pw.append("               ").append(code).append("\n");
                    }
                }
            }
            pw.append("                return ").append(returnValue).append(";\n");
            pw.append("            }\n");
        }
        if (hasEPS && javaCode != null) {
            printFollow(notTerminalName);
            pw.append("                ").append(javaCode.getName().substring(1, javaCode.getName().length() - 1)).append("\n");
            pw.append("                return ").append(returnValue).append(";\n");
        }
        pw.append("            default:\n" +
                "                throw new AssertionError();\n");
        pw.append("        }\n");
    }

    private void printConsumeMethod() {
        pw.append("    private void consume(Token c) throws ParseException {\n" +
                "        if (!lexer.getCurrentToken().equals(c)) {\n" +
                "            throw new ParseException(\"Expected \" + c + \"but found \" + lexer.getCurrentToken(), lexer.getCurPos());\n" +
                "        }\n" +
                "        lexer.nextToken();\n" +
                "    }\n\n");
    }

    private void printFollow(String notTerminal) {
        Set<String> curFollow = followSets.get(notTerminal);
        for (String curString: curFollow) {
            if (curString.equals("$")) {
                curString = "END";
            }
            pw.append("            case ").append(curString).append(":\n");
        }
    }

    private void printHeritableAttributes(NotTerminal curNotTerminal) {
        String returnType = getReturnArgument(curNotTerminal).getType();
        String curName = curNotTerminal.getName();
        pw.append("                ").append(returnType)
                .append(" ")
                .append(curName)
                .append(" = ")
                .append(curName);
        if (curNotTerminal.getInValue() != null) {
            pw.append(curNotTerminal.getInValue()).append(";\n");
        } else {
            pw.append("();\n");
        }
    }
    private ArrayList<String> getFirst(Production production) {
        Set<String> res = new HashSet<>();
        MyToken prevToken = null;
        for (MyToken curToken : production.getProductionTokens()) {
            if (curToken instanceof Terminal) {
                res.add(curToken.getName());
                break;
            } else if (curToken instanceof NotTerminal) {
                String notTerminalName = curToken.getName();
                if (prevToken != null) {
                    if (firstSets.get(prevToken.getName()).contains("EPS")) {
                        res.addAll(firstSets.get(notTerminalName));
                    } else {
                        break;
                    }
                } else {
                    res.addAll(firstSets.get(notTerminalName));
                }
                prevToken = curToken;
            }
        }
        if (res.contains("EPS")) {
            hasEPS = true;
        }
        res.remove("EPS");
        return new ArrayList<>(res);
    }

    private Argument getReturnArgument(NotTerminal curNotTerminal) {
        return parsedGrammar.getNotTerminalsMap().get(curNotTerminal.getName()).getReturnArgument();
    }

    private String getInputValues(NotTerminal curNotTerminal) {
        if (curNotTerminal.getInputArguments() == null) return "";
        List<Argument> inputArguments = curNotTerminal.getInputArguments();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < inputArguments.size(); i++) {
            str.append(inputArguments.get(i).getType()).append(" ").append(inputArguments.get(i).getName());
            if (i != inputArguments.size() - 1) {
                str.append("; ");
            }
        }
        return str.toString();
    }

}
