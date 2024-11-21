package pk;

class Outer<T>{
	class Inner<U> {}
}
class test{ void func(){ Outer.Inner<test> a = new Outer.Inner<test>(); } }