package Enum_inJava;

public enum day {
    // Enum constants...
    // it is the first thing which you want to write in Enum...
    // Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;

    // After creating your own custom constructor, You need to write instances of the Enum according to the constructor...
    Monday("Monday","somwar"),Tuesday("Tuesday","Mangalwar"),Wednesday("Wednesday","Budhwaar"),Thursday("Thursday","Virwaar"),Friday("Friday","Shukrwaar"),Saturday("Saturday","Shaniwaar"),Sunday("Sunday","Aetwaar");

    // private fields...
    private String lower;
    private String hindi ;

    public String getLower() {
        return lower;
    }

    public String getHindi() {
        return hindi;
    }

    // creating custom constructor for our instances of the Enum...
    private day(String lower,String hindi){
        this.lower = lower;
        this.hindi = hindi;
    }


    // we can also write methods in the enum , beacauz during compilation Enum gets converted into class...
    public void display() {
        System.out.println("Today is " + this.name()); // 'this.name()' comes from Enum Interface...
    }
}
