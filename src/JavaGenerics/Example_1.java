package JavaGenerics;

import java.util.ArrayList;

public class Example_1 {
    public static void main(String[] args) {

        // This is not better to declare arrayList like this...
        // Because it can store any type of data , making it difficult to access elements from list later on...
        ArrayList list1 = new ArrayList();
        list1.add("hello");
        list1.add(123);
        list1.add(12.45);

        Object obj0 = list1.get(0);
        String str = (String)list1.get(0); //If we want the particular datatype,we need to typecast it like this ...
        Object obj1 = list1.get(1);


        // we should declare the dateType of list like this in the beginning,
        // so that list store only one type of data, also making it easier to access the elements of list...
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");

        String s = list2.get(0);

    }
}
