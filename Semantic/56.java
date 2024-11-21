package pk;

class Gen <A, B, C> {}
class Gen2 <A, B> {}
class test{ void func(){ Gen<String, String> gen; Gen2<String, String, Object> gen2;} }