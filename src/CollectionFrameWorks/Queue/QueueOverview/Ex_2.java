package CollectionFrameWorks.Queue.QueueOverview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Ex_2 {
    static void main() {

    // Queue has multiple methods for each operation:--->
        Queue<Integer> queue = new LinkedList<>();
        // System.out.println(queue.remove()); // It throw an exception if Queue is empty...
        System.out.println(queue.poll()); // It doesn't throw an exception if Queue is empty...

        System.out.println(queue.peek()); // It doesn't throw an exception if Queue is empty...
        // System.out.println(queue.element()); // It throws an exception if Queue is empty...

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(2)); // true
        System.out.println(queue2.offer(4)); // true

        // System.out.println(queue2.add(3)); // It throw error if we add elements in the queue when it is already full...
         System.out.println(queue2.offer(3)); // It will not throw error if we add elements in the queue when it is already full...
    }
}
