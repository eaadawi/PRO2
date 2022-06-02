package palindrom;

public class PalindromValidator implements PalindromValidatorI{
    @Override
    public boolean erGyldigtPalindrom(String tekst) {
        tekst = tekst.replaceAll("[^A-Za-z0-9]", "");
        int length = tekst.length();

        if (length <= 1) { return true; }
        else {
            char first = Character.toLowerCase(tekst.charAt(0));
            char last = Character.toLowerCase(tekst.charAt(length - 1));

            if (first == last) {
                String shorter = tekst.substring(1, length - 1);
                return erGyldigtPalindrom(shorter);
            }
            else {
                return false;
            }
        }
    }

    @Override
    public boolean erGyldigtPalindromPrimtal(int tal) {
        for(int i = 2; i < tal; i++) {
            if(tal%i == 0) return false;
        }

        return erGyldigtPalindrom(tal + "");
    }
}
