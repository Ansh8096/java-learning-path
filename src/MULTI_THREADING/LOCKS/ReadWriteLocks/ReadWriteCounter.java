package MULTI_THREADING.LOCKS.ReadWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;

    // Here 'ReadWriteLock' is an interface that is implemented by the 'ReentrantReadWriteLock' class...
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    // 'readLock' and 'writeLock' are the methods in the 'ReentrantReadWriteLock' class...
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    // writeLock.lock() → only one thread can hold this at a time. Writers block both other writers and readers...
    public void increment (){
        writeLock.lock();  // acquire exclusive write lock...
        try{
            count++;// only one thread can update at a time...

            // When our writerThread will be sleep,the CPU will allow other threads to process...
            // CPU may context-switch and schedule other threads, but they’ll block at writeLock.lock() until the sleeping thread releases it...
            Thread.sleep(50);
        }catch (Exception e) {
            System.out.println(e);
        }finally{
            writeLock.unlock();   // finally { unlock(); } → ensures the lock is always released (even if an exception happens)...
        }
    }

    // readLock.lock() → many threads can hold this simultaneously as long as no writer has the lock...
    public int getCount(){
        readLock.lock();    // Acquire shared read lock , multiple thread can acquire this type of lock at once (unlike in synchronized lock)...
        try{
            return count;   // multiple threads can safely read simultaneously...
        }finally {
            readLock.unlock(); // release lock...
        }
    }

    public static void main(String... a) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable write = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented..." );
                }
            }
        };

        Runnable read = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                }
            }
        };

        Thread thread1 = new Thread(write,"writerThread");
        Thread thread2 = new Thread(read,"readerThread1");
        Thread thread3 = new Thread(read,"readerThread2");

        thread1.start();thread2.start(); thread3.start();

        thread1.join();thread2.join();thread3.join();

        System.out.println("Final counter : " + counter.getCount());
    }
}
