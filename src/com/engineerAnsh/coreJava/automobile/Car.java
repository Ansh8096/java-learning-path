package com.engineerAnsh.coreJava.automobile;

public class Car {
//    public String color;
//    String brand;
//    String model;
//    // private will prevent us from accessing the year directly...
//    int year;
//    int speed ;

    // 1. Encapsulation in JAVA:--------->

    // private will prevent us from accessing the year directly...
    // we can only access them by using setters ot getters methods...
    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;

    // we can discard setter method to prevent for updation of our critical data.....
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // these are the methods in java:
    public void accelerate(int increment){
        speed += increment;
    }
    public void brake(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }
    }

    public static void main(String[] args) {
        Cycles cycle = new Cycles();
        Cycles.MiniByCycle byCycle = cycle.new MiniByCycle(); // this how you access the class which is declared inside the public class...
    }
}
