package cannibal;

public class Person {
    private final String navn;

    public Person(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
