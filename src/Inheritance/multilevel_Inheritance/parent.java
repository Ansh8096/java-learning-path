package Inheritance.multilevel_Inheritance;

public class parent extends grandParent{

//    public parent(){
    public parent(int age , String name){

        // super() --->  it is known as the parent class default constructor...
        // it is hidden and gets automatically called...
        // parent class constructor should get called first in its child class...
//        super();
        super(age,name); // beacuse now it parameterized constructor..
        System.out.println("Parent constructor called! ");
    }

    public void parentMethods(){
        System.out.println("parent method is called ");
    }
}
