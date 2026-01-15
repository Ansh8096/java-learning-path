package JAVA8_Demo.StreamPreRequirements.FunctionsDemo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class eg_3 {
    static void main() {
        // Function --> this interface has abstract method that will work for you...
        // Function<Integer,Integer> doubleIt = x-> 2*x;
        UnaryOperator<Integer> doubleIt = x-> 2*x; // we can use 'UnaryOperator' interface (because it extends 'Function' interface),when are input and return type is same...
        System.out.println(doubleIt.apply(4));
        Function<Integer,Integer> tripleIt = x-> 3*x;
        System.out.println(tripleIt.apply(4));

        System.out.println(doubleIt.andThen(tripleIt).apply(20)); // it will first apply the 'doubleIt' function and then 'tripleIt' function to the '20'...
        System.out.println(doubleIt.compose(tripleIt).apply(2)); // it will first apply the 'tripleIt' function and then 'doubleIt' function to the '2'...

    // Function Interface has static method name 'identity()' which is used to return the value you passed in it...
        // This method will be useful in 'streams'...
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(101);
        System.out.println(res);

    // BiFunction:--->
        BiFunction<String,String,Integer> twoStringLengths = (x,y) -> (x+y).length();
        System.out.println(twoStringLengths.apply("a","bc"));

        BinaryOperator<Integer> sumOfTwoIntegers = (x, y) -> (x+y); // we can use 'BinaryOperator' interface (because it extends 'BiFunction' interface),when are both the inputs type and return type is same...
        System.out.println(sumOfTwoIntegers.apply(10,10));
    }
}
