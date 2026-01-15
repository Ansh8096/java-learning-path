package encapsulation;

public class student_1Test {
    public static void main(String[] args) {
        student_1 ansh = new student_1();
//        ansh.name = "Ansh Verma";
//        ansh.rollNo = 454;
//        ansh.age = 21;
//        System.out.println(ansh.age);

          ansh.setName("Ansh Verma");
          System.out.println(ansh.getName());

          ansh.setAge(21);
          System.out.println(ansh.getAge());

          ansh.setRollNo(454);
          System.out.println(ansh.getRollNo());
    }
}
