package ExceptionHandling.Try_catch;

public class Student_eg {
    public String id;
    public String name;


    // this is the toString() method (od String class )...
    // which we can override wherever we want...
    // now when we will run System.out.println(), this toString() method will get called internally...;
    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
