package MULTI_THREADING.ExecutersFrameworks.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) {

        // We can write any task here that we want our Thread to do, but it should be returning something...
        // This task will get finish by separate Thread (not the main Thread)...
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is a Worker Thread...");
            } catch (InterruptedException e) {
                System.out.println("error occurred: " + e);
            }
            return "OK";
        });

        try {
             System.out.println(completableFuture.get()); // if we don't call 'completableFuture.get()' method here then our main method will go ahead without waiting for this thread to get finish...
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("error occurred: " + e);
        }

        // This is a non-blocking method,It immediately returns:
        // The result of the CompletableFuture if it’s already completed,Otherwise, it returns the default value you pass (valueIfAbsent).
        // System.out.println(completableFuture.getNow("Result..."));

        System.out.println(Thread.currentThread().getName() + " is Main Thread...");
        System.out.println();
    }
}
