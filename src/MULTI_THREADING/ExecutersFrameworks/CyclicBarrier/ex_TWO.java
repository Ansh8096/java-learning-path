package MULTI_THREADING.ExecutersFrameworks.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ex_TWO {

    static class subSystem implements Runnable{
        private int initializationTime;
        private String name;
        private CyclicBarrier barrier;

        public subSystem( String name, int initializationTime, CyclicBarrier barrier) {
            this.initializationTime = initializationTime;
            this.name = name;
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
            System.out.println(name + " initialization started...");
            Thread. sleep(initializationTime);
            System.out.println(name + " initialization completed...");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException  e) {
                System.out.println("Error occurred : " + e);
            }
        }
    }

    public static void main(String[] args) {
        int subSystems = 4; // it should have been equal to the number of threads which we are running...

        // This is the 2nd type of constructor in 'CyclicBarrier' class...
        // The second parameter is a barrier action (a runnable task). This task runs once when all 4 threads have reached the barrier...
        CyclicBarrier barrier = new CyclicBarrier(subSystems,()-> System.out.println("All subsystems are up and running. System startup complete..."));

        Thread webServerThread = new Thread(new subSystem("web server",1500, barrier));
        Thread dataBaseThread = new Thread(new subSystem("data base",1500, barrier));
        Thread cacheThread = new Thread(new subSystem("cache ",1500, barrier));
        Thread messageServiceThread = new Thread(new subSystem("messaging service",1500, barrier));

        webServerThread.start(); dataBaseThread.start(); cacheThread.start(); messageServiceThread.start();
    }
}
