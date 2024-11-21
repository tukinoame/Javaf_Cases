package pk;

interface MyInterface<T> {
    void doSomething(T t);
}

class A implements MyInterface<String> {
    public void doSomething(String s) {
        // implementation
    }
}

class B implements MyInterface<Integer> {
    public void doSomething(Integer i) {
        // implementation
    }
}

class C extends A implements MyInterface<Integer> {
    public void doSomething(Integer i) {
        // implementation
    }
}