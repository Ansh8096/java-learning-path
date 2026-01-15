package wrapperClasees.Examples;

public class example_1 {

    static class Student{
        public int id;
    }

    public static void main(String[] args) {
        Student x = new Student(); // Here 'x' is the object of class that stores the memory address...
        x.id = 1;
        func1(x); // We are sending the reference variable...
        System.out.println(x.id); // We will still get 'ID = 1' because, we haven't changed the 'ID' of x object...
    }

    public static void func1(Student a){
        Student student = new Student();
        student.id = 2;
        a = student; // we are making the 'a' to store the 'student' variable address...
    }

}
