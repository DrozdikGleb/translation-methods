package ru.drozdov.tojavatranslation;

import ru.drozdov.gen.FunctionalLanguageBaseListener;
import ru.drozdov.gen.FunctionalLanguageParser;

import java.util.ArrayList;
import java.util.List;

import static ru.drozdov.tojavatranslation.Utils.*;

public class Translator extends FunctionalLanguageBaseListener {

    private StringBuilder stringBuilder = new StringBuilder();

    private List<String> functionVariables = new ArrayList<>();

    private int cur = 0;

    private boolean wasCondition = false;

    public String getImperativeLanguage() {
        return stringBuilder.toString();
    }

    @Override
    public void enterFunction(FunctionalLanguageParser.FunctionContext ctx) {
        addString("public ");
    }

    @Override
    public void exitFunction(FunctionalLanguageParser.FunctionContext ctx) {
        functionVariables = new ArrayList<>();
    }

    @Override
    public void enterInput_return_types(FunctionalLanguageParser.Input_return_typesContext ctx) {
        String typeString = ctx.return_type().getText();
        String funcName = ctx.children.get(0).getText();
        addString(typeString, SPACE, funcName, "(");
    }

    @Override
    public void exitInputs_output(FunctionalLanguageParser.Inputs_outputContext ctx) {
        wasCondition = false;
        cur = 0;
    }

    @Override
    public void exitInput_return_types(FunctionalLanguageParser.Input_return_typesContext ctx) {
        addString(") ", "{\n");
    }

    @Override
    public void enterType(FunctionalLanguageParser.TypeContext ctx) {
        String varName = ctx.children.get(1).getText();
        String typeName = ctx.children.get(0).getText();
        functionVariables.add(varName);
        if (functionVariables.size() > 1) {
            addString(",", SPACE);
        }
        addString(typeName, SPACE, varName);
    }

    @Override
    public void exitMethod_declaration(FunctionalLanguageParser.Method_declarationContext ctx) {
        addString("}\n\n");
    }

    @Override
    public void enterCondition(FunctionalLanguageParser.ConditionContext ctx) {
        String conditionString = ctx.getText();
        boolean lastSpace = conditionString.charAt(conditionString.length() - 1) == ' ';
        addString(TAB, "if ", "(", lastSpace ? conditionString.substring(0, conditionString.length() - 1) : conditionString);
        wasCondition = true;
    }

    @Override
    public void exitInputs(FunctionalLanguageParser.InputsContext ctx) {
        if (wasCondition) {
            addString(")\n");
        }
    }

    @Override
    public void enterInput(FunctionalLanguageParser.InputContext ctx) {
        if (ctx.INT() != null || ctx.DOUBLE() != null) {
            String varName = functionVariables.get(cur);
            String varValue = ctx.getText();
            if (wasCondition) {
                addString(SPACE, "&& ", varName, SPACE, "== ", varValue);
            } else {
                addString(TAB, "if (", varName, SPACE, "== ", varValue);
            }
            wasCondition = true;
        }
        cur++;
    }

    @Override
    public void enterOutput(FunctionalLanguageParser.OutputContext ctx) {
        String expressionReturn = ctx.children.get(0).getText();
        addString(wasCondition ? TAB + TAB : TAB, "return ", expressionReturn, ";\n");
    }

    private void addString(String... strings) {
        addStringUtil(stringBuilder, strings);
    }
}
