package ex7;

public class Domino {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            System.out.println(i + " : " + f(i));
        }
    }

    public static int f(int n) {
        if(n < 3) {
            return n;
        }else {
            return f(n-1) + f(n-2);
        }
    }
}
