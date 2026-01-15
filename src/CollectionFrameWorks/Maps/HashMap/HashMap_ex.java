package CollectionFrameWorks.Maps.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_ex {
    public static void main(String[] args) {
        HashMap<Integer,String> mpp = new HashMap<>();
        // O(1) operations...
        mpp.put(1,"Ansh");
        mpp.put(2,"Riya");
        mpp.put(3,"Sakshi");
        System.out.println(mpp);

        String val1 = mpp.get(2); // to get the value corresponding to that particular key...
        System.out.println(val1);
        System.out.println(mpp.get(19)); // we will get 'null' because this key is not present in the map...
        System.out.println(mpp.containsKey(2)); // this returns 'true' if the key is present in the map,else 'false'....
        System.out.println(mpp.containsValue("Robin")); // this returns 'true' if the value is present in the map,else 'false'....

    // more methods in HashMap:---
        System.out.println(mpp.getOrDefault(4, "Jenny")); // if the value corresponding to this key is present , return that else return the defaultValue...
        mpp.putIfAbsent(5,"Selena"); // put this value for this key ,only if it is not present previously...
        System.out.println(mpp.get(5)); // it will return "Selena"...

// For applying loop on the map:----
    // 1st method :->
        Set<Integer> keys = mpp.keySet();
        for (Integer itt : keys){
            System.out.println( itt + ": "+ mpp.get(itt));
        }

    // 2nd method :-> By this method we can use various methods:->
        Set<Map.Entry<Integer, String>> entries = mpp.entrySet();
        for (Map.Entry<Integer, String> entry : entries){ // 'Map.Entry<Integer, String>' is a datatype of our map entries here...
            entry.setValue(entry.getValue().toUpperCase()); // we can apply 'upperCase()' method on our values...
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    // Removing methods:--->
        mpp.remove(3); // It will remove the value corresponding to the key, if it is present...
        boolean res = mpp.remove(2, "Raj");// It will remove the matching value and key, if it is present...
        System.out.println("Removed? : " + res);
        System.out.println(mpp);
    }
}
