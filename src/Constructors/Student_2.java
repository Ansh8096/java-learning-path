package Constructors;

public class Student_2 {

    String name;
    int rollNo;
    int age;

    // Constructors:-------->

    // 1. Default constructor:
//    Student_2(){}

    // 2. overload constructor:
    Student_2(){
        this.age = 18;
    }
    // 3. parameterized constructor:
    Student_2(String name1){
        this.name = name1;
    }

    // parameterized constructor...
    Student_2(String name1,int age1,int rollNo2){
        this.name = name1;
        this.age = age1;
        this.rollNo= rollNo2;
    }
}
