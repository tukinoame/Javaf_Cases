package pk;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Repeatable(MyAnnotations.class)
@interface MyAnnotation {
    void value();
}

@interface MyAnnotations {
    MyAnnotation[] value();
}