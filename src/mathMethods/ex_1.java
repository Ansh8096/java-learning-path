package mathMethods;

public class ex_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));

        int c = -11;
        System.out.println(Math.abs(c)); // it returns the +ve value of a -ve number...

        double d = 11.02;
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d)); // it returns the integer nearest value of the number...

        int e = 144;
        System.out.println(Math.sqrt(e));
        System.out.println(Math.pow(12,2)); // returns 12^2 ...

        System.out.println(Math.log(2));
        System.out.println(Math.log10(10));

        System.out.println(1 + Math.PI);
        System.out.println(Math.random()); // it gives the random value everytime you run (range of no is 0.0000 to 1.99)...
    }
}
