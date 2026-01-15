package MULTI_THREADING.threadLifeCycle;

public class myThread extends Thread{

    @Override
    public void run() { // we can't throw error here because it is an overridden method...
        System.out.println("myThread is running...");

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException { // it can throw InterruptedException because of 'myThread.sleep()' func...
        myThread thread1 = new myThread();
        System.out.println(thread1.getState()); // this will give the 'NEW' state...
        thread1.start();
        System.out.println(thread1.getState()); // this will give the 'Runnable' state...

        // this will give the state of the current thread ...
        // Here we should have get 'RUNNING' but instead we get 'RUNNABLE', because 'RUNNING' is not present in JAVA...
//        System.out.println(Thread.currentThread().getState());

        // It will stop the main method for 100 millisecond , in the meantime the OS will call the other Thread...
        Thread.sleep(100);
//        System.out.println(Thread.currentThread().getState()); // it will print after 100 millisecond in the output, because of 'sleep()' method...

        System.out.println(thread1.getState()); // this will give the 'TIMED_WAITING' state...

        // 'thread1.join()' method will cause the main method to wait for the thread1 to get finish...
        thread1.join();
        System.out.println(thread1.getState()); // this will give the 'TERMINATED' state...
    }
}
