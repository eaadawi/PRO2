package ex2_3;

import java.util.HashMap;
import java.util.Map;

public class College {
    private String name;
    //------------------------------------------------------------------------------------------------------------------
    //association 0..1 --> 0..* Student
    private Map<Integer, Student> students = new HashMap();
    //------------------------------------------------------------------------------------------------------------------

    public College(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(),student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        double avg = 0;
        double size = 0;

        for(Student s : students.values()) {
            for(int g : s.getGrades()) {
                avg += g;
            }
            size += s.getGrades().size();
        }

        return avg / size;
    }

    public Student findStudent(int studentNo) {
        return students.get(studentNo);
    }

    @Override
    public String toString() {
        return "College{" + name + '}';
    }
}
