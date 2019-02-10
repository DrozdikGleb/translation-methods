package ru.drozdov.tojavatranslation;

public class Utils {
    public static final String TAB = "\t";

    public static final String SPACE = " ";

    public static void addStringUtil(StringBuilder stringBuilder, String ... strings) {
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
    }
}
