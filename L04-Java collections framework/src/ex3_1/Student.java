package ex3_1;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{
    private int studentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" + name + '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentNo, o.studentNo);
    }
}
