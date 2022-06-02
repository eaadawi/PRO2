package ex3_2;


public class Main {
    public static void main(String[] args) {
        College c1 = new College("ABC");
        Student s1 = new Student(1, "Jan");
        Student s2 = new Student(2, "Kim");
        Student s3 = new Student(3, "lasd");
        Student s4 = new Student(4, "Abe");
        Student s5 = new Student(5, "Bent");
        Student s6 = new Student(6, "Citron");
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c1.addStudent(s5);
        c1.addStudent(s6);
        System.out.println(c1.getStudents());
    }


}
