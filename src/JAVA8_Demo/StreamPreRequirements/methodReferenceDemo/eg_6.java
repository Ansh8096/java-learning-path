package JAVA8_Demo.StreamPreRequirements.methodReferenceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class eg_6 {
    static void main() {

// Method Reference:--> It uses method invoking , in the place of lambda expression...
        List<String> students = Arrays.asList("Ram" , "Shyam", "Ghanshyam");
        // forEach is a default method in Iterable interface (added in Java 8)...
        // It takes a Consumer<T> functional interface...
        // So, whatever you pass to forEach, it will be executed for each element of the list...

        // Here we are sending method reference...
        students.forEach((x) -> System.out.println(x)); // Using lambda (Lambda: Explicitly writes the function)...
        students.forEach(System.out::println); // Using method  reference (Method Reference: Shortcut, directly passes method)...

// constructor reference :--->
        // name.stream() : Converts the list ["A", "B", "C"] into a Stream , Stream allows us to apply functional-style operations (map, filter, collect, etc.).
        // map(mobilePhone::new) : map takes a Function<T, R> ...
        List<String> name = Arrays.asList("A","B","C");
        name.stream().map(mobilePhone::new).collect(Collectors.toList());
    }
}

class mobilePhone{
    private final String name;

    public mobilePhone(String name) {
        this.name = name;
    }
}
