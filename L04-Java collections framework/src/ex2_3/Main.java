package ex2_3;

public class Main {
    public static void main(String[] args) {
        College c1 = new College("ABC");
        Student s1 = new Student(1, "Jan");
        Student s2 = new Student(2, "Kim");
        Student s3 = new Student(3, "Sif");
        s1.addGrade(7);
        s1.addGrade(12);
        s2.addGrade(10);
        s2.addGrade(2);
        s3.addGrade(4);
        s3.addGrade(7);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);

        System.out.println(c1.calcAverage());
        System.out.println(c1.findStudent(2));
    }


}
