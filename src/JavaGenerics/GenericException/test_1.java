package JavaGenerics.GenericException;

public class test_1 {
    public static void main(String[] args) {

        try {
            throw new MyException(123);
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throw new MyException("Hello");
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }

}
class MyException extends Exception{
    public <T> MyException(T value){
        super("Exception related to value: "  + value.toString() + " of type " + value.getClass().getName());
    }
}

//  Key Ideas :---
// You can make a constructor generic, even if the class itself isn’t generic...
// Useful for: Logging values with type info and Debugging exceptions with extra context...