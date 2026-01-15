package Inheritance.multilevel_Inheritance;

public class humansTest {
    public static void main(String... args){
        // this is how the constructors are called...
//        child bacha = new child();
        child bacha = new child(17,"Rocky");
//        bacha.setAge(16);
//        System.out.println(bacha.getAge());
//        System.out.println(bacha.superPower); // it will give us false becauz we set this false in the grandParent constructor...

        bacha.childMethods();
        System.out.println(bacha.getName());
        System.out.println(bacha.getAge());

    }
}
