package opg2;

import java.util.ArrayList;
import java.util.List;

public class Indkoeber implements Observer{
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitle b = (BogTitle) s;
        if(b.getAntal() < 6) {
            System.out.println("Der skal købes flere bøger af titlen " + b.getTitel());
            b.indkoebTilLager(10);
        }
    }
}
