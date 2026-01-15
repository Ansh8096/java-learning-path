package JavaGenerics.WildCardGeneric;

import java.util.ArrayList;

public class Main_1 {
    // when use 'wildCard pattern':---->
    // We should use 'wildCard pattern' when we are only reading the data...
    // But,when you want to perform any task on data ,then you should avoid it...
    public void display(ArrayList<?> list){
         for (Object ob : list){
             System.out.print(ob + " ");
         }
        System.out.println();
    }

    // I can't use 'wildCard pattern' here, beacuse we need to know the return type in method before...
    public <T> T firstElement(ArrayList<T> list){
        return list.get(0);
    }

    // we also can't use this method with 'wildCard pattern', because before adding anyThing into our list, we should know its dataType before...
    public <T> void copy (ArrayList<T> source , ArrayList<T> Destination){
        for (T items : source){
            Destination.add(items);
        }
    }

}
