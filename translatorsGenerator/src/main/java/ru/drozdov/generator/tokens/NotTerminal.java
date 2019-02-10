package ru.drozdov.generator.tokens;

import java.util.List;

public class NotTerminal implements MyToken{
    private String name;
    private List<Production> productions;
    private String inValue;
    private Argument returnArgument;
    private List<Argument> inputArguments;

    public NotTerminal(String name, List<Production> productions) {
        this.name = name;
        this.productions = productions;
    }

    public NotTerminal(String name, List<Production> productions, Argument returnArgument) {
        this.name = name;
        this.productions = productions;
        this.returnArgument = returnArgument;
    }

    public NotTerminal(String name, List<Production> productions, List<Argument> inputArguments) {
        this.name = name;
        this.productions = productions;
        this.inputArguments = inputArguments;
    }

    public NotTerminal(String name, List<Production> productions, List<Argument> inputArguments, Argument returnArgument) {
        this.name = name;
        this.productions = productions;
        this.inputArguments = inputArguments;
        this.returnArgument = returnArgument;
    }

    public NotTerminal(String name) {
        this.name = name;
    }

    public NotTerminal(String name, String inValue) {
        this.name = name;
        this.inValue = inValue;
    }

    @Override
    public String getName() {
        return name;
    }

    public List<Production> getProductions() {
        return productions;
    }

    public String getInValue() {
        return inValue;
    }

    public Argument getReturnArgument() {
        return returnArgument;
    }

    public List<Argument> getInputArguments() {
        return inputArguments;
    }
}
