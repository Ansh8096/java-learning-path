package JavaGenerics.WildCardGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1,2.2,22.5)));

        List<? extends Number> list = Arrays.asList(1, 2, 3, 4);

        // list is a list of some unknown subtype of Number,Could be List<Integer>, or List<Double>, or List<Float>, etc.
        // The compiler doesn’t know exactly which one, So, it will give us an error...
        // Since the compiler cannot guarantee safety, it forbids adding anything except null...
        // list.add(12);
        // list.add(null);


        List<? super Integer> list2 = Arrays.asList(1,2,3,4);

        // 'List<? super Integer>' → list of some unknown supertype of Integer.So it could be:
        // 'List<Integer>' , 'List<Number>' , 'List<Object>'
        list2.add(12); // Here: we know what will be added in out list, so we don't get compile time error while adding '12'...

    }

    // 'List<? extends Number>' means: it is 'upperBound' (means we can't add the type of data that is from super class or Number)...
    // The list can hold elements of some unknown type that is a subclass of Number (Integer, Double, Float, etc.)...
    // You can read safely as Number, but you cannot add new elements (except null), because the exact type is unknown.
    public static double sum (List<? extends Number> list) {
        double sum = 0;
        for (Number o:list){
            sum += o.doubleValue();
        }
        return sum;
    }

    // 'ArrayList<? super Integer>' means: 'lowerBound' (The list can hold Integer or its supertypes (Number, Object) , not its sub classes)...
    // You can safely add Integers to it, because all supertypes can hold an Integer...
    // But when reading elements, you only know they are Object (since you don’t know the exact supertype).
    public static void printNumbers(ArrayList<? super Integer> list1){
        for (Object o : list1){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
