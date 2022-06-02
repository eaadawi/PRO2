package opg1;

import java.awt.*;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {

        HashSet<Bil> bilHashSet = new HashSet<>();

        Bil b1 = new Bil(123, "Audi", "A1", "blå");
        Bil b2 = new Bil(123, "Audi", "A1", "blå");
        Bil b3 = new Bil(321, "BMW", "X7", "Hvid");
        Bil b4 = new Bil(321, "BMW", "X7", "Hvid");

        bilHashSet.add(b1);
        bilHashSet.add(b2);
        bilHashSet.add(b3);
        bilHashSet.add(b4);

        System.out.println(bilHashSet);
    }
}
