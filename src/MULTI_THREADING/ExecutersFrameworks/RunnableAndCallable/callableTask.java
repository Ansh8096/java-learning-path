package MULTI_THREADING.ExecutersFrameworks.RunnableAndCallable;

import java.util.concurrent.Callable;

public class callableTask implements Callable {

    // Here: in the 'call' method when we want to send our thread to sleep, we don't need to surround it with try/catch because,'throws exception' is already added in the method signature unlike Runnable...
    @Override
    public Object call() throws Exception {
        Thread.sleep(10);
        return "Hello";
    }
}
