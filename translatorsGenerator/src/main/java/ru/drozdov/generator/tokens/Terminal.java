package ru.drozdov.generator.tokens;

public class Terminal implements MyToken {
    String name;
    String value;

    public Terminal(String name) {
        this.name = name;
    }

    public Terminal(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
