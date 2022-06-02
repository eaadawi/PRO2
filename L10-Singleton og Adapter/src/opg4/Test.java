package opg4;

public class Test {
    public static void main(String[] args) {
        Vare vare;
        Spiritus spiritus = new Spiritus(60, "Vodka");
        vare = new SpiritusAdapter(spiritus);

        System.out.println(vare.getNavn());
        System.out.println(vare.getPris());
        System.out.println(vare.beregnMoms());
    }
}
