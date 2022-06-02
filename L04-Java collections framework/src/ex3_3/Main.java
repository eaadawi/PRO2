package ex3_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        College c1 = new College("ABC");
        Student s1 = new Student(1, "Jan");
        c1.addStudent(s1);

        Student Jan = new Student(2, "Jan");
        Student Abe = new Student(1, "Abe");

        Set<Student> students = new HashSet<>(c1.getStudents());

        System.out.println(students.contains(s1));
        System.out.println(students.contains(Jan));
        System.out.println(students.contains(Abe));

    }


}
