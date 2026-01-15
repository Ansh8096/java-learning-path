package CollectionFrameWorks.Queue.ConcurrentLinkedQueueDemo;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Demo_1 {
    static void main() {
    // 'ConcurrentLinkedQueue' :---->
        // In this there is no unnecessary locking while inserting and retrieving element from this queue...
        // It has also Thread-safe operations...
        // It uses the compare and swap approach(just like in 'cocurrentHashMap')...
        ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.add("Task " + System.currentTimeMillis());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll();
                    System.out.println("Processing: " + task);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start(); consumer.start();
    }
}
