package opg3;

public class Rektangel extends Figur{
    private double længde;
    private double bredde;
    
    public Rektangel(String navn, double længde, double bredde) {
        super(navn);
        this.længde = længde;
        this.bredde = bredde;
    }

    @Override
    public void tegn() {
        System.out.println(getNavn());
    }

    @Override
    public double getAreal() {
        return længde * bredde;
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
