package ExceptionHandling.importantKeywords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyKeyWord {
    public static int divide(int a,int b){
        try{
            return a/b;
        }
        catch (Exception e){
            return -1;
        }
        // This finally will execute as many times this method is called in the main method, even if we are returning anything before this finally block...
        finally {
            System.out.println("Bye...");
        }
    }
    public static void main(String[] args) {
//        System.out.println(divide(3,0));

        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("IOException caught: " + e.getMessage());
        }

        // we can also write the try,catch inside the 'finally'...
        finally {
            try{
                if(reader != null) {
                    reader.close();
                }
            }
            catch (IOException ex){
                System.out.println("Error closing reader : " + ex.getMessage());
            }
        }
    }
}