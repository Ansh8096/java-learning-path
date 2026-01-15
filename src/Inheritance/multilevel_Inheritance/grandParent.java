package Inheritance.multilevel_Inheritance;

public class grandParent {
    private String name;
    private int age;
    boolean superPower;


//    public grandParent(){
    // we can set age and name like this
    public grandParent(int age,String name){
        this.age = age; // 'this.' will refer to which class object we are creating...
        this.name = name;
        superPower = false;
        System.out.println("GrandParent constructor called! ");
    }

    public void grandParentMethod(){
        System.out.println("Grand parent method is called");
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

    public boolean hasSuperPower() {
        return superPower;
    }
}
