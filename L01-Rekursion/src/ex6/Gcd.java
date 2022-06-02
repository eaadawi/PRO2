package ex6;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(30, 45));
    }

    public static int gcd(int a, int b) {
        int result;
        if(b<=a && a%b == 0) {
            return b;
        }else if(a<b) {
            result = gcd(b, a);
        }else {
            result = gcd(b, a%b);
        }
        return result;
    }
}
