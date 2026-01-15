package JavaGenerics.GenericClasses.multipleType;
// Type Parameter Naming Conventions:---->
// T: Type
// E: Element (used in collections)
// K: Key (used in maps)
// V: Value (used in maps)
// N: Number

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
