package opg3;

public class Ellipse extends Figur{
    private double radius1;
    private double radius2;

    public Ellipse(String navn, double radius1, double radius2) {
        super(navn);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public void tegn() {
        System.out.println(getNavn());
    }

    @Override
    public double getAreal() {
        return radius1 * radius2 * Math.PI;
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
