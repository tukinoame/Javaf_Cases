package pk;

interface TestInterface {
    static void staticMethod() { }
}
class Example {
    public static void main(String[] args) {
        TestInterface t = null;
        t.staticMethod();
    }
}