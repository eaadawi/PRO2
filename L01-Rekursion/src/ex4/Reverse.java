package ex4;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("RANSLIRPA"));
    }

    public static String reverse(String s) {
        String result;
        if(s.length() == 1) {
            return s;
        }else{
            result = reverse(s.substring(1)) + s.charAt(0);
        }
        return result;
    }
}
