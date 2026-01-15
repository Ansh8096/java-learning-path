package CollectionFrameWorks.Maps.SortedMapsDemo.Examples;

import java.util.*;

public class Eg1{
    static void main() {
    // Using the 'sorted map' with the natural ordering...
        // Since 'sorted map' is a Interface, so we need to use the 'TreeMap' class that implements 'NavigableMap' interface  which extends 'SortedMap' interface to use the 'SortedMap' methods...
        SortedMap<Integer,String> mpp = new TreeMap<>();
        Map<Integer,String> map = new TreeMap<>(); // we can also take the parent reference ('Map') of 'SortedMap' here, but then we can't use 'SortedMap' methods ,we will only be able to get the entries in sorted manner (of their keys)....
        mpp.put(1,"Rohan");
        mpp.put(3,"Raj");
        mpp.put(5,"Ansh");
        mpp.put(4,"Vipul");

        // System.out.println(mpp);
        // System.out.println(mpp.firstKey());
        // System.out.println(mpp.headMap(4)); // {1=Rohan, 3=Raj}
        // System.out.println(mpp.tailMap(4)); // {4=Vipul, 5=Ansh}

    // Using the 'sorted map' with our own custom comparator...
        SortedMap<Integer,String> mpp2 = new TreeMap<>((a,b) -> b-a);
        mpp2.put(1,"Rohan");
        mpp2.put(3,"Raj");
        mpp2.put(5,"Ansh");
        mpp2.put(4,"Vipul");

        // System.out.println(mpp2); // we will get our mpp2 print in the descending order of their keys...


    // Using the 'sorted map' with our own custom comparator of 'Std' class...
        // Creating the object of the 'StdComparator' class because we needed it,to use this in our 'SortedMap' for sorting...
        StdComparator stdComparator = new StdComparator();
        SortedMap<Std,Integer> mpp3 = new TreeMap<>(stdComparator);
        mpp3.put( new Std("Ansh" , 9.7), 1);
        mpp3.put( new Std("Vipul" , 9.8), 4);
        mpp3.put( new Std("Roy" , 9.5), 2);
        System.out.println(mpp3);


    // Navigable Map :-
        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"Ansh");
        navigableMap.put(3,"Vipul");
        navigableMap.put(2,"Mohit");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(2)); // Returns the greatest key strictly less than the given key, or null if there is no such key...
        System.out.println(navigableMap.higherKey(2)); // Returns the least key strictly greater than the given key, or null if there is no such key...
        System.out.println(navigableMap.descendingMap()); // Returns a reverse order view of the mappings contained in this map...
    }
}

// Creating the custom 'comparator' to define sorting rules for the 'Std' class:--->
class StdComparator implements Comparator<Std>{
    // (4,3) -> 4 3
    @Override
    public int compare(Std o1, Std o2) {
        return Double.compare(o2.getGpa(),o1.getGpa());
    }
}

class Std {
    private double gpa;
    private String name;

    public Std(String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Std{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }
}