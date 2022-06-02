package opg3;

public class Trekant extends Figur{
    private double højde;
    private double grundLinje;

    public Trekant(String navn, double højde, double grundLinje) {
        super(navn);
        this.højde = højde;
        this.grundLinje = grundLinje;
    }

    @Override
    public void tegn() {
        System.out.println(getNavn());
    }

    @Override
    public double getAreal() {
        return højde * grundLinje / 2;
    }

    @Override
    public void add(Figur figur) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Figur figur) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Figur getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
