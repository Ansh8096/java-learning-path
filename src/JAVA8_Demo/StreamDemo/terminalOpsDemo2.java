package JAVA8_Demo.StreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class terminalOpsDemo2 {
    static void main() {

// Terminal Operations:-->

    // 1. collect:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1.stream().skip(1).collect(Collectors.toList())); // it will skip '1',and print the rest of the elements as it is...
        System.out.println(list1.stream().skip(1).toList()); // we can directly use '.toList()' like this...

    // 2. forEach :
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        list2.stream().forEach((x) -> System.out.print(x + " ")); // it can be used to print the list...

    // 3. reduce : It combines the elements to produce a single result...
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4);
        // Optional<Integer> optionalInteger = list3.stream().reduce((x, y) -> x + y); // we are using lambda expression here in 'reduce()'...
        Optional<Integer> optionalInteger = list3.stream().reduce(Integer::sum); // we are now using method reference here in 'reduce()'...
        System.out.println("\n" + optionalInteger.get());

    // 4. count : to count our results...

    // 5. anyMatch,allMatch,noneMatch :
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4,5,6);
        boolean b1 = list4.stream().anyMatch((x) -> (x & 1) == 0); // return true, if any one element in the list matches predicate else false ...
        System.out.println(b1);
        boolean b2 = list4.stream().allMatch((x) -> x>0); // return true, if any all element in the list matches predicate else false ...
        System.out.println(b2);
        boolean b3 = list4.stream().noneMatch((x) -> x<0); // return true, if none element in the list matches predicate else false ...
        System.out.println(b3);

    // 6. findFirst , findAny :
        Optional<Integer> firstElement = list4.stream().findFirst(); // it will give the first element in list , and it will stop processing the moment it gets its first element in the list...
        System.out.println(firstElement.get());
        Optional<Integer> AnyElement = list4.stream().findAny(); // it can give any element from the list,and it will stop processing the moment it gets its any element from the list...
        System.out.println(AnyElement.get());

    // 7. toArray():
        Object[] array = Stream.of(1, 2, 3, 4).toArray();


    // 8. min/max :
        System.out.println("max: " + Stream.of(1,33,2,69).max(Comparator.naturalOrder()).get());
        System.out.println("min: " +  Stream.of(1,33,2,69).min(Comparator.naturalOrder()).get());

        System.out.println("max with our custom Comparator: " + Stream.of(1,33,2,69).max((o1,o2) -> o2-o1).get()); // we will get reverse of 'max' now...

    // 9. forEachOrdered: It maintains the natural order of the list (unlike forEach)...
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Using forEach with parallel stream:");
        numbersList.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream:");
        numbersList.parallelStream().forEachOrdered(System.out::println);


// SOME EXAMPLES:---->
        // Example-1 : filtering and collecting name whose length is greater than 3...
        List<String> names = Arrays.asList("Ansh", "Riya", "Rohan", "Shreya","roy","Raj");
        List<String> res1 = names.stream().filter((x) -> x.length() > 3).toList();
        System.out.println(res1);

        // Example-2 : square every number in the list and arrange them in the sorted manner...
        List<Integer> integerList = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> res2 = integerList.stream().map((x) -> x * x).sorted().toList();
        System.out.println(res2);

        // Example-3 : Summing the values in the list...
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4);
        Optional<Integer> res3 = numbers.stream().reduce(Integer::sum);
        System.out.println(res3.get());

        // Example-4 : Count occurrence of a char
        String sentence = "Hello World";
        IntStream chars = sentence.chars(); // '.chars()' return a Integer stream (that has char ASCII value)...
        System.out.println(chars.filter((x)-> x == 'l').count());  // ' x == l' , JAVA will automatically compare the ASCII value corresponding to 'l'...

        // Example-5:  Streams cannot be reused after a terminal operation has been called...
        List<String> myNames = Arrays.asList("Ansh", "Raj", "Striver");
        Stream<String> myNamesStream = myNames.stream();
        myNamesStream.forEach(System.out::println);
        //  System.out.println(myNamesStream.map(String::toUpperCase).toList()); // it will give an exception, because Streams cannot be reused after a terminal operation has been called...

        // stateful & stateless operations :
                // stateful operations :- these are the type of operation such as sorted() in stream (for eg: In 'sorted()' each elements is depends on rest of the elements of the list)...
                // stateless operations :- these are the type of operation such as filter() in stream (for eg: In 'filter()' we filter elements of the list on the basis of predicate ,in this no element is dependent to rest of the elements in the list)...

    }
}
