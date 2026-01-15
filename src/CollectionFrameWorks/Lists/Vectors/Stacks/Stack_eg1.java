package CollectionFrameWorks.Lists.Vectors.Stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stack_eg1 {
    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println(stk);
        int popped = stk.pop();// removes top element...
        Integer peeked = stk.peek();
        System.out.println("This is the top element of Stack: " + peeked);
        System.out.println(stk);

        int index = stk.search(1);
        System.out.println("Index of the searched element in the stack from the top element in stack (1-indexed based) is: " + index);

    // Since stack extends vector , we can use its methods also:--
        stk.add(5);
        stk.add(2,100);
        System.out.println(stk);

    // Using linkedList as Stack:---->
        // we should be using 'linkedList' as Stack, because it is more readable (for single threads)...
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addLast(10); // push
        list1.addLast(20); // push
        list1.addLast(30); // push
        list1.getLast(); // peek
        list1.removeLast(); // pop
        list1.size();
        list1.isEmpty();

    // Using ArrayList as Stack :--->
        // But we should not use arrayList as stack , because it makes our code less readable (for single threads) ...
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10); // push
        arrayList.add(20); // push
        arrayList.add(30); // push
        arrayList.get(arrayList.size() - 1 ); // peek
        arrayList.remove(arrayList.size() - 1 ); // pop


    }
}
