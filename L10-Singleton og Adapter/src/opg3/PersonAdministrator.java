package opg3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonAdministrator {
    private Set<Person> personSet;
    private volatile static PersonAdministrator uniqueInstance;

    private PersonAdministrator() {
        this.personSet = new HashSet<>();
    }

    public static PersonAdministrator getInstance() {
        if(uniqueInstance == null) {
            synchronized (PersonAdministrator.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new PersonAdministrator();
                }
            }
        }
        return uniqueInstance;
    }

    public void add(Person person) {
        personSet.add(person);
    }

    public HashSet<Person> getPersoner() {
        return new HashSet<>(personSet);
    }

    public void removePerson(Person person) {
        personSet.remove(person);
    }
}
