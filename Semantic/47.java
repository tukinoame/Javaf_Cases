package pk;

interface MyInterface {
    void doSomething();
}

class Test {
    public static void main(String[] args) {
        MyInterface myInterface = new <Object>MyInterface(42) { 
            @Override
            public void doSomething() {
                System.out.println("Doing something");
            }
        };
    }
}
