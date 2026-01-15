package MULTI_THREADING.threadMethods;

// Thread-Methods which we have studied so far: run(),start(),sleep(),join(),setPriority(),interrupt(),yield(),setDaemon()...
public class My_thread extends Thread {

    // This is for setting our thread name...
    public My_thread(String name){
        super(name);
    }


// This for printing 1to5 with 1-1 sec gap...
//    @Override
//    public void run() {
//        System.out.println("MY THREAD IS RUNNING...");
//        for (int i =0;i<=5;i++){
//            try {
//                My_thread.sleep(1000);
//            }
//            catch (InterruptedException e) {
//                System.out.println(e);
//            }
//            System.out.println(i);
//           }
//        }


    // this is for setPriority() method:---->
//    @Override
//    public void run() {
//        for (int i = 0;i<=5;i++){
//            // this loop is just to see our answer clearly...
//            String a = "";
//            for (int j = 0 ; j<100000;j++){
//                a +="a";
//            }
//            System.out.println(Thread.currentThread().getName() + " -priority is " + Thread.currentThread().getPriority() + " - Count:" + i);
//            try {
//                My_thread.sleep(100);
//            }
//            catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }


    @Override
    public void run() {
        try {
            System.out.println("Thread is running...");
            My_thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted : " + e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        My_thread t1 = new My_thread();
//        t1.start();
//        t1.join();
//        System.out.println(t1.getState());
//        System.out.println("hello..."); // this will only execute when our Thread t1 is finished...

        // setting the name of our threads...
//        My_thread l = new My_thread("Low thread");
//        My_thread m = new My_thread("Medium thread");
//        My_thread h = new My_thread("High thread");

        // SetPriority method:---->
        // Setting priority for each of these...
        // Setting priority higher priority means we are telling OS and JVM to give this thread more priority...
        // But we are just giving hint not any strict rule, it works more efficiently on the single-core CPU...
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);
//
//        l.start(); m.start(); h.start();
//        System.out.println(l.getState());

        // Interrupt method of Threads:---->
        My_thread t2 = new My_thread("Ansh");
        t2.start();
        t2.interrupt(); // Interrupt: if our Thread is in sleep, this method will interrupt that Thread...

    }
}
