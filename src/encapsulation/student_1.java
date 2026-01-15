package encapsulation;

public class student_1 {
    // properties/fields/instance variable & behaviour (means methods...)
    private String name;
    private int rollNo;
    private int age;

    public void setName(String name){
        this.name = name; // 'this' means we are referring to that particular variable...

    }

    public String getName(){
        if(this.name != "") {
            return this.name;
        }
        else return "invalid";

    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid Age");
        }
        else this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
