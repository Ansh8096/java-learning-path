package MULTI_THREADING.ExecutersFrameworks.Examples;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.concurrent.*;

// SCHEDULED EXECUTED SERVICE :------------------------------------------->
public class MAIN_4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 'newCachedThreadPool()' method() in 'Executors' class :-------------->
        // It creates an ExecutorService backed by a thread pool that:
        // Creates new threads as needed (no fixed size) and also reuses previously created threads when they are available.
        // If a thread has been idle for 60 seconds, it is terminated and removed from the pool , So it’s like a "smart thread pool" that grows/shrinks automatically.
        ExecutorService executor = Executors.newCachedThreadPool();


        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    //  'scheduler.schedule()' method:------>
        // ScheduledFuture<?> scheduledFuture = scheduler.schedule(() -> System.out.println("the task is running after 2 seconds..."), 2, TimeUnit.SECONDS); // Schedules your task (System.out.println(...)) to run after 2 seconds , and also It immediately returns a ScheduledFuture<?> (you could use it to cancel if needed).
        // scheduler.shutdown(); // here, the schedular waits for the task to gets completed because it sent in the queue...

    // 'scheduler.scheduleAtFixedRate' method:--------->
        // it can cause overlapping of Tasks...
//        scheduler.scheduleAtFixedRate(()-> System.out.println("the task is running after every 2 seconds!"),2,2,TimeUnit.SECONDS); // Here: this periodic task will run in every '2' seconds each with a delay of '2' seconds...
        // scheduler.shutdown(); // Here: shutdown() tells the scheduler “don’t accept new tasks” and, more importantly, it also prevents periodic tasks from continuing after the first one...

        // we initialize this task just to properly shutDown out tasks that are running at fixer rates...
        // Since you’re shutting down at 6s, So the periodic task runs only 3 times (at 2s, 4s, 6s) , After this  the scheduler stops accepting new tasks ...
//        scheduler.schedule(()-> {
//                    System.out.println("The schedule is shuttingDown...");
//                    scheduler.shutdown();
//                },6,TimeUnit.SECONDS);


    // 'scheduler.scheduleWithFixedDelay()' method:-------->
        // Runs tasks with a gap (delay) after finishing the previous one.
        // 2 (first): initial delay → wait 2 seconds before the very first run.
        // 2 (second): delay between tasks → wait 2 seconds after the previous task finishes , which avoids overlapping...
        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(() -> System.out.println("the task is running after every 2 seconds!"), 2, 2, TimeUnit.SECONDS);

        ScheduledFuture<?> scheduledFuture2 = scheduler.schedule(() -> {
            System.out.println("The schedule is shuttingDown...");
            scheduler.shutdown();
//            return "Return Statement...";
        }, 6, TimeUnit.SECONDS);// Since shutdown() was called exactly at t=6s, the task at t=6s runs, but no more tasks after that.

        System.out.println(scheduledFuture2.get()); // we will get null because 'scheduledFuture2' doesn't return anything...

    }

}
