package JavaGenerics.GenericClasses.SingleType;

// 'Generic types' allow you to define a class, interface, or method with placeholders (type parameters) for the data types they will work with,
// This enables code reusability and type safety, as it allows you to create classes, interfaces, or methods that can operate on various types,
// without needing to rewrite the code for each type.
// Syntax :-> class ClassName<T> { Class body }

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
