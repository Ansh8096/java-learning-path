package JAVA8_Demo.StreamPreRequirements.SupplierDemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class eg_5 {
    static void main() {
        // 'Supplier' :---> This functional interface has abstract method that only supplies something,and it don't take any input...
        // So this is used whenever we want to return something...
        Supplier<String> givesHelloWorld = ()-> "Hello World";
        System.out.println(givesHelloWorld.get());


    // Combined ex of: Consumer,Function,Predicate,Supplier...
        Function<Integer,Integer> function = x -> x*x;  // squaring x...
        Consumer<Integer> consumer = x  -> System.out.println(x); // Print x...
        Predicate<Integer> predicate = x  -> (x&1)==0;
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

    }
}
