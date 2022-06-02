package palindrom;

import java.util.HashSet;

public class PlindromGenerator implements PalindromGeneratorI{
    @Override
    public HashSet<String> udledDanskePalindromdatoer() {
        HashSet<String> result = new HashSet<>();

        udledDanskePalindromdatoer(1, 1, result);

        return result;
    }

    private void udledDanskePalindromdatoer(int d, int m, HashSet<String> result) {

        if(isDate(d, m)) {
            StringBuilder sb = new StringBuilder();

            if(d < 10) {
                sb.append(0 + "" + d);
            }else {
                sb.append(d + "");
            }

            if(m < 10) {
                sb.append(0 + "" + m);
            }else {
                sb.append(m + "" );
            }

            sb.append(toMirroredYear(d, m));

            result.add(sb.toString());

            d++;
            if(isDate(d, m)) {
                udledDanskePalindromdatoer(d, m, result);
            }else {
                udledDanskePalindromdatoer(1, m+1, result);
            }
        }

    }

    private boolean isDate(int d, int m) {

        if(d > 31 || m > 12) return false;

        boolean skudaar = false;

        int aar = toMirroredYear(d, m);

        if(aar % 4 == 0) skudaar = true;
        if(aar % 100 == 0) skudaar = false;
        if(aar % 400 == 0) skudaar = true;

        if(skudaar) {
            if(m == 2 && d > 29) return false;
        } else {
            if(m == 2 && d > 28) return false;
        }

        if(d == 31 && m%2 != 0) return false;

        return true;
    }

    private int toMirroredYear(int d, int m) {
        StringBuilder sb = new StringBuilder();

        if(m < 10) {
            sb.append("" + m + 0);
        }else {
            sb.append("" + Integer.toString(m).substring(1) + Integer.toString(m).substring(0, 1));
        }

        if(d < 10) {
            sb.append( "" + d + 0);
        }else {
            sb.append(Integer.toString(d).substring(1) + Integer.toString(d).substring(0, 1) + "");
        }

        return Integer.parseInt(sb.toString());
    }


}
