package pk;

class a<T extends String>{}
class test{ void func(){ a<test> aa = new a<>(); } }