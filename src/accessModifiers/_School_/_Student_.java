package accessModifiers._School_;

public class _Student_ {
    public String name;
    public int age;

    // private Constructors : it prevent users to create the new object of this class...
    private _Student_(){};

    public void sayHello(){
        System.out.println("Hello g");
    }

    // the static methods are directly attached to its respective class
    // so we can use this method without creating the class object...
    public static void sayBye(){
        System.out.println("Bye...");
    }

}
