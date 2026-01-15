package Inheritance.Hierarchical_Inheritance;

public class Animals_
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eats(){
        System.out.println("this animal eats foods...");
    }

    public void sayHello(){
        System.out.println("");
    }
}
