package opg2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Ib1");
        Person p2 = new Person("Ib2");
        Person p3 = new Person("Ib3");
        Person p4 = new Person("Ib4");
        PersonCollection pc = new PersonCollection();
        pc.add(p1);
        pc.add(p2);
        pc.add(p3);
        pc.add(p4);

        Iterator<Person> personIterator = pc.iterator();

        while(personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }

        pc.add(p1);
        System.out.println(personIterator.next());

    }

}
