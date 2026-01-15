package Interface.ANIMALS;

public interface ANIMAL {


// Declaring the abstract methods...

    // we don't need to write public and abstract by creating an abstract method in an interface...
    // because it is automatically public and abstract...
    public abstract void eat();

    void sleep(); // no need to write public and abstract

// Declaring the static variables...

    // we don't need to write public,static and final by creating a final static methods in an interface...
    // because : 1. In interfaces variables are already constant (can't be changed) , So we don't need 'final' keyword.
    // 2. In interfaces variables are already directly attached to interface , So we don't need 'Static' keyword.
    // 3. In interfaces variables are already public attached to interface , So we don't need 'public' keyword.
//    public static final int MAX_AGE = 150;
    int MAX_AGE = 150;

     // If we want to write method body,then we need to write static here,else it will consider it as an abstraction method and will give us error...
     // Because, Abstraction methods don't have a body (we just use them to declare methods)...
     // These static methods will only work with interface only...
     // We also can't write methods without static (because we wrote methods like that for instances of the class)
     // Since Interface can't have any class so, we need to write static keyword here....
    public static void info(){
        System.out.println("This is an ANIMAL interface...");
    }

// DEFAULT methods in interface :----->
    // Means it can only be accessed by the instances of the class that implements this interface...
    // And also we don't necessarily need to override default methods in the classes (that are implementing this interface)...
    default void run(){
        this.sleep(); // we can also run abstract methods in the default methods,when we call this method by class instance then this abstraction method will run automatically fot that instance ...
        System.out.println("Animal is running...");
    }

    default void weightAndHeight(int weight,int height){
        System.out.printf("weight is %d and height is %d" , weight,height);
        System.out.println();
    }

}
