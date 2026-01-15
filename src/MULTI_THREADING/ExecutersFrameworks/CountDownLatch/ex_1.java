package MULTI_THREADING.ExecutersFrameworks.CountDownLatch;

import java.util.concurrent.*;

// WHEN TO USE COUNT DAWN LATCH :- whenever we want to wait for our multiple thread to finish....
// WHEN TO NOT USE COUNT DAWN LATCH :- In reusability. Once the count reaches zero, it can't be reset...
public class ex_1 {

    static class DependentService implements Callable<String> {
        private CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public String call() throws Exception {
            try{
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " service started...");
            }finally {
                latch.countDown(); // Each task, when finished, will call latch.countDown() (reducing count from 3 → 2 → 1 → 0).
            }
            return "OK";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;
        ExecutorService executors = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices); // Latch initialized with count = 3.
        Future<String> future1 = executors.submit(new DependentService(latch));
        Future<String> future2 = executors.submit(new DependentService(latch));
        Future<String> future3 = executors.submit(new DependentService(latch));

        // future1.get(); future2.get();future3.get(); // It is the manual way make our 'main' thread wait until all the tasks are finished, afterThat it will execute next line...

        latch.await(); // Makes the main thread wait until the latch count reaches 0.

        // latch.await() 2nd type :-------------------->
        // Blocks the main thread for a maximum of 2 seconds.
        // If the latch count reaches 0 before 2s → it returns true.,If 2s passes and latch count is still not 0 → it returns false and the main thread continues anyway.
        // latch.await(2,TimeUnit.SECONDS);
        // executors.shutdownNow(); // It will shut down all the tasks immediately even if they didn't finish within the given time in 'latch.await()'....

        System.out.println("All dependent services finished. Starting main service...");
        executors.shutdown();
    }

}
