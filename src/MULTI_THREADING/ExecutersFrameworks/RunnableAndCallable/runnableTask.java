package MULTI_THREADING.ExecutersFrameworks.RunnableAndCallable;

public class runnableTask implements Runnable{

    // Here: in the 'run' method when we want to send our thread to sleep, we need to surround it with try/catch unlike in Callable ...
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
