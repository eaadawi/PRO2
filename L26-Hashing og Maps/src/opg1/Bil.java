package opg1;

import java.util.Objects;

public class Bil {
    private int regNr;
    private String maerke;
    private String model;
    private String farve;

    public Bil(int regNr, String maerke, String model, String farve) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.farve = farve;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr=" + regNr +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", farve='" + farve + '\'' +
                '}';
    }

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bil)) return false;
        Bil bil = (Bil) o;
        return regNr == bil.regNr && Objects.equals(maerke, bil.maerke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNr, maerke);
    }
}
