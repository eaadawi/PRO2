package test;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrom.PalindromValidator;
import palindrom.PalindromValidatorI;

import static org.junit.jupiter.api.Assertions.*;

class PalindromValidatorTest
{
    ArrayList<String> palindromer;
    ArrayList<Integer> palindromprimtal;

    @BeforeEach
    void setUp() throws Exception
    {
        palindromer = new ArrayList<String>();

        URL url = getClass().getResource("test-palindrom.txt");
        File palindromTxt = new File(url.getPath());
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromer.add(data);
        }
        palindromScanner.close();

        palindromprimtal = new ArrayList<Integer>();

        url = getClass().getResource("test-palindrom-primtal.txt");
        palindromTxt = new File(url.getPath());
        palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromprimtal.add(Integer.parseInt(data));
        }
        palindromScanner.close();
    }

    @Test
    void test_erGyldigtPalindrom()
    {
        // Arrange
        PalindromValidatorI pv = new PalindromValidator();
        String fejl = "AnnanA";

        // Act & Assert
        for(String s : palindromer) {
            assertTrue(pv.erGyldigtPalindrom(s));
        }
        assertFalse(pv.erGyldigtPalindrom(fejl));

    }

    @Test
    void test_erGyldigtPalindromPrimtal()
    {
        // Arrange
        PalindromValidatorI pv = new PalindromValidator();
        int fejl1 = 848;

        int fejl2 = 13;

        // Act & Assert
        for(int i : palindromprimtal) {
            assertTrue(pv.erGyldigtPalindromPrimtal(i));
        }
        assertFalse(pv.erGyldigtPalindromPrimtal(fejl1));
        assertFalse(pv.erGyldigtPalindromPrimtal(fejl2));

    }

}
