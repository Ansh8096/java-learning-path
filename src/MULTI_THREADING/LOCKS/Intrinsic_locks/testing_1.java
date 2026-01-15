package MULTI_THREADING.LOCKS.Intrinsic_locks;

public class testing_1 {
    public static void main(String... a) {
        Counter counter = new Counter();
        My_THREAD t1 = new My_THREAD(counter);
        My_THREAD t2 = new My_THREAD(counter);

        t1.start(); t2.start();

        // here we are waiting for our Threads to finish execution...
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        // I should get the total count here:2000,but we are not sure that we will get...
        // because both the threads may read the same value together and update it together which can get us a wrong output...
        // System.out.println(counter.getCount());

        // To get the correct output or to make our threads work in a synchronized way...
        // We should use the Synchronized keyWord in our main class where threads are doing modification to data which is shared b/w the threads...
        System.out.println(counter.getCount());
    }
}