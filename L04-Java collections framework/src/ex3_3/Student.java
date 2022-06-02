package ex3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
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
    public boolean equals(Object o) {
        Student s = (Student) o;
        return studentNo == s.studentNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentNo);
    }
}
