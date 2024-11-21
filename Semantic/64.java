package pk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@interface MyDeclarationAnnotation {}

class Example {
    @MyDeclarationAnnotation
    public void myMethod() {}

    public void anotherMethod() {
        String @MyDeclarationAnnotation [] arr = new String[10];
    }
}