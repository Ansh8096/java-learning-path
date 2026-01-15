package JavaGenerics.GenericClasses.multipleType;

public class testPair {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Age",20);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
