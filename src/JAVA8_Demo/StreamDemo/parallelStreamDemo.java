package JAVA8_Demo.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class parallelStreamDemo {

    static int factrorial(int x){
        if(x == 1) return x;
        return x * factrorial(x-1);
    }

    static void main(){
        // It is a type of stream that enables parallel processing of elements...
        // It allows multiple threads to process parts of the stream simultaneously...
        // This can significantly improve performance for large data sets...
        // In this,the workload is distributed across multiple threads...

// Example: to show how parallelStream is efficient (by seeing which type of stream completes the task more faster)...
        // Using sequential stream:--  (we are first generating the list of '1-2000' elements in the list,then we will find the factorial of every element in that list)...
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = Stream.iterate(1, (x) -> x + 1).limit(20000).toList();
        List<Integer> factorialList = numbers.stream().map((x) -> factrorial(x)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("time taken using sequential stream : " + (endTime - startTime) + "ms");
        // System.out.println(factorialList);


        // Using Parallel stream:->  (we are first generating the list of '1-2000' elements in the list,then we will find the factorial of every element in that list)...
                // Parallel streams are most effective for CPU-intensive or large datasets where tasks are 'independent'...
                // They may add overhead for simple tasks or small datasets...
        long startTime1 = System.currentTimeMillis();
        List<Integer> numbers1 = Stream.iterate(1, (x) -> x + 1).limit(20000).toList();
        // List<Integer> factorialList1 = numbers1.parallelStream().map((x) -> factrorial(x)).sequential().toList(); // with the help of '.sequential()' we can convert parallel stream into sequential stream...
        List<Integer> factorialList1 = numbers1.parallelStream().map((x) -> factrorial(x)).toList();
        long endTime1 = System.currentTimeMillis();
        System.out.println("time taken using parallel stream : " + (endTime1 - startTime1) + "ms");
        // System.out.println(factorialList1);


// Parallel streams are ineffective , when tasks are dependent to result of others tasks...
        // for eg: cumulative Sum :
            // [1,2,3,4,5] -> [1,3,6,10,15] (expected result)...

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        // int sum = 0; // it is not thread-safe ,to use in lambda expression...
        AtomicInteger sum = new AtomicInteger(0);


        // List<Integer> cumulativeSumList = integerList.stream().map((x) -> sum.addAndGet(x)).toList(); // using lambda expression here...
        // List<Integer> cumulativeSumList = integerList.parallelStream().map(sum::addAndGet).toList(); // using method reference here...

        // '.sequential()' is not needed here , because our stream is already sequential...
        List<Integer> cumulativeSumList2 = integerList.stream().map(sum::addAndGet).sequential().toList(); // using method reference in sequential stream now ...

        System.out.println("Expected result : [1, 3, 6, 10, 15]");
        //System.out.println("Actual result using parallel Stream : " + cumulativeSumList); // wrong result using parallelStream , because of tasks are dependent to other tasks...
        System.out.println("Actual result using sequential Stream : " + cumulativeSumList2);

    }

}
