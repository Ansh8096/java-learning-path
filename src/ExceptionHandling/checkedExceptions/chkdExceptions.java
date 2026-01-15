package ExceptionHandling.checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class chkdExceptions {

//    public static void main(String... a) {
           // it is a checked exception means,it is checked during compilation...
////        FileReader reader = new FileReader("a.txt"); // It will give us fileNotFound Exception
//        // So to avoid fileNotFound exception we can use: TRY() and CATCH()...
//        try{
//            FileReader reader = new FileReader("a.txt");
//        }
//        catch (Exception ex){
//            System.out.println(ex);
//        }
//    }

// So to avoid fileNotFound exception we can also  use: 'throws EXCEPTION_NAME' (OR SUPER_CLASS NAME)...
// 'THROWS' means you are telling compiler

//    public static void main(String... a) throws Exception {
//        FileReader reader = new FileReader("a.txt"); // It will give us fileNotFound Exception
//    }

    public static void main(String... a) throws IOException {
        // we need to write throws keyword with the methods which we want to call(), if they are showing exception ...
        method1();
        // our code after this won't execute ...
        System.out.println("HELLO :)");

    }

    public static void method1()  throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException{
        FileReader reader = new FileReader("a.txt"); // It will give us fileNotFound Exception
    }


}
