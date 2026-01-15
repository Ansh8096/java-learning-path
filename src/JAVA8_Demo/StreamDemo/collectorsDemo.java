package JAVA8_Demo.StreamDemo;

import java.util.*;
import java.util.stream.Collectors;

public class collectorsDemo {
    static void main() {
        // Collectors is a utility class...
        // provides a set of methods to create common collectors...

    // Different methods:--->
        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> list1 = Arrays.asList(1, 1, 2, 2, 3, 3);
        Set<Integer> collectedSet = list1.stream().collect(Collectors.toSet());
        System.out.println(collectedSet);

        // 3. Collecting to a Specific Collection
        ArrayDeque<Integer> collectedDequeue = Arrays.asList(10, 20, 30, 40)
                .stream()
                .collect(Collectors.toCollection(ArrayDeque::new));
        collectedDequeue.addFirst(55); // now we can use methods of ArrayDequeue...
        System.out.println(collectedDequeue);

        // 4. Joining Strings: Concatenates stream elements into a single String...
        String collectString = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(collectString);

        // 5. Summarizing Data: It is used to generate statistical summary (such as: count, sum, min, average, max)...
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        // 6. Calculating Averages
        Double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average by direct mehtod: " + avg);

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Counting by direct mehtod:" + count);

        // 8. Grouping Elements:- it groups elements based on the key,returned by the function...
        List<String> wordsList = Arrays.asList("hello", "world", "java", "streams", "collecting");
            // '.collect(Collectors.groupingBy(...))' means group elements based on the key returned by the function....
        // System.out.println(wordsList.stream().collect(Collectors.groupingBy((x)->x.length()))); // by using LAMBDA VARIABLE , and also here 'length' is the grouping key....
        System.out.println(wordsList.stream().collect(Collectors.groupingBy(String::length))); // by using Method reference , and also here 'length' is the grouping key....
        System.out.println(wordsList.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()))); // here 'length' is the grouping key , and we count the same collector....
        TreeMap<Integer, Long> collectedTreeMap = wordsList.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting())); // here 'length' is the grouping key , and we count the same collector , and also we collected this in TreeMap....
        System.out.println("This is TreeMap: " + collectedTreeMap);

        // 9. Partitioning Elements : Partitions elements into two groups (true and false) based on a predicate...
        Map<Boolean, List<String>> collectedPartition1 = wordsList.stream().collect(Collectors.partitioningBy((x) -> x.length() > 5));
        System.out.println(collectedPartition1);

        Map<Boolean, Long> collectedPartition2 = wordsList.stream().collect(Collectors.partitioningBy((x -> x.length() > 5), Collectors.counting()));
        System.out.println(collectedPartition2);

        // 10. Mapping and Collecting : It applies a mapping function before collecting...
        // '.mapping()' :  method can take 'map()' , so we can quickly use 'map' whenever we want quickly whit th help of '.mapping()'...
        List<String> collectedList = names.stream().collect(Collectors.mapping((String::toUpperCase),
                Collectors.toList()));

        System.out.println(collectedList);

        // 11. 'toMap()' : explained in example-5 ...


    // Some Examples:--------------->

        // Example-1: Collecting Names by Length...
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));

        // Example 2: Counting Word Occurrences
        String sentence = "hello world hello java world";
        Map<String, Long> collectedSentence = Arrays.stream(sentence.split(" ")) // sentence.split(" ") : Splits the string by spaces → creates an array...
                .collect(Collectors
                        .groupingBy(x -> x,  // groups all words by their value (i.e., same words together)...
                                Collectors.counting())); // counts how many times each word appears...
        System.out.println(collectedSentence);

        // Example 3: Partitioning Even and Odd Numbers
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collectedPartition = numList.stream().collect(Collectors.partitioningBy(x -> (x & 1) == 0));
        System.out.println(collectedPartition);

        // Example 4: Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum)); // 1st method...
        System.out.println(items.values().stream().collect(Collectors.summingInt(x->x))); // 2nd method...

        // Example 5: Creating a Map from Stream Elements
        List<String> fruitsList = Arrays.asList("Apple", "Banana", "Cherry");
        // Map<String, Integer> collectedMap = fruitsList.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length())); // toMap(): directly takes keys and values for map ...
        Map<String, Integer> collectedMap = fruitsList.stream().collect(Collectors.toMap(String::toUpperCase, String::length)); // toMap(): directly takes keys and values for map ...
        System.out.println(collectedMap);

        // Example-6 : we need to map the words to their frequency...
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

            // 1st method:-
        System.out.println(words2.stream().collect(Collectors.groupingBy(x-> x , Collectors.counting())));

            // 2nd method:// keyMapper (k->k) → use the word itself as the key...
                          // valueMapper (v->1) → assign 1 as the initial value (count)...
                          // mergeFunction ((x,y)->x+y) → what to do if the key already exists...
        System.out.println(words2.stream().collect(Collectors.toMap(k->k , v->1 , (x,y)->x+y ))); // if the words are repeating then, we need to use the 2nd type of 'toMap()' method...
    }
}