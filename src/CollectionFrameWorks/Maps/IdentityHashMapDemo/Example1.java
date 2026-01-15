package CollectionFrameWorks.Maps.IdentityHashMapDemo;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Example1 {
    static void main() {
// When we are using 'HashMap' :--->
    // Both key1 and key2 are different objects in memory (new String() always makes a fresh object)...
    // However, their content ("Key") is the same...
    // In Java, String overrides equals() and hashCode() → comparison is by value, not by memory address...
        // String key1 = new String("Key");
        // String key2 = new String("Key");
        // HashMap<String,Integer> mpp = new HashMap<>();
        // mpp.put(key1,10); // key --> index1
        // mpp.put(key2,10); // key --> index1 --> equals --> replace
        // System.out.println(key1.hashCode());
        // System.out.println(key2.hashCode());
        // System.out.println(key1.equals(key2)); // because of this method we get 'true' and  our 'value' gets replaced...
        // System.out.println(mpp);


// When we are using 'IdentityHashMap' :--->
    // Unlike 'HashMap', it does not use .equals() and .hashCode().
    // Instead, it uses '==' (reference equality) and 'identityHashCode()' to compare keys.
        String key1 = new String("Key");
        String key2 = new String("Key");
        IdentityHashMap<String,Integer> mpp = new IdentityHashMap<>();
        mpp.put(key1,10); // key --> index1
        mpp.put(key2,10); // key --> index1
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        // In IdentityHashMap, they are considered as different keys because:
        System.out.println(key1 == key2); // (key1 == key2) → 'false' , so both the keys will get stored in the map...
        System.out.println(mpp);
    }
}
