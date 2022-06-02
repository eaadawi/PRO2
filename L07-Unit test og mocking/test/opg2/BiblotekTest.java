package opg2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BiblotekTest {

    @Test
    void beregnBøde_1Til7_Dage_Overskredet_Voksen() {
        //Arrange
        Biblotek biblotek = new Biblotek();
        LocalDate beregnetDato1 = LocalDate.of(2022,3, 1);
        LocalDate faktiskDato1 = LocalDate.of(2022,3, 2);
        LocalDate beregnetDato2 = LocalDate.of(2022,3, 1);
        LocalDate faktiskDato2 = LocalDate.of(2022,3, 8);
        boolean voksen = true;
        int expectedBøde = 20;

        //Act
        int actualBøde1 = biblotek.beregnBøde(beregnetDato1, faktiskDato1, voksen);
        int actualBøde2 = biblotek.beregnBøde(beregnetDato2, faktiskDato2, voksen);

        //Assert
        assertEquals(expectedBøde, actualBøde1);
        assertEquals(expectedBøde, actualBøde2);
    }

    @Test
    void beregnBøde_8Til14_Dage_Overskredet_Barn() {
        //Arrange
        Biblotek biblotek = new Biblotek();
        LocalDate beregnetDato1 = LocalDate.of(2022,3, 1);
        LocalDate faktiskDato1 = LocalDate.of(2022,3, 2);
        LocalDate beregnetDato2 = LocalDate.of(2022,3, 1);
        LocalDate faktiskDato2 = LocalDate.of(2022,3, 8);
        boolean voksen = false;
        int expectedBøde = 10;

        //Act
        int actualBøde1 = biblotek.beregnBøde(beregnetDato1, faktiskDato1, voksen);
        int actualBøde2 = biblotek.beregnBøde(beregnetDato2, faktiskDato2, voksen);

        //Assert
        assertEquals(expectedBøde, actualBøde1);
        assertEquals(expectedBøde, actualBøde2);
    }

    @Test
    void beregnBøde_8Til14_Dage_Overskredet_Voksen() {
        //Arrange
        Biblotek biblotek = new Biblotek();
        LocalDate beregnetDato1 = LocalDate.of(2022,3, 1);
        LocalDate faktiskDato1 = LocalDate.of(2022,3, 9);
        LocalDate beregnetDato2 = LocalDate.of(2022,3, 1);
        LocalDate faktiskDato2 = LocalDate.of(2022,3, 15);
        boolean voksen = true;
        int expectedBøde = 20;

        //Act
        int actualBøde1 = biblotek.beregnBøde(beregnetDato1, faktiskDato1, voksen);
        int actualBøde2 = biblotek.beregnBøde(beregnetDato2, faktiskDato2, voksen);

        //Assert
        assertEquals(expectedBøde, actualBøde1);
        assertEquals(expectedBøde, actualBøde2);
    }
}