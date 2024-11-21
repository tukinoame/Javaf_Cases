package pk;

class test{ void func(){ assert true: func2(); } void func2() {  } }

class test{ void func(){ int a = func2() + func2(); } void func2(){} }

