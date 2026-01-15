package MULTI_THREADING.example_1;

public class test1 {
    public static void main(String... a){

        // System.out.println(Thread.currentThread().getName());
        // with this,I can get our current running thread name in a process...
        // Here: both the threads our running together , and we can get the output by them in any order...
        // if we try to run two infinite loops in the main func. the second infinite loop will not run ever,but with the help of multi-threading we can run two infinite loops at a same time...

        // This is the steps when we create thread by extending Thread class...
        //World world = new World(); // this the 'NEW' state of thread..
        //world.start(); // this method is called to initiate the new thread,and it is the 'RUNNABLE' state of thread...

        // This is the steps when we create thread by implementing Runnable interface...
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();


        for (int i = 0;i<100;i++){
//            System.out.println("hello");
            System.out.println(Thread.currentThread().getName());
            }
        }

    }
