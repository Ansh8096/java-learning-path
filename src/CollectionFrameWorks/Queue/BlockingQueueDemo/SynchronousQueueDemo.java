package CollectionFrameWorks.Queue.BlockingQueueDemo;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    static void main() {
    // In this Queue,each insertion operation must wait for the corresponding remove operation by another thread and vice versa...
        // 'SynchronousQueue' eg:-->
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        Thread Producer = new Thread(()->{
            try{
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from Producer...");
                System.out.println("Producer has transferred the message...");
            }catch (Exception e){
                System.out.println("Producer was interrupted...");
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Consumer received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");
            }
        });

        Producer.start(); consumer.start();
    }
}
