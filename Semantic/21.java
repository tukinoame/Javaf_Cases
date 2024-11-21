package pk;

class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Resource opened.");
    }

    public void use() {
        System.out.println("Using resource.");
    }

    @Override
    public void close() {
        System.out.println("Resource closed.");
    }
}

class Test {
	void func() {
		try(Resource r = new Resource()) {
			r = new Resource();
			int a;
			int b;
		}
		try {} finally {}
	}
}

