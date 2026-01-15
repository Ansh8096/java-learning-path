package JavaGenerics.GenericClasses.ConstructorAndMethods;

public class GenericConstructor {

    public <T> GenericConstructor(T value){
    }

    public static void main(String[] args) {
        GenericConstructor genericConstructor1 = new GenericConstructor(12);
        GenericConstructor genericConstructor2 = new GenericConstructor("hello");
    }
}
