package pk;

interface InterfaceA {
    default void doSomething() {
        System.out.println("InterfaceA doing something");
    }
}

interface InterfaceB {
    default void doSomething() {
        System.out.println("InterfaceB doing something");
    }
}

public class MyClass implements InterfaceA, InterfaceB {

}
