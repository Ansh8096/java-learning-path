package CollectionFrameWorks.Queue.DequeueDemo.ConcurrentLinkedDequeueDemo;

import java.util.concurrent.ConcurrentLinkedDeque;

public class DeMO {
    static void main() {
        // It is a non-blocking,Thread-Safe double-ended-dequeue...
        // It also uses Compare and Swap approach (just like : 'ConcurrentLinkedQueue')...
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element-1");
        deque.addFirst("Element-0");
        deque.addLast("Element-3");
        System.out.println(deque);

        String last = deque.getLast();
        String First = deque.getFirst();
        System.out.println(last);
        System.out.println(First);
    }
}
