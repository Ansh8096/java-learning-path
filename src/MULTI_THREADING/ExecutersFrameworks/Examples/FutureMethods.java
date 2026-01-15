package MULTI_THREADING.ExecutersFrameworks.Examples;

import java.util.concurrent.*;

public class FutureMethods {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<?> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("The task is running...");
            } catch (InterruptedException e) {
                System.out.println("Error occured: " + e);
            }
            return 42;
        });

        // future 'get()' method with time :----->
//        try {
//            Integer i = future.get(1, TimeUnit.SECONDS); // if the future doesn't get it task complete within the given period of time, then we will have an 'TimeoutException'...
//            System.out.println(future.isDone());
//            System.out.println(i);
//        } catch (InterruptedException | ExecutionException | TimeoutException e) {
//            System.out.println("Error occur: " + e);
//        }
//        executorService.shutdown();


    // future 'cancel()' method : Attempts to cancel the running task...
        try {
            Thread.sleep(1000); // we are waiting '1' sec, so that our submitted task can start and 'future.cancel(false)' method will not be able to interrupt...
        } catch (InterruptedException e) {
            System.out.println("Error occur: " + e);
        }
        future.cancel(false); // cancel(false) → if the task has started, let it finish but don’t start if it hasn’t begun...
        // future.cancel(true); // cancel(true) → if the task is already running or not, it just interrupts it (sends an interrupt signal)...
        System.out.println(future.isCancelled()); // Returns true if the task was successfully cancelled before it finished normally...
        System.out.println(future.isDone());
        executorService.shutdown();
    }
}
