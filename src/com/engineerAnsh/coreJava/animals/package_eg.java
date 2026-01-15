package com.engineerAnsh.coreJava.animals;

import test2.I_Cat;

public class package_eg {
    public static void main(String[] args) {
        // after importing one class, if you want to create a object with different class of same name then you have to mention it...
        I_Cat cat2 = new I_Cat();
        com.engineerAnsh.coreJava.animals.I_Cat cat1 = new com.engineerAnsh.coreJava.animals.I_Cat(); // we are creating the I_cat class  object from test2 package...
    }
}
