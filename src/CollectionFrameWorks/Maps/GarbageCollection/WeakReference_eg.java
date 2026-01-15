package CollectionFrameWorks.Maps.GarbageCollection;

import java.lang.ref.WeakReference;

class Mobile {
    private String Brand;
    private String Model;

    public Mobile(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
public class WeakReference_eg {
    public static void main(String[] args) {
        WeakReference<Mobile> Mobile = new WeakReference<>(new Mobile("Nokia","3310"));
        System.out.println(Mobile.get()); // Mobile.get() returns the object if it’s still alive...
        System.gc(); // Requests garbage collection (System.gc() is just a hint, not guaranteed)...
        try {
            Thread.sleep(5000); // giving time to 'GC' to run...
        } catch (InterruptedException ignored) {
        }

        System.out.println(Mobile.get());
    }
}
