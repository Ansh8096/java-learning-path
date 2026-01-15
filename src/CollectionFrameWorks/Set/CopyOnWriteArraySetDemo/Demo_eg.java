package CollectionFrameWorks.Set.CopyOnWriteArraySetDemo;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Demo_eg {
    static void main() {
        // 'CopyOnWriteArraySet' :----->
        // It is Thread-Safe...
        // It follows the Copy-On-Write Mechanism just like it uses in 'CopyOnWriteArrayList'...
        // In this there will be no Duplicate Elements (because of set properties)...
        // In this Iterators Do Not Reflect Modifications...

// Comparing the 'CopyOnWriteArraySet' and 'concurrentSkipListSet' in this example:---
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }
        System.out.println("CopyOnWriteArraySet after modifying: " + copyOnWriteSet);


        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            // Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }
    }
}
