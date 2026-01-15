package staticInJava;

public class Studen_t {
    private int id;
    private  String name;
    private int age;

    // Static variable:
    public static String schoolName = "St. joseph School";

    // Static variable:
    public static int  cnt = 0;

    // Static method:
    public Studen_t(){
        cnt++; // 'cnt' will increment whenever we call the public constructor of this class(or we create a new object of this class)...
    }

    // Static method : we need to use static variables in the static method...
    public static void getCnt(){
        System.out.println("Total Students: " + cnt);
    }

    // Static Block:---
    // It is used for performing static initialization...
    // It is used for one time setup task...U
    static {
        System.out.println("This is from Static Block ");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
