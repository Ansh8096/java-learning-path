package JavaGenerics.BoundedTypeParameter;

public class TestBoxx {
    public static void main(String[] args) {
        Boxx<Integer> boxx = new Boxx<>();
//        Boxx<String> boxx2 = new Boxx<>(); It will give us an error,because String is not a subclass of Number...

    }
}
