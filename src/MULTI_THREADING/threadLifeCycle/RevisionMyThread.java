package MULTI_THREADING.threadLifeCycle;

public class RevisionMyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RevisionMyThread t1 = new RevisionMyThread();
        System.out.println(t1.getState()); // New state...
        t1.start();
        System.out.println(t1.getState()); // Runnable state...

        myThread.sleep(1000);
        System.out.println(t1.getState()); // timed Waiting state...

        t1.join();
        System.out.println(t1.getState()); // Terminated State...
    }
}
