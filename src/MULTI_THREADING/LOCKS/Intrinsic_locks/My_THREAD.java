package MULTI_THREADING.LOCKS.Intrinsic_locks;

public class My_THREAD extends Thread{

    // Here we are created a variable of 'Counter' class...
    private Counter counter;

    public My_THREAD(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            counter.increment();
        }
    }
}
