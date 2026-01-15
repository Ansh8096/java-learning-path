package CollectionFrameWorks.Set.SetOverviews;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    static void main() {
        // Set is a collection that cannot contain duplicate elements
        // It has faster operations like : put(),get() etc...
        // Set has similar implementations like 'Map' :------->
                // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
                // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

    // It will store keys in unordered manner...
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(67);
        st1.add(6);
        st1.add(1);
        System.out.println(st1);

    // It will store keys in Sorted manner...
        //Set<Integer> st2 = new TreeSet<>(); // we can also use 'Set' interface...
        // NavigableSet<Integer> st2 = new TreeSet<>(); // or we can use 'NavigableSet'(because 'TreeSet' implements 'NavigableSet') as per your choice ...
        SortedSet<Integer> st2 = new TreeSet<>(); // or we can use 'SortedSet'(because 'NavigableSet' implements 'SortedSet') as per your choice ...
        st2.add(1);
        st2.add(67);
        st2.add(6);
        st2.add(1);
        System.out.println(st2.contains(67));
        System.out.println(st2.remove(2)); // Removes the specified element from this set if it is present and return true , else return false...
        System.out.println(st2);
        for(int itt : st2){
            System.out.print(itt + " ");
        }

// FOR THREAD SAFETY :------------->
    // 1st method:-
    // There is a synchronised method in the collections which wraps any data structure methods and operations (like: set,map,list etc.) synchronized:
    // But we should avoid using it because there is no performance , it enables unnecessary locking...
        Set<Integer> stt = new HashSet<>();
        Collections.synchronizedSet(stt);
        synchronized (stt) { // for every method we need to use synchronized keyWord here...
            for (Integer itr : stt) {
                System.out.println(itr);
            }
        }

    // 2nd method:------>
    // we should use this method to achieve Thread Safety....
        // ConcurrentSkipListSet<Integer> stt4 = new ConcurrentSkipListSet<>();
        Set<Integer> stt4 = new ConcurrentSkipListSet<>(); // we can use Set reference...


// Unmodifiable Set:---->
    // 1st method:-->
    // Here: this method can store more than 10 values(unlike in case of map)....
        Set<Integer> stt5 = new HashSet<>();
        Set.of(1,22,3,4,4,5,2,221,212,12,32321321,3213213,3,321,32,1312);

        Set<Integer> stt6 = new HashSet<>();
        Collections.unmodifiableSet(stt6);
    }
}
