package JAVA8_Demo.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamDemo1 {
    static void main() {
    // 'Stream' :---> It is a feature introduced in Java 8...
        // It is used to process collections(List,Map etc) of data in a functional and declarative manner...
        // It Simplifies Data Processing...
        // It embraces Functional Programming...
        // It improves Readability and Maintainability...
        // It enables Easy Parallelism...

    // What is stream ?
        // a sequence of elements supporting functional and declarative programing

    // How to Use Streams ?
        // We will have a Source,we need to apply intermediate & terminal operations on this source...
        // eg:->
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        // here: 'filter' is intermediate operation...
        //       'count' is  terminal operation...
        long countOfEvenNoInList = integers.stream().filter(x -> (x & 1) == 0).count(); // With the help of streams,we are counting the no of even elements in the list...
        System.out.println(countOfEvenNoInList);

    // CREATING STREAMS:---->
        // 1. from collections:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6);
        Stream<Integer> numbersStream = numbers.stream();

        // 2. from Arrays:
        String [] arr = {"a","b","c"};
        Stream<String> arrStream = Arrays.stream(arr);

        // 3. Using 'Stream.of()' :
        Stream<String> stringStream = Stream.of("a", "s", "h");

        // 4. Infinite streams:
        Stream<Integer> infiniteStream = Stream.generate(() -> 1); // it is an infinite stream...
        Stream<Integer> infiniteStream2 = Stream.generate(() -> 1).limit(100); // we can also give the size limit,if we don't want an infinite Stream...
        Stream<Integer> iteratedStream = Stream.iterate(1, (x) -> x + 1); // it is an infinite stream...
        List<Integer> collectedList = Stream.iterate(1, (x) -> x + 1).limit(100).collect(Collectors.toList()); // we can also give the size limit,if we don't want an infinite Stream...
        System.out.println(collectedList);

    }
}
