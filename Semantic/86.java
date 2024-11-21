package pk;

abstract class base<T>{  }
class test{ void func() { base<String> a = new base<>() {} ;} }