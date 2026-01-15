package CollectionFrameWorks.Lists.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_eg {
    public static void main(String[] args){

        // Here: the initial capacity of list is : '10' , and list size is '0'...
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(2); // 0
        // list.add(6); // 1
        // list.add(80);// 2

        // to insert element at specific index in our list...
        // list.add(1,45); // {2,45,6,80}
        // list.set(1,45); // {2,45,80}

        // To check for the presence of element in the arrayList...
        // System.out.println(list.contains(6)); // returns True...
        // System.out.println(list.contains(66)); // returns False...

        // For printing...
        // System.out.println(list.get(1));

        // for (int i = 0; i <list.size();i++){
        //    System.out.println(list.get(i));
        // }

        // System.out.println(list); // We can directly print our arrayList because of it 'toString()' method ...

    /*
        // We can also give our own initialCapacity for 'ArrayList'...
        ArrayList<Integer> list = new ArrayList<>(11);

    // This is the example to show the initial capacity increase and decrease in real-time:---------------------------->
         list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.add(1);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.trimToSize(); // it is used to manually decrease the size of arrayList for the required elements...

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);     */


    // Methods in ArrayLists:----->
        /* ArrayList<String> list1 = new ArrayList<>();
        System.out.println(list1.getClass().getName());

        // ArrayList<String> list2 = Arrays.asList("Monday", "Tuesday"); // we can't use 'ArrayList' here , because 'Arrays.asList()' returns a 'list'...
        List<String> list2 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list2.getClass().getName());
        // list2.add("Wednesday"); // we can't add or remove elements in the list that is returned by the 'Arrays.asList()' method...
        list2.set(1,"Sunday"); // but, we can use the 'set()' method...
        System.out.println(list2);

        String [] arr = {"Monday","tuesday","Wednesday","Thursday"};
        List<String> stringList = Arrays.asList(arr);
        System.out.println(stringList.getClass().getName());
        System.out.println(stringList);


    // It is same as 'Arrays.asList()' method , but in this you can't even use the 'set()' method...
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        // integerList.set(1,3); // this method will give us error here...

    // Like this we can add elements , in 'list2' and 'integerList' :------>
        List<Integer> finalList = new ArrayList<>(integerList);
        finalList.add(77);
        System.out.println(finalList);
        List<Integer> tempList = List.of(8,9,10);
        finalList.addAll(tempList);
        System.out.println(finalList); */

    // Methods to remove elements:--->
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);

        l1.remove(0); // To remove elements by index...
        l1.remove(Integer.valueOf(2)); // To remove elements by value....
        // System.out.println(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("apple");
        l2.add("banana");
        l2.add("grapes");
        l2.remove(0); // To remove elements by index...
        l2.remove("banana"); // To remove elements by value...
        // System.out.println(l2);

    // Sorting methods for list :-------->
        // Collections.sort(l1);
        l1.sort(null); // It will sort the list in natural order that is ascending...
        System.out.println(l1);

    // Method to convert List into the array:--->
        String[] l2Array = l2.toArray(new String[0]);
        Integer[] l1Array = l1.toArray(new Integer[0]);

    }

 }
