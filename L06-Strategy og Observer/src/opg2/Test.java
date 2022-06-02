package opg2;

public class Test {
    public static void main(String[] args) {
        Saelger s1 = new Saelger("Hansen");
        Indkoeber i1 = new Indkoeber("Jensen");

        BogTitle b1 = new BogTitle("Anders And", 6);
        BogTitle b2 = new BogTitle("Java", 8);

        Kunde k1 = new Kunde("Læsehest1");
        Kunde k2 = new Kunde("Læsehest2");
        Kunde k3 = new Kunde("Læsehest3");

        b1.addObserver(s1);
        b1.addObserver(i1);
        b2.addObserver(i1);


        b2.etKoeb(k1);
        b2.etKoeb(k2);
        b2.etKoeb(k3);
        b1.etKoeb(k1);
        b1.etKoeb(k2);
        b1.etKoeb(k3);

    }
}
