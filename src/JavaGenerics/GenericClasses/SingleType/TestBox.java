package JavaGenerics.GenericClasses.SingleType;

public class TestBox {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(2);
        Integer i = box.getValue();
        System.out.println(i);

        Box<String> box1 = new Box<>();
        box1.setValue("Ansh");
        System.out.println(box1.getValue());
    }
}
