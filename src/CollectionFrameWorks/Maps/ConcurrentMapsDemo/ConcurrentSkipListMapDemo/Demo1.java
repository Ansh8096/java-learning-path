package CollectionFrameWorks.Maps.ConcurrentMapsDemo.ConcurrentSkipListMapDemo;

import java.util.concurrent.ConcurrentSkipListMap;

public class Demo1 {
    static void main() {
        ConcurrentSkipListMap<Integer,String> mpp = new ConcurrentSkipListMap<>();
        mpp.put(1,"Ansh");
    }
}
