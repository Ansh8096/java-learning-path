package JavaGenerics.BoundedTypeParameter;

interface printable{
    void print();
}

class MyNumber extends Number implements printable{
    private final int val;

    public MyNumber(int val){
        this.val = val;
    }

    @Override
    public void print() {
        System.out.println("The value is: " + val);
    }

    @Override
    public int intValue() {
        return val;
    }

    @Override
    public long longValue() {
        return val;
    }

    @Override
    public float floatValue() {
        return val;
    }

    @Override
    public double doubleValue() {
        return val;
    }
}

// Here: T must extend Number and implement printable ,So only types that satisfy both conditions (like MyNumber) are allowed...
// Note: In Java, if you mix a class and interfaces in bounds, the class must come first (extends Number & printable) and you can also extend multiple interfaces....
class box <T extends Number & printable>{
    private T item;
    public box(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class AnotherTest {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(54);

        // 'box' should have a valid 'DataType' that extends Number and implements printable (such as : myNumber)...
        // here: MyNumber satisfies both conditions, so it can be stored in box<MyNumber>...
        box<MyNumber> boxx = new box<>(myNumber);
        boxx.display(); //display() calls print(), printing the value.
    }
}
