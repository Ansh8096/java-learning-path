package JAVA8_Demo.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    static void main() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> nameStream = names.stream().filter((x) -> {
            System.out.println("Filtering: " + x);
            return x.length() > 3;
        });

        //  👉 The filter is NOT executed yet....
        // Because stream operations are lazy —
                    // they only execute when a terminal operation (like forEach(), toList(), collect(), etc.) is called.
                    // So even though you wrote filter() ,no elements are filtered yet...

        System.out.println("Before terminal operation..."); // At this point, nothing from the stream has run....
        // When the terminal operation (toList()) is called:
        // Now the stream starts processing...
        // The filter executes for each element in the list...
        // You’ll see “Filtering: ...” printed for each name...
        // Only now does Java actually process the stream....
        List<String> nameStreamList = nameStream.toList(); // This line triggers lazy evaluation...
        System.out.println("After terminal operation");
        System.out.println(nameStreamList);
    }
}
