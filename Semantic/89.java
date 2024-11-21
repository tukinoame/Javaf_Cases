package pk;

class MyClass {
    public static void instanceMethod() {}
}

class test{ void func(){ MyClass::instanceMethod++; } }
