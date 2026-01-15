package com.engineerAnsh.coreJava.animals;

public class I_eg {
    public static void main(String[] args) {
        // 2. Inheritance...
//        I_Cat billi = new I_Cat();
//        billi.name = "Galaxy Destroyer" ;
//        billi.age = "10";

        // 3. polymorphism...
//        I_Animal dogy = new i_dogg();
//        dogy.makesSound();
//        I_Animal pussyCat = new I_Cat();
//        pussyCat.makesSound();

        // method in java...
        I_Cat a = new I_Cat(); // a is reference of memory location...
        a.name = "destroyer";

        I_Cat billi = makeCatNameToUpperCase(a); // here we are sending the reference of a ..
        System.out.println(billi.name);
        System.out.println(a.name);
        // we will get same name print in both the above print methods because the name is changed by the in its memory location method...

    }

    public static I_Cat makeCatNameToUpperCase(I_Cat cat){
        // here cat is pointing to the same memory location which reference a is pointing...
        // the changes we are making in that particular memory location got by certain reference get changed permanently...  i
        cat.name = cat.name.toUpperCase();
        return cat;
    }

}
