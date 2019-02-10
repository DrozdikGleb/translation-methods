package utils;

public class Util {
    private static final String[] types = {"integer", "byte", "word", "shortint", "longint", "real", "single", "double",
            "extended", "char", "boolean", "string"};

    public static boolean isType(String word) {
        for (int i = 0; i < types.length; i++) {
            if (word.equals(types[i])) return true;
        }
        return false;
    }

    public static boolean isNumberType(String word) {
        return word.matches("[1-9][0-9]*..[1-9][0-9]*");
    }

    public static boolean isLetter(int c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public static boolean isNumber(int c) {
        return c >= '0' && c <= '9';
    }

}
