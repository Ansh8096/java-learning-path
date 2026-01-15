package dataTypes;

public class testStudent {
    public static void main(String[] args){
        // we are creating the class object in a heap memory...
        // here Ansh is the reference variable...
        // here Ansh stores the memory address of that object...
        Student Ansh = new Student(); // new-> creates a new object in a heap memory..
        Ansh.name = "Ansh Verma";
        Ansh.Address = "Ambala City";
        Ansh.rollNumber = 54;
        Ansh.standard = 15;
        System.out.print(Ansh.standard);
    }
}
