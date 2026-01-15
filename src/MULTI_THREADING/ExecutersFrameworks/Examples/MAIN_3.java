package MULTI_THREADING.ExecutersFrameworks.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MAIN_3 {
    public static void main(String[] args) {

        // We are creating executor ,with '2' fixed thread pools...
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executor.submit(() -> 2 + 3);
        Integer i = null;
        try {
            i = submit.get();
        } catch (InterruptedException | ExecutionException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The sum is: " + i);
        executor.shutdown();
        System.out.println(executor.isShutdown()); // it will return true if executor is shutdown()...
        try {
            Thread.sleep(1); // because of this wait, now we won't get false in 'isTerminated',because earlier we were printing it right just after the 'shutdown()'...
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(executor.isTerminated()); // it will only return true if all the tasks are completed after shutdown()...


        // Executors 'invokeAll()' method :--------->

        ExecutorService executor2 = Executors.newSingleThreadExecutor();

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("This is an task-1...");
            return 1;
        };

        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("This is an task-2...");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("This is an task-3...");
            return 3;
        };

        // 'Arrays.asList()' method converts array into a list...
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        // 1st type:------------>
        // 'invokeAll()' method takes 'list' as a parameter, it also returns a list of 'Futures<?>'...
        // 'invokeAll()' method will make 'main' thread method to wait until all the tasks are completed...
//        List<Future<Integer>> futures = null;
//        try {
//            futures = executor2.invokeAll(list);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }

        // 2nd type:------------>
        // This 'invokeAll()' method will only make 'main' thread method to wait for the provided period of time...
        // if all the tasks are not completed with the given period of time ,then our 'main' Thread will ignore it...
//        List<Future<Integer>>futures = null;
//        try {
//            futures = executor2.invokeAll(list, 1, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        for (Future<Integer> f : futures) {
//            try {
//                System.out.println(f.get());
//            } catch (CancellationException | ExecutionException | InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//        executor2.shutdown();

        // This will always print in last because of 'invokeAll()' method...
//        System.out.println("Looks like all the tasks are completed or wasn't not be able to finish within the given period of time,now main thread is no longer waiting...");

        // 3rd type:---------------------->
        // invokeAny() Executes the given tasks, but it only returns the result of one that has completed successfully...
        ExecutorService executor3 = Executors.newFixedThreadPool(1);
        try {
            Integer x = executor3.invokeAny(list);
            System.out.println("the result of any first executed task is: "+ x );
        } catch (InterruptedException | ExecutionException e) {
            Thread.currentThread().interrupt();
        }
         executor3.shutdown();
    }
}
