package opg3;

public class App {
    public static void main(String[] args) {
        Trekant t1 = new Trekant("t1", 1, 1);
        Trekant t2 = new Trekant("t2", 2, 2);
        Rektangel r1 = new Rektangel("r1",1,1);
        Rektangel r2 = new Rektangel("r2",2,2);
        Ellipse e1 = new Ellipse("e1", 1, 1);
        Ellipse e2 = new Ellipse("e2", 2, 2);
        SamletFigur s1 = new SamletFigur("s1");
        s1.add(t1);
        s1.add(r1);
        SamletFigur s2 = new SamletFigur("s2");
        s2.add(e1);
        s2.add(t2);
        SamletFigur s3 = new SamletFigur("s3");
        s3.add(r2);
        s3.add(e2);

        SamletFigur tegning = new SamletFigur("Tegning");
        tegning.add(s1);
        tegning.add(s2);
        tegning.add(s3);

        tegning.tegn();
        System.out.println(tegning.getAreal());

    }
}
