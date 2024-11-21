package pk;

enum Color {
    RED, GREEN, BLUE;

    static int nonConstant = 10;

    Color() {
        int value = nonConstant;
    }
}