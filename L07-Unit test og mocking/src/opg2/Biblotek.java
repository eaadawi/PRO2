package opg2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Biblotek {
    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     *       beregnetDato < faktiskDato
     *      (beregnetDato er forventet afleveringsdato og
     *       faktiskDato er den dag bogen blev afleveret; voksen er
     *       sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        long overskredet = ChronoUnit.DAYS.between(beregnetDato, faktiskDato);

        return voksen ? overskredet>7 ? 60 : 20 : overskredet > 7 ? 30 : 10;
    }
}
