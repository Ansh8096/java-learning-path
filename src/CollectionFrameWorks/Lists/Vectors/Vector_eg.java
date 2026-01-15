package CollectionFrameWorks.Lists.Vectors;

import java.util.LinkedList;
import java.util.Vector;

public class Vector_eg {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        System.out.println(vec.capacity()); // It will show us the capacity of the vector...
        Vector<Integer> vec2 = new Vector<>(3,2); // means we set the initial capacity of vector to '3' and It will increment the capacity by '2' everytime, whenever it needs to...
        vec2.add(1);
        vec2.add(1);
        vec2.add(1);
        System.out.println(vec2.capacity());
        vec2.add(1);
        System.out.println(vec2.capacity());

    // We can create vector from Lists,ArrayLists,LinkedLists etc :----->
        LinkedList<Integer> L1 = new LinkedList<>();
        L1.add(2);
        L1.add(5);
        L1.add(3);
        L1.add(8);

        Vector<Integer> vector = new Vector<>(L1);
        System.out.println(vector);

    }
}
