package ExceptionHandling.importantKeywords;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class THROW_KEYWORD {


    public static void main(String[] args) throws FileNotFoundException {
        method1();
    }

    public static void method1()  throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException{

        try {
            FileReader reader = new FileReader("a.txt");  // It will give us fileNotFound Exception

        }
        catch (FileNotFoundException ex){
            System.out.println(ex);

            // 'THROW' allows us to throw exception forcefully...
            // After this, we also needs to add 'throws exception_Name' in the method signature...
//            throw new ArithmeticException(); // we don't need to add 'throws exception_Name' in the method signature , If we throw unchecked exception...

            throw new FileNotFoundException("OHO!"); // WE CAN ALSO WRITE OUR MESSAGE (BY CALLING ITS CONSTRUCTOR)...
        }
    }

}
