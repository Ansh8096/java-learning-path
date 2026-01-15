package CollectionFrameWorks.Queue.QueueOverview;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_1 {
    static void main() {
// Queue Implementations:-
    // 1. We can use LinkedList as the Queue:--->
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(3); // Enqueue
        list.addLast(6); // Enqueue
        list.addLast(5); // Enqueue
        System.out.println(list.peek()); // peek
        System.out.println(list.getFirst()); // peek
        System.out.println(list.removeFirst());// Dequeue
        System.out.println(list);



    //2. We can use Queue as reference here, because 'LinkedList' Implements Queue...
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);// Enqueue
        queue.add(6);// Enqueue
        queue.add(5);// Enqueue
        System.out.println(queue.peek()); // peek
        System.out.println(queue.remove()); // Dequeue
        System.out.println(queue);
    }
}
