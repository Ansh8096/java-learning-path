package CollectionFrameWorks.Lists.ArrayLists.Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class IntegerComparator implements Comparator<Integer>{
    // Custom comparator to sort numbers in Descending number...
    // If o1 < o2, result is positive → o1 goes after o2...
    // If o1 > o2, result is negative → o1 comes before o2...
    // If equal → returns 0...
    @Override
    public int compare(Integer o1, Integer o2) { // (It automatically compares the numbers by two-two)...
        return o2 - o1;
    }
}

// e.g = "red" "blue"
class stringComparator implements Comparator<String>{

    // If o1.length() < o2.length() → negative → o1 comes before o2...
    // If o1.length() > o2.length() → positive → o1 comes after o2...
    // If equal → 0 → keeps their relative order (stable sort)...
    @Override
    public int compare(String o1, String o2) {
        return (o1.length() - o2.length());
    }
}

public class Comparator_eg1 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);

        // l1.sort(null); // It will sort the list in 'natural order' that is ascending...
        l1.sort(new IntegerComparator());
        System.out.println(l1);

        List<String> stringList = Arrays.asList("apple", "banana", "date");
        // stringList.sort(null); // It will sort the list in 'natural order' that is ascending...
        stringList.sort(new stringComparator()); // it will sort the list in the increasing order of their length...
        System.out.println(stringList);

        // We can also use the lambda expression here:
        // Because 'sort' is a method that uses 'comparator' interface 'compare()' method...
        List<String> stringList2 = Arrays.asList("grape", "mango", "date", "watermelon");
        stringList2.sort((a,b) -> (a.length() - b.length()));
        System.out.println(stringList2);
    }
}
