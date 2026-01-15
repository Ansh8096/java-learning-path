package ExceptionHandling.Try_catch;

//public class runtimeError extends Object{ // we don't need to extend it because, it is automatically (by default) extends the Object Class...
public class runtimeError_1 {

    public static void main(String[] args) {
        int[] numerator = {10,20,30,40};
        int[] denominator = {1,2,0,4};
//        for(int i = 0; i < numerator.length;i++){
        for(int i = 0; i < 6;i++){
            // we can also use try catch here...
            try {
                // this is known as unchecked exception...
                // means,it is not being checked during compilation...
                System.out.println(divide(numerator[i], denominator[i]));
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Good Job! :)");
    }

    // if we didn't use try,catch in this , then we will get us an arithmetic exception(because of : / by zero)...
    private static int divide(int a,int b){
        // If we got any error in try while returning a/b, then will go to catch() method...
        try {
            // this is known as unchecked exceptions...
            // means,it is not being checked during compilation...

//            Student_eg student = null;
//            student.id = "454";
//            System.out.println(student.id); // this will give us null pointer exception ...

//            Student_eg student = new Student_eg();
//            student.id = "454";
//            System.out.println(student); // we can directly print the class object, now we won't get print Hashcode, becauz we have update the 'toString()' (String method) in student class...

            // we will get Arithmetic exception by this at some moment ...
            return a/b;
        }

        // we will execute this when we got ArithmeticException error by / 0...
        catch(ArithmeticException e) { // this catch() will receive the exception that we JVM will throw during compilation...
        // catch(Exception e){  // We can use run-time polymorphism here, to use Super class constructor ...

            // this will print the toString method (of String), which is override by the super class of ArithmeticException class...
            // because, System.out.println() internally runs the toString() method which is present in class by default (which we can override also)...
            System.out.println(e);
            System.out.println(" Arithmetic Exception :( ");
             return -1;
        }

        // we will execute this when we got Null Pointer Exception error...
        catch (NullPointerException e){
            System.out.println(e);
            System.out.println(" Null Pointer Exception :( ");
            return -1;
        }

        // we will execute this when we got any other error...
        catch (Exception e){
            System.out.println(e);
            return -1;
        }

    }
}
