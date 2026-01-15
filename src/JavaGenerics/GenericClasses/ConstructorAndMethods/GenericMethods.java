package JavaGenerics.GenericClasses.ConstructorAndMethods;
// Syntax : public <T> void methodName(T parameter) {method body}

public class GenericMethods {
    public <T> void printArr(T[] Array){
        for (T element : Array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // method overloading :

    // this method will call when the element pass in it is 'Integer'...
    public static void display(Integer element){
        System.out.println("Integer Element : " + element);
    }

    // this method will call when the element pass in it is not 'Integer'...
    public static <T> void display(T Element){
        System.out.println("Generic Element : " + Element);
    }


    public static void main(String[] args) {
        GenericMethods test = new GenericMethods();
        Integer[] arr1 = {10,20,30,40,50};
        test.printArr(arr1);
        String[] arr2 = {"Hello" , "World"};
        test.printArr(arr2);

        // we can directly call static method here , without using the class instance...
        display(25);
        display(12.2);
    }
}
