package MULTI_THREADING.LOCKS.Extrinsic_lOCKS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample{
    // the 'true' parameter means the lock is fair...
    // Fair lock: Threads acquire the lock in the order they requested it (first-come-first-served)...
    // Unfair lock (default = false): The lock may allow threads to “barge” in and acquire it even if other threads were waiting longer (this can improve throughput, but some threads may starve)...
    private final Lock lock = new ReentrantLock(true);
    public void accessResource(){
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " has acquired the lock... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " has released the lock... "); // it should be placed before unlock(),so that thread should print this first and then unlock for consistency...
            lock.unlock();
        }
    }

    public static void main(String... a) throws InterruptedException {
        FairnessLockExample example = new FairnessLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"Thread-2");
        Thread t3 = new Thread(task,"Thread-3");

        // Here 'sleep' will pause the main thread,So that our thread can process in the order we start them...
        t1.start();
        Thread.sleep(50);
        t2.start();
        Thread.sleep(50);
        t3.start();

    }

}
