package opg2;

import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Saelger implements Observer{
    private String navn;


    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitle b = (BogTitle)s;
        List<BogTitle> bL = new ArrayList<>();
        List<Kunde> kL = b.getKunder();

        for(Kunde k : kL) {
            for(BogTitle bT : k.bogTitles) {
                if(!bT.equals(b) && !bL.contains(bT))
                    bL.add(bT);
            }
        }
        System.out.println("Hvis du kunne lide " + b.getTitel() + " vil du elske:");
        for(BogTitle bT : bL) {
            System.out.println(bT.getTitel());
        }

    }

}
