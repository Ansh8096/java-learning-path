package com.engineerAnsh.coreJava.animals;

// Inheritance : I_Cat class is inheriting properties from its base class I_Animal ...
public class I_Cat extends I_Animal {
        String name;
        String breed;

        @Override
        public void makesSound(){
            System.out.println("Meow");
        }

}
