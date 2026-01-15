package CollectionFrameWorks.Queue.DequeueDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class demo {
    static void main() {
        // 'Deque' means-> double-ended queue...
        // It allows insertion and removal of elements from both ends...
        // It is versatile than regular queues and stacks because it supports operations of both...

        /* INSERTION METHODS
           addFirst(E e): Inserts the specified element at the front.
           addLast(E e): Inserts the specified element at the end.
           offerFirst(E e): Inserts the specified element at the front if possible.
           offerLast(E e): Inserts the specified element at the end if possible.   */

        /* REMOVAL METHODS
            removeFirst(): Retrieves and removes the first element.
            removeLast(): Retrieves and removes the last element.
            pollFirst(): Retrieves and removes the first element, or returns null if empty.
            pollLast(): Retrieves and removes the last element, or returns null if empty.     */

        /* EXAMINATION METHODS
            getFirst(): Retrieves, but does not remove, the first element.
            getLast(): Retrieves, but does not remove, the last element.
            peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
            peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.     */

        /* STACK METHODS
            push(E e): Adds an element at the front (equivalent to addFirst(E e)).
            pop(): Removes and returns the first element (equivalent to removeFirst())..     */


    // 'Dequeue' using ArrayDequeue:---->
        //  faster iteration (because it uses 'contigious' memory locations), it also takes low memory, and there no null values allowed...
        // It uses circular Array Structure...
        // It takes constant time for insertion,because there is no need to shift elements, It just shifts head and tail...
        // insertionAtFirst (head--) , deletionAtFirst(head++) , insertionAtLast(tail++) , deletionAtLast(tail--) ,
        // when the circular-array is full it doubles its size...
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(5);  // 5
        dq.addLast(4);   // 5,4
        dq.offerFirst(6);// 6,5,4
        dq.offerLast(8); // 6,5,4,8
        System.out.println(dq);
        System.out.println("First element: " + dq.peekFirst()); // 6
        System.out.println("First element: " + dq.getLast());   // 8
        dq.removeFirst(); // 5,4,8
        dq.removeLast();  // 5,4
        for(int itt : dq) System.out.println(itt);

    // 'Dequeue' using as LinkedList:----->
        // We will use this when we want insertion, deletion somewhere in middle of the 'Dequeue'...
        Deque<Integer> dq2 = new LinkedList<>();

    }
}
