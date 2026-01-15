package MULTI_THREADING.LOCKS.Intrinsic_locks;

public class Counter {
    private int count = 0;

    // 'synchronized' keyWord will not allow to do modification to our data together...
    // If we don't want to make our whole method synchronized, then we can use synchronized block on the specific part...
    // This is known as intrinsic locking (automatic locking)...
    // These types of locks make the other Thread (which is not executing right now) to wait, until the Thread(that is being executed) is finished executing ...
    public synchronized void increment(){
        // Here: 'this' means we are only allowing one instance to access the synchronized block at a time (if there are multiples instances)...
        // synchronized (this){
        //    count++; // critical section...
        // }

        count++;
    }

    public int getCount() {
        return count;
    }
}
