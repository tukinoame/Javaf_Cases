package pk;
import java.io.Serializable;
import java.util.Comparator;

class MyClass <S> {
    <T extends S & Comparable<T> & Serializable> void method() { }
}