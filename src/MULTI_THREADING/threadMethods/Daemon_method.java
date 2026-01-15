package MULTI_THREADING.threadMethods;

public class Daemon_method extends Thread{

    public Daemon_method(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
    }

    public static void main(String... a) throws InterruptedException {
        // Here t1 is the user Thread , the JVM waits for t1 to get finished before ending the process...
//        Daemon_method t1 = new Daemon_method("t1");
//        t1.start();


        Daemon_method t2 = new Daemon_method("t2");
        // Here we set 't2' is the Daemon Thread,(eg: JAVA garbage collector is also a Daemon Thread)...
        // The JVM won't wait for the t2 to get finish, the process will be finished the moment our main method is executed completely...
        t2.setDaemon(true);
        t2.start();
//        Thread.sleep(10);
        System.out.println("main method...");
    }
}
