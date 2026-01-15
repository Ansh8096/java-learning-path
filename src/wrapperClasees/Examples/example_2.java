package wrapperClasees.Examples;

public class example_2 {
    public static void main(String[] args) {
        Integer x = 1; Integer x2 = 2;
        func1(x);
        System.out.println(x);
        System.out.println(x == x2); // it will compare two Integer objects value...
        System.out.println(x.equals(x2)); // it will compare two Integer objects value...

    }

    public static void func1(Integer y){
        y = 2; // here we are storing new reference in y , but it's value will remain same ...
    }
}
