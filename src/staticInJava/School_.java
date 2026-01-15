package staticInJava;

// we want only one object of this 'school_' class (so,we will use private constructor)...
public class School_ {
    private static School_ SJS = new School_();

    private School_(){};

    public static School_ getInstance(){
        return SJS;
    }
}
