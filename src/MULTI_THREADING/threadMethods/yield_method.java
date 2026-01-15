package MULTI_THREADING.threadMethods;

public class yield_method extends Thread{

    public yield_method(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " is running...");

            // Yield-method : A hint to the scheduler that the current thread is willing to yield its current use of a processor...
            // means: we are giving hint to the OS and JVM that you can now give chance to another thread also , if there is any...
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        yield_method thread1 = new yield_method("t1");
        yield_method thread2 = new yield_method("t2");

        thread1.start();
        thread2.start();
    }
}
