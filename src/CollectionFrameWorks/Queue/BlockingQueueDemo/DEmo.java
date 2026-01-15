package CollectionFrameWorks.Queue.BlockingQueueDemo;

import java.io.StringBufferInputStream;
import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class DEmo {
    static void main(){

//'BlockingQueue' features:---->
    // It is a thread-safe queue...
    // It waits for queue to become non-empty (before taking an element)/ it also wait for space (before adding an element in the queue)...
    // It simplifies concurrency problems like producer-consumer...
    // 'standard-queue' features --> it performs operations immediately.
        // When queue is empty --> it remove element fron the Queue (no waiting)
        // When queue is full --> it add element in the Queue (no waiting)
    // 'Blocking-queue' features:---> Its methods that are very useful,such as:
        // 'put' (used for adding element in the queue) --> Blocks,if the queue is full (until space becomes available) ,before adding element...
        // 'take' ((used to get element from the queue)) --> Blocks,if the queue is empty until (an element becomes available)...
        // 'offer' (used for adding element in the queue) --> Waits for space to become available, up to the specified timeout,before adding element...

// 'BlockingQueue' interface implementation using:-->
    // 1. ArrayBlockingQueue :
        // It is said to be as bounded (The queue is created with a specific, unchangeable size limit), blocking queue backed by circular array...
        // low memory overhead...
        // It uses a single lock for both enqueue and dequeue operations...
        // In case of more threads , it can cause problems (like frequently locking,can take too much time)...
        BlockingQueue<Integer> bq1 = new ArrayBlockingQueue<>(5);
        Thread producerThread = new Thread(new Producer(bq1));
        Thread consumerThread = new Thread(new Consumer(bq1));
        // producerThread.start(); consumerThread.start();

    // 2. LinkedBlockingQueue :
        // It is said to be Optionally bounded(means we can set the capacity value),it is backed by LinkedList...
        // It uses two separate locks for enqueue and dequeue operations...
        // It has Higher concurrency between producers and consumers...
        BlockingQueue<Integer> Bq2 = new LinkedBlockingQueue<>(100); // We can give the total capacity,else if we don't give then it will take 'Integer_Max' as capacity (by default)...

    // 3. PriorityBlockingQueue :
        // It is said to be unbounded,So 'put' method won't block because space will be there for inserting the element in the queue everytime...
        // It uses Binary Heap as array and can grow dynamically...
        // In this Head is based on their natural ordering or by a provided Comparator (just like in: priority queue)...

        //BlockingQueue<String> Bq3 = new PriorityBlockingQueue<>(); // giving the custom comparator,along with the default capacity...
        BlockingQueue<String> Bq3 = new PriorityBlockingQueue<>(11,(Comparator.reverseOrder())); // giving the custom comparator,along with the default capacity...
        Bq3.add("apple");
        Bq3.add("banana");
        Bq3.add("cherry");
        System.out.println(Bq3);




    }
}


class Producer implements Runnable{
    BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("The Producer produced: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");;
            }
        }
    }
}

class Consumer implements Runnable{
    BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Integer taken = queue.take();
                System.out.println("The Consumer consumed: " + taken);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");;
            }
        }
    }
}

