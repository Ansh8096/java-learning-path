package MULTI_THREADING.example_1;

// A new class world is created that extends thread (we can also implement Runnable interface)...
// the run method is overridden to define the code that constitutes the new thread...
// public class World extends Thread{
public class World implements  Runnable{

    // the run method contains the code that will be executed in the new thread...
    @Override
    public void run() {

        for(int i = 0; i < 100; i++ ){
//            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
