package ex2_1;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    //------------------------------------------------------------------------------------------------------------------
    //association 0..1 --> 0..* Student
    private List<Student> students = new ArrayList<>();
    //------------------------------------------------------------------------------------------------------------------

    public College(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        double avg = 0;
        double size = 0;

        for(Student s : students) {
            for(int g : s.getGrades()) {
                avg += g;
            }
            size += s.getGrades().size();
        }

        return avg / size;
    }

    public Student findStudent(int studentNo) {
        Student student = null;

        for(Student s : students) {
            if(s.getStudentNo() == studentNo)
                student = s;
        }

        return student;
    }

    @Override
    public String toString() {
        return "College{" + name + '}';
    }
}
