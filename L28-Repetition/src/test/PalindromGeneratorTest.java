package test;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrom.PalindromGeneratorI;
import palindrom.PlindromGenerator;

import static org.junit.jupiter.api.Assertions.*;

class PalindromGeneratorTest
{
    ArrayList<String> palindromdatoer;

    @BeforeEach
    void setUp() throws Exception
    {
        palindromdatoer = new ArrayList<String>();

        URL url = getClass().getResource("test-palindrom-datoer.txt");
        File palindromTxt = new File(url.getPath());
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromdatoer.add(data);
        }
        palindromScanner.close();
    }

    @Test
    void test()
    {
        // Arrange
        PalindromGeneratorI pg = new PlindromGenerator();
        String fejl = "10101010";


        // Act
        HashSet<String> set = pg.udledDanskePalindromdatoer();

        // Assert
        for(String s : palindromdatoer) {
            assertTrue(set.contains(s));
        }
        assertFalse(set.contains(fejl));

    }

}
