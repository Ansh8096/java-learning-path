package Inheritance.multilevel_Inheritance;

public class child extends parent{
    public child(int age,String name)
    {
        // super() --->  it is known as the parent class default constructor...
        // it is hidden and gets automatically called...
        // parent class constructor should get called first in its child class...
//        super();
        super(age,name);
        System.out.println("child constructor called! ");
    }
    public void childMethods(){
        // we can write this in starting,last or anywhere because it is not a constructor...
        super.parentMethods(); // we can also call parent class methods like this also...
        System.out.println("child method is called! ");
    }

}
