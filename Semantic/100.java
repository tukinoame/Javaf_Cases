package pk;

@interface A {
    B value();
}

@interface B {
    A value();
}