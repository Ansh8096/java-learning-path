package JAVA8_Demo.StreamPreRequirements.PredicateDemo;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class eg_2 {
    static void main() {

    // Predicate --> It is a functional interface (which has Boolean valued abstract function)...
        // With the help of 'predicates' we are able to hold the condition in the variables....

        Predicate<Integer> isEven = x -> (x&1) == 0;
        System.out.println(isEven.test(5));

        Predicate<String> isWordStartsWithA = x-> x.toLowerCase().startsWith("a"); // it will ignore cases and , will check if my string starts with 'a' or not...
        System.out.println(isWordStartsWithA.test("Ansh"));

        Predicate<String> isWordEndsWithA = x-> x.toLowerCase().endsWith("a"); // it will ignore cases and , will check if my string ends with 'a' or not...
        System.out.println(isWordEndsWithA.test("ansh"));

        // Like this, we can combine the two predicates variables (with our own custom conditions)...
        Predicate<String> isWordStartsAndEndsWithA = isWordStartsWithA.and(isWordEndsWithA);
        System.out.println(isWordStartsAndEndsWithA.test("Ansh"));


    // Bi predicate
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> ((x+y)&1) == 0;
        System.out.println(isSumEven.test(5,5));
    }
}
