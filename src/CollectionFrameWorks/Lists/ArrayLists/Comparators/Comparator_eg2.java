package CollectionFrameWorks.Lists.ArrayLists.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}
public class Comparator_eg2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Charlie" , 3.5));
        studentList.add(new Student("Alice" , 3.5));
        studentList.add(new Student("Bob" , 3.7));
        studentList.add(new Student("Akshit" , 3.9));

    // Sorting in a natural order ...
        // It will give us error, because In 'Student' class we have not written any natural ordering...
        // we need to implement comparable interface to give any natural ordering...
        // studentList.sort(null);

    // 'Custom Comparator':----->
        // studentList.sort((a,b) -> (int) (b.getGpa() - a.getGpa())); // It won't sort correctly because of typeCasting (int)...
        // studentList.sort((a,b) -> {
        //     if(b.getGpa()  - a.getGpa() < 0) return -1;
        //     if(b.getGpa()  - a.getGpa() > 0) return 1;
        //     // else return 0;
        //
        // // If the gpa is tie then it will, get sorted by name in ascending order...
        // // That’s because String.compareTo() in Java returns: negative → a comes before b...
        // // positive → a comes after b...
        // // zero → names are equal...
        //     else return a.getName().compareTo(b.getName());
        // });

    // that’s a Java 8+ style comparator :-->
        // Comparator.comparing(Student::getGpa) → creates a comparator that sorts by GPA in ascending order...
        // .reversed()c→ flips it to descending order (highest GPA first)...
        // .thenComparing(Student::getName) → if two students have the same GPA, then it compares them by name in ascending lexicographic order...
        Comparator<Student> studentComparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        // studentList.sort(studentComparator);

        Collections.sort(studentList,studentComparator); // we can also use 'collection.sort()' method with our own custom operator...
        // For printing...
        for (Student std : studentList){
            System.out.println(std.getName()+ ": " + std.getGpa());
        }

    }
}
