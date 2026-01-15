package CollectionFrameWorks.Lists.LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class In_built_LL{
    public static void main(String[] args) {

        // Here : this 'LinkedList' class has doubly linked list...
        List<Integer> LIST = new LinkedList<>(); // we can also take the parent class reference (i.e 'List') , but then we will not be able to use 'LinkedList' methods here...
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.get(1); // O(n)
        list1.addFirst(5); // O(1)
        list1.addLast(50); // O(1)
        System.out.println(list1);
        // list1.remove(Integer.valueOf(5));

        // removing all the evens from the LinkedList...
        list1.removeIf(x -> (x&1) == 0); // this method takes predicate (predicate means something that returns true or false)...
        System.out.println(list1);

        // Creating Linked List from List...
        LinkedList<String> AnimalList1 = new LinkedList<>(Arrays.asList("Dog","Cat","Elephant","Lion"));
        LinkedList<String> AnimalList2 = new LinkedList<>(Arrays.asList("Dog","Lion"));

        AnimalList1.removeAll(AnimalList2); // it removes all the elements of 'AnimalList2' from 'AnimalList1'...
        System.out.println(AnimalList1);


    }
}
