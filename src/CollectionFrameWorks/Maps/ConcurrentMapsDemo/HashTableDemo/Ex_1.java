package CollectionFrameWorks.Maps.ConcurrentMapsDemo.HashTableDemo;

import java.util.Hashtable;

public class Ex_1 {
    static void main() {
        // Hashtable is synchronized...
        // there can be no null key or value...
        // HashTable is a Legacy Class, we uses 'ConcurrentHashMap' instead of this now...
        // It is slower than HashMap...
        // In this there is ,only linked list in case of collision...
        // In hashTable all the methods are synchronized...
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"One");
        hashtable.put(2,"Two");
        hashtable.put(3,"Three");
        // hashtable.put(null,"Null"); // throws exception...
        System.out.println(hashtable);


    // HashTable Synchronization Example:-
        Hashtable<Integer, String> map = new Hashtable<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());
    }
}
