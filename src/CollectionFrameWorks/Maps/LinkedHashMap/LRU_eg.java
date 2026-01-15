package CollectionFrameWorks.Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_eg<K,V>  extends LinkedHashMap<K,V> {
    private int capacity;

    public LRU_eg(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    // We made our own custom logic...
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        boolean b = size() > capacity; // remove eldest when exceeding capacity...
        return b;
    }

    public static void main(String[] args) {
        LRU_eg<String,Integer> mpp = new LRU_eg<>(3);
        // It will remove the recent added/used 'entry' in the 'map' when it size increases our 'capacity' (because of our logic)...
        mpp.put("Bob",98);
        mpp.put("Alice",97);
        mpp.put("Ansh",99);
        mpp.get("Bob");
        mpp.put("Vipul",98);

        System.out.println(mpp);
    }
}
