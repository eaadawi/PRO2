package forsikring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    private BilForsikring bilForsikring;

    @BeforeEach
    public void setUpBeforeEach() {
        this.bilForsikring = new BilForsikring();
    }

    @Test
    void setGrundpaemie() {
        //Arrange
        int grundPræmie = -500;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.setGrundpaemie(grundPræmie);
        });
        assertTrue(exception.getMessage().contains("grundPr skal vaere positiv"));
    }

    @Test
    void beregnPraemie_Grundværdi0Fejl() {
        //Arrange
        int alder = 26;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertTrue(exception.getMessage().contains("GrundPraemie har ikke faeet en vaerdi"));
    }

    @Test
    void beregnPraemie_Under18Fejl() {
        //Arrange
        bilForsikring.setGrundpaemie(500);
        int alder = 17;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertTrue(exception.getMessage().contains("Du er for ung til at tegne en forsikring"));
    }

    @Test
    void beregnPraemie_IkSkadefriSåLængeFejl() {
        //Arrange
        bilForsikring.setGrundpaemie(500);
        int alder = 26;
        boolean isKvinde = false;
        int skadeFrieaer = 10;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertTrue(exception.getMessage().contains("Du kan ikke have kaert skadefri saelaenge"));
    }

    @Test
    void beregnPraemie_NegativSkadefriFejl() {
        //Arrange
        bilForsikring.setGrundpaemie(500);
        int alder = 26;
        boolean isKvinde = false;
        int skadeFrieaer = -2;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertTrue(exception.getMessage().contains("Antal skade frie aer skal vaere positiv"));
    }

    @Test
    void beregnPraemie_AlderUnder25() {
        //Arrange
        bilForsikring.setGrundpaemie(500);
        int alder1 = 18;
        int alder2 = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        double expectedpræmie = 625;

        //Act
        double actualPræmie1 = bilForsikring.beregnPraemie(alder1, isKvinde, skadeFrieaer);
        double actualPræmie2 = bilForsikring.beregnPraemie(alder2, isKvinde, skadeFrieaer);

        //Assert
        assertEquals(expectedpræmie, actualPræmie1);
        assertEquals(expectedpræmie, actualPræmie2);
    }

    @Test
    void beregnPraemie_IsKvinde() {
        //Arrange
        bilForsikring.setGrundpaemie(500);
        int alder = 26;
        boolean isKvinde = true;
        int skadeFrieaer = 0;
        double expectedpræmie = 475;

        //Act
        double actualPræmie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        //Assert
        assertEquals(expectedpræmie, actualPræmie);
    }

    @Test
    void beregnPraemie_SkadeFri3Til5År() {
        //Arrange
        bilForsikring.setGrundpaemie(500);
        int alder = 26;
        boolean isKvinde = false;
        int skadeFrieaer1 = 3;
        int skadeFrieaer2 = 5;
        double expectedpræmie = 425;

        //Act
        double actualPræmie1 = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer1);
        double actualPræmie2 = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer2);

        //Assert
        assertEquals(expectedpræmie, actualPræmie1);
        assertEquals(expectedpræmie, actualPræmie2);
    }


}