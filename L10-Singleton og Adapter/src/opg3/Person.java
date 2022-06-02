package opg3;

public class Person{
    private String navn;
    private int alder;
    private int id;

    public Person(String navn, int alder, int id) {
        this.navn = navn;
        this.alder = alder;
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public int getId() {
        return id;
    }

    public void birthday() {
        alder++;
    }

    @Override
    public String toString() {
        return id + ":" + navn + "(" + alder + ")";
    }
}
