package opg2;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
    private String navn;
    List<BogTitle> bogTitles = new ArrayList<>(); //Package visibility

    public Kunde(String navn) {
        this.navn = navn;
    }
}
