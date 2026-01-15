package JAVA8_Demo.StreamDemo;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class primitiveStreamDemo {
    static void main() {
        Integer[] arr2 = {1,2,3,4,5};
        Stream<Integer> integerStream = Arrays.stream(arr2);

        int[] arr1 = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr1);

        IntStream range = IntStream.range(1, 5);
        System.out.println(range.boxed().toList()); // 1 2 3 4

        System.out.println(IntStream.rangeClosed(1,5).boxed().toList()); // 1 2 3 4 5
        IntStream.of(10,20,30);


        DoubleStream doubles = new Random().doubles(5); // it will give us 5 random doubles values...
        // System.out.println(doubles.boxed().toList());
        // System.out.println(doubles.sum()); // it gives sum of that 5 double values...
        // System.out.println(doubles.min());
        // System.out.println(doubles.max());
        // System.out.println(doubles.average());
        // System.out.println(doubles.summaryStatistics());
        // doubles.mapToInt(x -> (int) x + 1);

        IntStream intStream1 = new Random().ints(5); // it will give us 5 random Integer values...
        System.out.println(intStream1.boxed().toList());
    }
}
