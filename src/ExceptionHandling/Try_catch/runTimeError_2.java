package ExceptionHandling.Try_catch;

public class runTimeError_2 {
    public static void main(String[] args){
        try{
            level1();
        }
        catch(Exception exp){
            exp.printStackTrace(); // this will print the exceptionStackTrace...
            System.out.println(exp.getMessage());
        }
    }

    public static  void level3(){
        // this is known as unchecked exception...
        // means,it is not being checked during compilation...
        int [] arr = new int[5];
        arr[5] = 0;
    }

    public static  void level2(){
        level3();
    }

    public static  void level1(){
        level2();
    }
}
