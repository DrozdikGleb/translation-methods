public enum Token {
    START, TYPE, VARIABLE, COMMA, COLON, SEMICOLON, END, TYPENUMBER;

    @Override
    public String toString() {
        return this.name();
    }
}
