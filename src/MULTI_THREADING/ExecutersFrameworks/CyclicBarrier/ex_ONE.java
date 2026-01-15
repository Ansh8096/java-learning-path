package MULTI_THREADING.ExecutersFrameworks.CyclicBarrier;

import java.util.concurrent.*;

// WHEN TO USE CYCLIC BARRIER :- 1. In reusability,because we can reset our barrier (unlike in 'CountDown')...
// 2. We use this when we want to make sure that all of our threads to reach at some point before any of them proceeds...
public class ex_ONE {
    static class DependentService implements Callable<String> {
        private CyclicBarrier barrier;

        public DependentService(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " service started...");
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier...");
            // Makes the current thread wait until all parties (here, 3 threads) have called await()...
            // Once all required threads arrive, the barrier “trips”: all waiting threads are released at the same time...
            barrier.await(); // Each worker thread will cal this...
            return "OK";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;
        ExecutorService executors = Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
        Future<String> future1 = executors.submit(new ex_ONE.DependentService(barrier));
        Future<String> future2 = executors.submit(new ex_ONE.DependentService(barrier));
        Future<String> future3 = executors.submit(new ex_ONE.DependentService(barrier));

        // If some threads were already waiting at the barrier, they all get a BrokenBarrierException...
        // barrier.reset();  // It resets the barrier to its initial state ,Count of waiting threads → set back to 0...

        // This will print in the starting only because , 'CyclicBarrier' can't hold the main Thread...
        System.out.println("All dependent services finished. Starting main service...");
        executors.shutdown();
    }
}
