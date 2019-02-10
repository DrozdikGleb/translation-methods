package ru.drozdov.generator.tokens;

public class JavaCode implements MyToken {

    String name;

    public JavaCode(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
