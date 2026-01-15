package JavaGenerics.BoundedTypeParameter;
// Boxx<T extends Number> means :--->
// T is a type parameter, that extends Number means that T can only be a subclass of Number (like Integer, Double, Float, Long, etc.)...
// You cannot use 'Boxx<String>' because String is not a subclass of Number...

public class Boxx <T extends Number>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
