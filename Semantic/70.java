package pk;

enum MyEnum {
    INSTANCE;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}