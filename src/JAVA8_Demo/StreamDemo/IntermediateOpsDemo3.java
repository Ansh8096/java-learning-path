package JAVA8_Demo.StreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpsDemo3 {
    static void main() {
// Intermediate operations :-- transform a stream into another stream...
    // They are lazy, meaning they don't execute until a terminal operation is invoked...

    // Intermediate Operations:-->
        // 1. filter : it takes predicate
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")); // At this point nothing is filtered, because of no terminal operation...
        long count = filteredStream.count();
        System.out.println(count);

        // 2. map : it takes functions
        List<String> list2 = Arrays.asList("ram", "shyam", "ghanshyam");
        List<String> collectedList = list2.stream().map((x) -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(collectedList);

        // 3. sorted : it sorts our data in natural ordering,(or by the custom comparator)...
        List<String> list3 = Arrays.asList("d", "c", "b", "a");
        List<String> sortedList1 = list3.stream().sorted().collect(Collectors.toList());// sorts by natural Ordering...
        System.out.println(sortedList1);

        List<String> sortedList2 = list3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // sorts by our custom Comparator...
        System.out.println(sortedList2);

        // 4. distinct:
        List<String> list4 = Arrays.asList("a", "a", "b", "c");
        long count1 = list4.stream().filter(x -> x.startsWith("a")).distinct().count(); // it will only count the distinct strings that starts with 'a' ...
        System.out.println(count1);

        // 5. limit:
         // System.out.println(Stream.iterate(1,(x)->x+1).collect(Collectors.toList())); // it will print an infinite loop...
         System.out.println(Stream.iterate(1,(x)->x+1).limit(100).collect(Collectors.toList())); // it will print list till 100 size...

        // 6. skip:
        System.out.println(Stream.iterate(1,(x)->x+1).skip(10).limit(100).collect(Collectors.toList())); // it will first skip till 10,and then it will print until the size is reached 100...

        // 7. peek: It helps us to perform an action on each element as it is consumed....
        System.out.println("Done by using peek operation : ");
        Stream.iterate(1,(x) -> x+1).skip(10).limit(10).peek(System.out::println).count(); // 'peek' will print from 11 to 20...

        // 8. flatMap:
        // It handles the streams of collections, lists, or arrays where each element is itself a collection...
        // It flattens nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements...
        // It can also transform and flatten elements at the same time....
            // eg-1:
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );

        System.out.println(listOfLists.get(1).get(1)); // This is how to access elements in 'listOfLists'...
        System.out.println(listOfLists.stream()
                .flatMap((x) -> x.stream())
                .map(String::toUpperCase)
                .toList());

            // eg-2:
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );

        System.out.println(sentences.stream().
                flatMap((senetence)-> Arrays.stream(senetence.split(" ")))   // 'Arrays.stream()' is used to get a stream instead of the array...
                .map(String::toUpperCase).toList());

    }
}
