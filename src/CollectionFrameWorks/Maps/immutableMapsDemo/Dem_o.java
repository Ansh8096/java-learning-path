package CollectionFrameWorks.Maps.immutableMapsDemo;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Dem_o {
    static void main() {
        HashMap<String,Integer> mpp1 = new HashMap<>();
        mpp1.put("A",1);
        mpp1.put("B",2);
        mpp1.put("C",3);

    // 'mpp2 = Collections.unmodifiableMap(mpp1)' :---->
        // This creates a read-only (unmodifiable) view of mpp1...
        // mpp2 points to the same underlying data as mpp1, but you cannot change it through mpp2...
        // Any modification via mpp1 is still reflected in mpp2...
        Map<String, Integer> mpp2 = Collections.unmodifiableMap(mpp1);
        System.out.println(mpp2);
        // mpp2.put("D",4); // Since mpp2 is an unmodifiable view, this will throw:

    // 'Map.of()' :---->
        // Introduced in Java 9,It creates an immutable map directly with given key–value pairs...
        // but it can store only 10 entries not more then that...
        Map<String, Integer> mpp3 = Map.of("Shubham", 92, "Vipu", 95, "Ansh", 98);
        System.out.println(mpp3);
        // mpp3.put("Raj" , 95); // Since mpp3 is immutable, trying to call put() will throw...


    // 'Map.ofEntries()' :---->
        // Introduced in Java 9,Creates an immutable map from multiple Map.entry(...) elements...
        // Same as Map.of(...), but better when you have more than 10 pairs (since Map.of only allows up to 10 entries directly)...
        Map<String, Integer> mpp4 = Map.ofEntries(Map.entry("Vikram", 94), Map.entry("Riya", 96), Map.entry("Ansh", 99));
        System.out.println(mpp4);
        mpp4.put("Rohan",96);
    }
}
