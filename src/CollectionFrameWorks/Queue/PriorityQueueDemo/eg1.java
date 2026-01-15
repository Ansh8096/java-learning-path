package CollectionFrameWorks.Queue.PriorityQueueDemo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class eg1 {
    static void main() {
    // 'PriorityQueue' is the part of the Queue interface...
    // It orders elements based on their natural ordering (for primitives lowest first)....
    // In this custom comparator can be used for customised ordering...
    // 'PriorityQueue' does not allow null elements...
    // 'PriorityQueue' internal Working:----> It is implemented as a min-heap by default (for natural ordering) , also it uses O(log(n)) for insertion ...

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(20);
        System.out.println(pq); // It is not sorting,So it is not the right way to see the queue...
    // We should use this method to print all elements of the queues...
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


    // 'PriorityQueue' can also be used with our own custom 'comparator'...
        // Queue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(100);
        pq2.add(50);
        pq2.add(150);
        pq2.add(200);

        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }
    }
}
