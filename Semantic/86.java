package pk;

abstract class base<T, U extends String, S extends test>{  }
class test{ void func() { new base<>() {} ;} }
