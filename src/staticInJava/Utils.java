package staticInJava;


// we often use static Keywords in the utils class...
// these utils class will include the static methods which we often use...
// since the methods we use will be static , So we can directly use these methods (without creating th object of the class)...

public class Utils {

    // we cant update this value now...
    public static final double pi = 3.1456;

    // we can declare the static final keyword variable here...
    public static final double root_2;

    // And then we can use the static block to initialize its value here:
    static{
        root_2 = 1.414;
    }

    // method to get the maximum no..
    public static int getMax(int a,int b){
        if(a>b) return a;
        else return b;
    }

    // method to get the minimum no..
    public static int getMin(int a,int b){
        if(a<b) return a;
        else return b;
    }

    // method to trim our string and then get it in upperCases...
    public static String trimAndUpperCase(String str){
        if(str != null){
            return str.trim().toUpperCase();
        }
        else return "";
    }

}
