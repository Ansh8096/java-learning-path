package CollectionFrameWorks.Maps.GarbageCollection.WeakHashMaps;

import java.util.WeakHashMap;

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class WeakHashMapDemo {
    public static void simulateApplicationRunning(){
        try {
            System.out.println("Stimulate application running...");
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void loadCache(WeakHashMap<String,Image> mpp){
        // Creates two String keys (new String("img1") and new String("img2")) , Why new String()?
        // Because string literals like "img1" live in the String pool (strong references)...
        // By using new String("img1"), you ensure only the weak reference in the WeakHashMap holds them...
        // Without new, GC would not collect them, since string pool keeps them alive...

        String key1 = new String("img1");
        String key2 = new String("img2");
        mpp.put(key1,new Image("Image 1"));
        mpp.put(key2,new Image("Image 2"));

    }

    public static void main(String[] args) {
        // Unlike 'HashMap', 'WeakHashMap' holds weak references to keys...
        WeakHashMap<String,Image> mpp = new WeakHashMap<>();
        loadCache(mpp);
        System.out.println(mpp);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + mpp);
    }

}
