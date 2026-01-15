package Constructors;

public class Student_2Test {
    public static void main(String[] args) {

        Student_2 ansh = new Student_2(); // Now,this calls overload constructor...
        System.out.println(ansh.age);

        Student_2 ansh2 = new Student_2("verma");
        System.out.println(ansh2.name);

        Student_2 ansh3 = new Student_2("Anshi",18,454);
        System.out.println(ansh3.name+" " + ansh3.age + " " +ansh3.rollNo);
    }
}
