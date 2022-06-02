package opg3;

public class AnvendPersonAdminstrator {
    public static void main(String[] args) {
        System.out.println(PersonAdministrator.getInstance().getPersoner() + " = ingenting");

        Person person1 = new Person("Kurt", 25, 1);
        Person person2 = new Person("Jens", 22, 2);
        PersonAdministrator.getInstance().add(person1);
        PersonAdministrator.getInstance().add(person2);
        System.out.println(PersonAdministrator.getInstance().getPersoner() + " = Kurt og Jens");

        PersonAdministrator.getInstance().removePerson(person1);
        System.out.println(PersonAdministrator.getInstance().getPersoner() + " = Jens");

    }
}
