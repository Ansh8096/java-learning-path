package MULTI_THREADING.ExecutersFrameworks.EXAMPLES;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MAIN {

    // Method to find the factorial of a given number...
    private static long factorial(int n){
        long res = 1;
        for (int i = 1;i<=n;i++){
            try {
                Thread.sleep(100);
                res *= i;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return res;
    }

    // Main method by creating threads manually...
    // In this we need to manually create,start and stop each Thread (inShort we were doing most of the tasks)...
    // Here: we are also not able to reuse our Threads again and again...
    public static void mainMethodByMultithreading(String[] args) {
        Thread [] threads = new Thread[10]; // we are creating the array for threads...
        long startTime = System.currentTimeMillis();// currentTime in pc...
        for (int i = 1 ;i<=10;i++){
        // System.out.println(factorial(i));
            int finalI = i; // So, that it can be used in Thread (we can't use 'i' directly because it values keeps changing in loop)...
//            Thread thread = new Thread(()-> System.out.println(factorial(finalI)));
            // creating new thread for 10 times with the help of array...
            threads[i-1] = new Thread(()-> {
                long res = factorial(finalI);
                System.out.println(res);
            });
            // starting that particular thread...
            threads[i-1].start();
        }

        // We are running a loop to wait for every thread to stop , before executing our left code...
        for (Thread t1 : threads){
            try {
                t1.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Now we will get correct current time,because we are waiting for every thread to stop...
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime)); // it will get us the time our program take to run...
    }

    // Main method by using ExecutorService interface instead of creating thread manually...
    public static void mainMethodBYExecutorService(String[] args) {
        long startTime = System.currentTimeMillis();// currentTime in pc...

        // Here we are creating a pool of '10' Threads...
        // Here: These threads can be reused again later if needed...
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 1 ;i<=10;i++){
            int finalI = i; // So, that it can be used in Thread (we can't use 'i' directly because it values keeps changing in loop)...

            // Here: 'submit()' receives the Runnable interface 'run' method , which we can override using lambdaExpression...
            // Here: Each method will now have its task to do...
            executor.submit(()-> {
                long res = factorial(finalI);
                System.out.println(res);
            });
        }
        // This 'shutdown()' method will stops all the 'Executor' submitted tasks and also, it will now not executor to submit any other task after the 'shutdown()',if we try to do so it will throw us an error...
        // But the main Thread won't wait for the executor to shutdown(),it will do other tasks in main method...
        executor.shutdown();

        try {
            // HERE: 'awaitTermination()' will wait for the executor to stop (for '10' in this case) here only,if it doesn't get 'shutdown()' in the given time,then our main Thread will go further for execution...
            // We can also make the main Thread to wait here until the executor is finished, using the while() loop...
            while (!executor.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Waiting...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Now we will get correct current time,because we are waiting for every thread to stop...
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime)); // it will get us the time our program take to run...

    }

    // Main method by using Executor interface...
    // this interface doesn't have any shutdown method, so we need to end it manually...
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Executor executor = Executors.newFixedThreadPool(1);
        for (int i = 1;i<=10 ; i++){
            int finalI = i;
            // It has 'execute()' method instead of 'submit()' method (like in 'ExecutorService') ...
            executor.execute(()-> System.out.println(factorial(finalI)));
        }
    }

}
