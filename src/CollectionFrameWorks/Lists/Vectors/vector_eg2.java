package CollectionFrameWorks.Lists.Vectors;

import java.util.ArrayList;
import java.util.Vector;

public class vector_eg2 {
    public static void main(String[] args) {
        // ArrayList<Integer> List = new ArrayList<>(); // it will allow the multiple Threads to add data in the ArrayList together,without any synchronization (unlike in vectors)...
        Vector<Integer> List = new Vector<>();
        Thread t1 = new Thread(()->{
            for (int i=0;i<1000;i++){
                List.add(i);
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i=0;i<1000;i++){
                List.add(i);
            }
        });

        t1.start(); t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Size of list: " + List.size()); // it will only get the surety of correct result when we use vector...
    }
}
