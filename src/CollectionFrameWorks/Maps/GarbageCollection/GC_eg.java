package CollectionFrameWorks.Maps.GarbageCollection;

class Phone{
    private String Brand;
    private String Model;

    public Phone(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        return "Phone{ " +
                "Brand ='" + Brand + '\'' +
                ", Model ='" + Model + '\'' +
                '}';
    }
}

public class GC_eg {
    public static void main(String[] args) {
        Mobile phone = new Mobile("Apple","Iphone 17 pro max");
        System.out.println(phone);
        phone = null; // after setting phone = null...
        // The JVM will destroy its previous memory ,because now there is no reference corresponded present to it (means we can't use that anyMore)...
        // System.gc(); // we don't need to write this because garbageCollector is already gets called by JVM...
        System.out.println(phone);
    }
}
