package CollectionFrameWorks.Queue.BlockingQueueDemo.DelayQueueDemo;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


public class deMO {
    static void main() throws InterruptedException {
        // 'BlockingQueue' :--------->
        // It is a Thread-safe unbounded blocking queue...
        // In this Elements can only be taken from the queue when their delay has expired...
        // It is Useful for scheduling tasks to be executed after a certain delay...
        // Its internally working is like : priority queue...
        BlockingQueue<delayedTask> delayQueue = new DelayQueue<>();
        delayQueue.put(new delayedTask("Task1", 5, TimeUnit.SECONDS));
        delayQueue.put(new delayedTask("Task2", 3, TimeUnit.SECONDS)); // this will be removed first because it has less delay than others...
        delayQueue.put(new delayedTask("Task3", 10, TimeUnit.SECONDS));

        while (!delayQueue.isEmpty()) {
            delayedTask task = delayQueue.take(); // Blocks until a task's delay has expired
            System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }
}
class delayedTask implements Delayed{

    private final String taskName;
    private final long startTime;

    public delayedTask(String taskName, long delay,TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(@NotNull TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(@NotNull Delayed o) {
        if (this.startTime < ((delayedTask) o).startTime) {
            return -1;
        }
        if (this.startTime > ((delayedTask) o).startTime) {
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}
