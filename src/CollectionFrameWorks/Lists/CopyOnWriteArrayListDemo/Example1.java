package CollectionFrameWorks.Lists.CopyOnWriteArrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example1 {
    public static void main(String[] args) {
        // "Copy on Write" means that whenever we do a write operation (like adding or removing an element)...
        // Instead of directly modifying the existing list,a new copy of the list is created, and the modification is applied to that copy...
        // This ensures that other threads reading the list while it’s being modified are unaffected...

        // In this type of ArrayList, Read Operations: are Fast and direct, since they happen on a stable list without interference from modifications...
        // Write Operations: A new copy of the list is created for every modification...
        // After modification:--> The reference to the list is then updated so that subsequent reads use this new list...
        // we should use this whenever there are more read operations in comparison of write operations (because more write operations can cause more usage of memory)...

        List<String> list = new CopyOnWriteArrayList<>();
        // List<String> list = new ArrayList<>(); // We will get an 'ConcurrentModificationException' because we can't do modification while reading in ArrayList, because it is not stable...
        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");
        System.out.println("Initial shopping list is: " + list);

        for (String item: list){
            System.out.println(item);
            if(item.equals("Eggs")){
                list.add("Butter");
                System.out.println("The Butter has been added into your list...");
            }
        }

        System.out.println("The final updated list" + list);
    }
}
