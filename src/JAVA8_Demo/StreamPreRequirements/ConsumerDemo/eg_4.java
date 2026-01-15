package JAVA8_Demo.StreamPreRequirements.ConsumerDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class eg_4 {
    static void main() {
    // Consumer :-> It is the type of functional interface, in which its abstract method doesn't return anyThing (only consumes value)...
        Consumer<Integer> print = x-> System.out.println("Value of x: " + x);
        print.accept(10);

        // This consumer will take list and print it...
        Consumer<List<Integer>> printList = x->{
            for(int itt : x){
                System.out.print(itt+ " ");
            }
        };
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        printList.accept(list1);

    // BiConsumer:-->
        BiConsumer<Integer,String> printing = (x,y) ->{
            System.out.println("\n"+x);
            System.out.println(y);
        };

        printing.accept(20,"Hello g");
    }
}
