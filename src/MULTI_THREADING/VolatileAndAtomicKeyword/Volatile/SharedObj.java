package MULTI_THREADING.VolatileAndAtomicKeyword.Volatile;

// If we don't use the "volatile" keyWord:--->
// In Java, threads cache variables means creating the copy of every variable in the cache memory (each thread might see its own version of flag).
// If the 'readerThread' runs before 'writerThread',then it may read 'flag = false' (even after it becomes true by 'writerThread)...
// With this the readerThread will be keep seeing the old cached false forever and will be stuck forever...

// After using "volatile" keyWord :-->
// volatile means:
// Always read and write directly from main memory, not from a thread’s local cache.
// Ensures visibility: when writerThread sets flag = true, the readerThread immediately sees the updated value.

public class SharedObj {
    private volatile boolean flag = false;

    public void SetFlagTrue(){
        System.out.println(Thread.currentThread().getName() + " made the flag true...");
        flag = true;
    }

    public void getFlagOnlyIfTrue(){
        while(!flag){
            // do nothing...
        }
        System.out.println(Thread.currentThread().getName() + " reads the flag true...");
    }

    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.SetFlagTrue();

        } , "writerThread");
        Thread readerThread = new Thread(() -> sharedObj.getFlagOnlyIfTrue() , "readerThread");

        writerThread.start(); readerThread.start();

        System.out.println("Main Thread...");
    }
}
