package MULTI_THREADING.LOCKS.Extrinsic_lOCKS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Since the lock is 'reentrant' here, so we will not have a 'deadlock' here...
// 'deadlock' prevention in 'reentrant' is automatically...
public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    // The 'reentrantLock' class maintains the count, which increments for lock() and decrements for unlock()...
    // If the count becomes zero in b/w the middle the process,then the other Thread can begin,which causes inconsistency...
    // So the each lock() call should be pair with an unlock() call correctly...
    // 'Reentrancy' can also get achieved by 'synchronized'...
    public void outerMethod(){
            lock.lock();
        try {
            System.out.println("Outer Method...");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner method...");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        ReentrantExample example2 = new ReentrantExample();
        example.outerMethod();
        example2.outerMethod();
    }
}
