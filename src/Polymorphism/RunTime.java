package Polymorphism;

import Inheritance.Hierarchical_Inheritance.Animals_;
import Inheritance.Hierarchical_Inheritance.Cat_;
import Inheritance.Hierarchical_Inheritance.Dogs_;

// we are using the  Hierarchical_Inheritance classes to understand this...
public class RunTime {
    public static void main(String[] args) {

//  RUNTIME POLYMORPHISM:------------>
        // Here we are using the reference of parent class and the object of the child class , it is known as runTime Polymorphism...
        // With this we can use the methods which are inherited (or override methods) from the parent class...
        // In this we can't use the methods that are created in the child class...
        Animals_ bobby = new Dogs_(); // This is known as: UPCASTING...
        bobby.sayHello();
//        bobby.sayBye(); //we can't call this method with the parentClassReference since this one is created in child class (this method is not inherited from parent class)...

        // we manualy typeCast the parent class reference to child class reference by: (childClass_Name) referenceVariable.
        Dogs_ rocky = (Dogs_) bobby;
        rocky.sayBye();

        Animals_ destroyer = new Cat_(); // DOWNCASTING...
        destroyer.sayHello();
    }
}
