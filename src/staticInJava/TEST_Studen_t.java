package staticInJava;

import jdk.jshell.execution.Util;

public class TEST_Studen_t {

    // Non-static method to get the sum of given numbers...
    public int sum(int ...a){
        int res = 0;
        for(int itt : a){
            res += itt;
        }
        return res;
    }

    // static method to get the sum of given numbers...
    public static int sum2(int ...a){
        int res = 0;
        for(int itt : a){
            res += itt;
        }
        return res;
    }


    // we use static keyword here in the main method, because JVM will directly call this method...
    // else if we dont use static keyword,then we need to create the object of this class ...
    public static void main(String... args){
        System.out.println(Studen_t.schoolName);
        Studen_t student1 = new Studen_t();
        Studen_t student2 = new Studen_t();
        Studen_t student3 = new Studen_t();
        Studen_t student4 = new Studen_t();
        Studen_t student5 = new Studen_t();

//        System.out.println(Studen_t.cnt); // this will give us five because we created 5 objects of the 'Studen_t' class..
        Studen_t.getCnt(); // this is the static method so we can directly use this (without creating class instance)with the help of className...

        // if we want to use the non static method in the static method , then we need to create a class object first to use it...
        TEST_Studen_t test1 = new TEST_Studen_t();
        System.out.println(test1.sum(1,2,3));

        // Static methods can be used directly without creating the class object just like this...
        System.out.println(TEST_Studen_t.sum2(10,20,30));


         // Utils methods test:-----

        // static methods:
        System.out.println(Utils.getMax(4,8));
        System.out.println(Utils.getMin(1,2));
        System.out.println(Utils.trimAndUpperCase("  ansh verma  "));

        // final keyword variables:
        System.out.println(Utils.pi); // pi value...
        System.out.println(Utils.root_2); // root_2 value...


        // By this we can get the instance of the class...
        School_ SJS = School_.getInstance();

    }
}
