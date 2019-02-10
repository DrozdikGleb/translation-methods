package ru.drozdov.generator.tokens;

public class Argument {
    private String name;

    private String type;

    public Argument(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
