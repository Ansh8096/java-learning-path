package MULTI_THREADING.VolatileAndAtomicKeyword.AtomicClass;

import java.util.concurrent.atomic.AtomicInteger;

// "AtomicInteger" benefits:----->
// Unlike a normal int, AtomicInteger provides atomic (thread-safe) operations...
// It ensures that when multiple threads increment count at the same time, the updates don’t interfere...
// Internally, it uses CAS (Compare-And-Swap) at the hardware level...

public class SharedVar {
    // here 'count' is a thread safe...
    private AtomicInteger count = new AtomicInteger(0);

    // 'increment' method atomically increases the value by 1 and returns the updated value...
    // Thread-safe → no need to use synchronized
    public void increment(){
        count.incrementAndGet(); // 'incrementAndGet()' is the method to increment 'count'...
    }

    public int getCount(){
        return count.get();
    }

    public static void main(String[] args) {
        SharedVar sv = new SharedVar();

        Thread t1 = new Thread(() ->{
            for (int i=0;i<1000;i++){
             sv.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0;i<1000;i++){
                sv.increment();
            }
        });

        t1.start(); t2.start();

        try {
            t1.join(); t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(sv.getCount());
    }

}
