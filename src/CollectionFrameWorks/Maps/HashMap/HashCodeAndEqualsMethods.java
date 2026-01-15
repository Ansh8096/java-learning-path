package CollectionFrameWorks.Maps.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethods {
    public static void main(String[] args) {
    // HashMap with the In-Built classes...
        HashMap<Integer,String> mpp = new HashMap<>();
        mpp.put(1,"Neha");  // hashCode1 --> index1
        mpp.put(2,"Rahul"); // hashCode2 --> index2
        mpp.put(1,"Rohan"); // hashCode1 --> index1 --> equals --> replace

        // System.out.println(mpp.size());
        // System.out.println(mpp.get(1));

    // HashMap with the custom classes...
        Person p1 = new Person("Alice" , 1);
        Person p2 = new Person("Bob" , 2);
        Person p3 = new Person("Alice" , 1);

        HashMap<Person,String> mpp2 = new HashMap<>();
        mpp2.put(p1,"Engineer"); // hashCode1 --> index1
        mpp2.put(p2,"Designer"); // hashCode2 --> index2
        mpp2.put(p3,"Manager"); // hashCode1 --> index1 --> equals --> replace


        System.out.println(mpp2.size());
        System.out.println(mpp2.get(p1));
        System.out.println(mpp2.get(p3));
//        System.out.println(p1);

    }

    static class Person{
        private int Id;
        private String name;

        public Person(String name,int id) {
            this.Id = id;
            this.name = name;
        }

        public int getId() {
            return Id;
        }

        public String getName() {
            return name;
        }

    // So,overriding hashCode() and equals() in custom classes is necessary...
    // If you want keys to be compared based on values (not memory addresses)...

        // hashCode() → generates a hash using 'name' and 'id'.
        @Override
        public int hashCode() {
            // It makes sure if the 'input' is same,then our 'output' (hashCode) should be also same...
            return Objects.hash(name,Id);
        }

        // equals() → compares two Person objects logically (same id and name)...
        @Override
        public boolean equals(Object obj) {
            // Edge case:
            if(this == obj) {
                return true;
            }
            // Edge case:
            if(obj == null) {
                return false;
            }
            // Edge case:
            if(obj.getClass() != this.getClass()){
                return false;
            }

            Person other = (Person) obj;
            return Id == other.getId() && Objects.equals(name,other.getName());
        }

        // toString() → gives a readable string format for debugging...
        @Override
        public String toString() {
            return "ID: "+Id + ", Name: " + name;
        }

    }
}
