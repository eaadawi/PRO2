package ex5;

public class Towers {
    public static void main(String[] args) {
        move(6, 1, 3); // 4 diske fra 1 (=A) til 3 (=C)
        System.out.println(antalMoves(6));
    }


    public static int antalMoves(int n) {
        if(n == 1) {
            return 1;
        }else {
            return antalMoves(n-1) * 2 + 1;
        }
    }

    // move n disks from ‘from’ to ‘to’
    private static int counter = 0;
    public static void move(int n, int from, int to) {
        if (n == 1) {
            counter+= 2;
            System.out.println((counter-1) + " Move: " + from + " -> " + to);
        } else {
            int other = 6 - from - to;
            move(n - 1, from, other);
            System.out.println(counter + " Move: " + from + " -> " + to);
            move(n - 1, other, to);
        }
    }
}
