package com.engineerAnsh.coreJava.Testing;

import com.engineerAnsh.coreJava.automobile.Car;
import com.engineerAnsh.coreJava.automobile.Cycles;

public class test {
    public static void main(String[] args) {
        Car gaadi = new Car();
        // we can't use minicycles class because it is not public so it can't be accessed outside its own package..
        Cycles bicycle = new Cycles();

    }
}
