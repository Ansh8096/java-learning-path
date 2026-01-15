package MULTI_THREADING.ExecutersFrameworks.CompletableFuture;

import java.util.concurrent.*;

public class moreMethods {

    // 'CompletableFuture.allOf()' method...
    public static void mainMethodFor_CompletableFutureAllOf(String[] args) {

        CompletableFuture<String> CF1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is a Worker Thread...");
            } catch (InterruptedException e) {
                System.out.println("error occurred: " + e);
            }
            return "OK";
        });

        CompletableFuture<String> CF2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is a Worker Thread...");
            } catch (InterruptedException e) {
                System.out.println("error occurred: " + e);
            }
            return "OK";
        });

        // Completes only when all given futures are completed (successfully or exceptionally)...
        // If any one future completes exceptionally, the returned future also completes exceptionally...
        CompletableFuture<Void> future = CompletableFuture.allOf(CF1, CF2); // it will always be void because it don't store the return of any 'CompletableFuture' thread...
        future.join();// returns the result value or throws an exception if we get...
        System.out.println(Thread.currentThread().getName() + " is Main Thread...");
    }


    // Directly applying 'get()' method on 'supplyAsync()' method...
    public static void mainMethodBy_get(String[] args) {
        String CF = null;
        try {
            CF = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " is a Worker Thread...");
                } catch (InterruptedException e) {
                    System.out.println("error occurred: " + e);
                }
                return "OK";
            }).get(); // we can also directly apply the methods...

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("error occurred: " + e);
        }
        System.out.println("Result is: " + CF); // to print the result...
        System.out.println(Thread.currentThread().getName() + " is Main Thread...");
    }

    // Directly applying 'thenApply()' method on 'supplyAsync()' method...
    public static void mainMethodBy_thenApply(String[] args) {
        CompletableFuture<String> CF3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is a Worker Thread...");
            } catch (InterruptedException e) {
                System.out.println("error occurred: " + e);
            }
            return "OK";
        }).thenApply(x-> x+x); // This stage is triggered after supplyAsync completes successfully,It takes "OK" as input (x = "OK") and returns "OKOK"...

        try {
            System.out.println(CF3.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("error occurred: " + e);
        }

        System.out.println(Thread.currentThread().getName() + " is Main Thread...");
    }

    public static void main(String[] args) {
        // By default, Completable Future tasks often run on daemon threads due to the use of ForkJoinPool.commonPool...
        // We can control the thread type by providing a custom executor service, like we did here...
        // The CompletableFuture task itself doesn't dictate whether it's a daemon or user thread...

        ExecutorService executors = Executors.newFixedThreadPool(3);
        CompletableFuture<String> CF4 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is a Worker Thread...");
            } catch (InterruptedException e) {
                System.out.println("error occurred: " + e);
            }
            return "OK";

            // orTimeout() will wait only for the given time for the result...
            // After using 'exceptionally()' our result will store the String we wrote in it,only if timeout happens...
            // Here,we have sent our own type of Thread...
        },executors).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"timely occurred...");

        try {
            System.out.println(CF4.get()); // 'CF4.get()' will have "timely occurred..."
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("error occurred: " + e);
        }

        executors.shutdown();
        System.out.println(Thread.currentThread().getName() + " is Main Thread...");
    }

}
