package ex3_3;

import java.util.HashSet;
import java.util.Set;

public class College {
    private String name;
    //------------------------------------------------------------------------------------------------------------------
    //association 0..1 --> 0..* Student
    private Set<Student> students = new HashSet<>();
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

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "College{" + name + '}';
    }
}
