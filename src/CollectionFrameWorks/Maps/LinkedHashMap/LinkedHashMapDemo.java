package CollectionFrameWorks.Maps.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        // LinkedHashMap is also not ThreadSafe...
        // Unlike HashMap, it maintains insertion order OR access order, depending on how you construct it...
        // Order mode →
        // false (default): maintains insertion order...
        // true: maintains access order → recently accessed entries move to the end (and least recently used entries at start)...
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.75f,true); // Internally, it uses a doubly linked list to maintain ordering of elements
        linkedHashMap.put("Orange",1);
        linkedHashMap.put("Apple",2);
        linkedHashMap.put("Banana",3);

        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Banana");

        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> Et : entries){
            System.out.println(Et.getKey() + ": "+ Et.getValue());
        }

    // Creating linkedHashMap from HashMap:---
        HashMap<Integer,String> mpp = new HashMap<>();
        LinkedHashMap<Integer,String> mpp2 = new LinkedHashMap<>(mpp);


    }
}
