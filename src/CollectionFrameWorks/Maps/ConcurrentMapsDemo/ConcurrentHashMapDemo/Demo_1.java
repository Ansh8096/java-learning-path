package CollectionFrameWorks.Maps.ConcurrentMapsDemo.ConcurrentHashMapDemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo_1 {
    static void main() {

        // Map<Integer,String> map2 = new ConcurrentHashMap<>();
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

            // 'ConcurrentHashMap' in Java 7 --> uses segment based locking --> default 16 segments --> means smaller hashmaps
            // In this Only the segment being written to or read from is locked...
            // operations like-> read: do not require locking unless there is a write operation happening on the same segment...
            //                   write: lock is necessary...

            // 'ConcurrentHashMap' in java 8 --> has no segmentation
            // 'ConcurrentHashMap' here uses --> Compare-And-Swap approach --> in which there is no locking except when we are 'resizing' or in the case of 'collision'...
            // For eg :->  Thread-A last saw --> x = 45
            //             Thread-A work is to make 'x' to 50
            //             here, it will work like this: if x is still 45, then change it to 50 else don't change and retry the same process...
            // It will also work like this in the map -> while using methods like : put(),set(),modify() etc....

    // If we want to use a map that is thread-safe and stores data in a sorted manner then we should use 'ConcurrentSkipListMap'...
    // 'ConcurrentSkipListMap' stores data in a data structure (called 'skipList')...
    }
}
