package Abstraction;

public abstract class _Animals_ {
    private String name;
    private int age;
    private boolean hasSuperpowers;

    // Here we should use constructors as Protected (there is no point in dong it public), beacuz we are not going to create the object of the abstract class...
    // because the constructor of abstract class can only be called in its subClasses . So, protected modifier should be enough...
//    public _Animals_(){   // not point in making public constructor...
    protected _Animals_(){
        hasSuperpowers = false;
    }

    // if we want to declare the method body later in any child class.
    // Then, we need to declare our public class and this method as abstraction class (and abstraction method)...
//    public abstract void sayHello(); // means it can be accessed outside the package...
//    abstract void sayHello();// now it is accessed in its current package only(it is known as package private) , And also we won't be able to override this method in any other package's class...
    protected abstract void sayHello();// now it can only be accessed by the class (if that particular class is the child class of this class) , Any class can extend this class even of other package now...

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
