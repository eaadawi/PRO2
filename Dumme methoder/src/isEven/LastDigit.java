package isEven;

public class LastDigit {
    public static boolean isEven(int num) {
        String strNum = ""+num;
        String lastDigit = strNum.substring(strNum.length()-1);
        switch (lastDigit) {
            case "0": return(true);
            case "1": return(false);
            case "2": return(true);
            case "3": return(false);
            case "4": return(true);
            case "5": return(false);
            case "6": return(true);
            case "7": return(false);
            case "8": return(true);
            case "9": return(false);
        }
        return false;
    }
}
