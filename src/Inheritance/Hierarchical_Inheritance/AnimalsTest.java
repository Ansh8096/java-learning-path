package Inheritance.Hierarchical_Inheritance;

public class AnimalsTest {

    public static void main(String[] args){
        // when one parent class is inherited by two child classes that is known as Hierarchical inheritance...
        Dogs_ doggie = new Dogs_();
        doggie.setAge(2);
        doggie.setName("charlie");
        doggie.eats();
        doggie.sayHello();

        Cat_ pussyCat = new Cat_();
        pussyCat.sayHello();
    }
}
