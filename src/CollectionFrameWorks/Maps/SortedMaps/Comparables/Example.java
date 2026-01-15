package CollectionFrameWorks.Maps.SortedMapsDemo.Comparables;

import java.util.ArrayList;
import java.util.List;

// Implements Comparable<Student> → meaning objects of Student know how to compare themselves with other Students...
class Student implements Comparable<Student>{

    private double gpa;
    private String name;

    public Student(String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }

    // This method compares works like: '4.compareTo(3)' -> 4, 3 (order in which I want)...
    @Override
    public int compareTo(Student o) {
        // return o.getGpa() - this.getGpa(); // it will give error because,gpa are in 'doubles' , so we should use below method...
        return (Double.compare(o.getGpa(),this.getGpa()));
        // Double.compare(x, y) returns:---> (negative if x < y)  ,    (zero if x == y)  ,  (positive if x > y)
    }
}
public class Example {
    static void main() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice",9.5));
        studentList.add(new Student("Robin",9.9));
        studentList.add(new Student("Raj",9.6));
        studentList.add(new Student("Charlie",9.8));

        studentList.sort(null); // studentList.sort(null) means:→  "Sort using natural ordering," which comes from the compareTo() method...

        System.out.println(studentList);
    }
}
