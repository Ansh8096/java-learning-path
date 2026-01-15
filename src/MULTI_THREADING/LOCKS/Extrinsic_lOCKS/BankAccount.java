package MULTI_THREADING.LOCKS.Extrinsic_lOCKS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// LOCK MAIN METHODS: 1. lock(): this method will make the new Thread to wait,until it get to use the method it wants...
// 2. tryLock(time,timeUnit): this method will make the new Thread to wait,only for the given time,if the Thread doesn't get the method until that given time then it will go to else statement...
// 3. tryLock(): this method will not make the new Thread to wait,if the method is available, the Thread will execute it, else it will go to else statement...
// 4. unlock(): this method is the necessary to do when you use your own manual lock,It means after any thread is done using this method, then it will unlock this method for other Threads...

public class BankAccount {
    private double balance = 100.0;

    // Here 'ReentrantLock' is a class that implements the 'Lock' interface...
    Lock lock = new ReentrantLock();
    public void withdrawAmount(double amount){

        try {
            // It means the new thread that will try to use this method will only wait for '1000' milliSecond...
            // If it doesn't get to use it under that time, then it won't wait anyMore and run else-statement...
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                System.out.println( Thread.currentThread().getName() + " attempting to withdraw " + amount);
                if(balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance + "\n");
                    } catch (InterruptedException e) {
                        // It is a good practice to do, because you are acquiring the state where you get the exception...
                        // Now that you have that state acquired, so you can perform special task if you want...
                        Thread.currentThread().interrupt();
                    }finally {
                        // This is the necessary to do when you use your own manual lock...
                        // It means after any thread is done using this method, then it will unlock this method for other Threads...
                        lock.unlock();
                    }
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance" + "\n" );
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + " wasn't able to acquire the lock, will try again later...");
            }
        }
        catch (InterruptedException e) {
            // It is a good practice to do, because you are acquiring the state where you get the exception...
            // Now that you have that state acquired, so you can perform special task if you want...
            Thread.currentThread().interrupt();
        }

        // this is the special task,which we can perform if, we got any exception...
        if(Thread.currentThread().isInterrupted()){
            System.out.println("We got an exception here...");
        }
    }

    // This is while using the automatic lock method...
    private synchronized void withdrawAmount1(double amount){
        System.out.println( Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance + "\n");
        }
        else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance" + "\n" );
        }

    }
}
