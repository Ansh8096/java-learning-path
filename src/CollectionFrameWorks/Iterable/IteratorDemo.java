package CollectionFrameWorks.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    static void main() {
        List<Integer> list1 = new ArrayList<>();
         for(int i : list1) System.out.println(i+ " ");

        // This is the internal Working of the for-each loop....
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) { // loop runs till there is next value...
            System.out.println(iterator.next()); // print all the elements of the list...
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

    // This will give us a 'ConcurrentModificationException' error ,because I am trying to update the list during traversing...
        // To overcome this error , I can use 'CopyOnWriteArrayList' or  we can use the 'iterator'...
        // for (int number: integerList){
        //     if((number&1) == 0){
        //         integerList.remove(Integer.valueOf(number));
        //     }
        // }

    // Removing elements while traversal using 'Iterator'...
        // because, it provides a functionality to remove while iterating...
        Iterator<Integer> iteratorList = integerList.iterator();
        while(iteratorList.hasNext()){
            Integer itr = iteratorList.next();
            if((itr&1)==0){
                iteratorList.remove();
            }
        }
        System.out.println(integerList);


    // Iterators more methods:------->
        ListIterator<Integer> itr = integerList.listIterator(); // '.listIterator()' enables more methods...
        itr.nextIndex();
        System.out.println(itr.hasNext());

        // while(itr.hasNext()){
        //      itr.set(2); // Replaces the last element returned by next or previous with the specified element (optional operation)...
        // }
        System.out.println(integerList);
    }
}
