package ExceptionHandling.Try_catch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources_ {
    public static void main(String[] args) {

        // try-with-resources,will automatically close the BufferReader class (because it implements closeable interface) , only if we use it with try-with-resources...
        // so, we can avoid writing finally here...
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"));){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
