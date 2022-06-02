package opg3;

import java.util.ArrayList;
import java.util.List;

public abstract class Figur {
    private String navn;
    private List<Figur> children = new ArrayList<>();

    public Figur(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void tegn() {
        for(Figur f : children) {
            f.tegn();
        }
    }

    public double getAreal() {
        double areal = 0;
        for(Figur f : children) {
            areal += f.getAreal();
        }
        return areal;
    }

    public void add(Figur figur) {
        children.add(figur);
    }

    public void remove(Figur figur) {
        children.remove(figur);
    }

    public Figur getChild(int index) {
        return children.get(index);
    }
}
