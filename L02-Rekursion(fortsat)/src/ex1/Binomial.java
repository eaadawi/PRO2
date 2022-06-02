package ex1;

public class Binomial {
    public static void main(String[] args) {

        System.out.println("   m  0     1     2     3     4     5     6     7");
        System.out.print("n  -----------------------------------------------");
        for(int n = 0; n <= 7; n++) {
            System.out.println();
            System.out.print(n+"  |  ");
            for(int m = 0; m <= n; m++) {
                System.out.printf("%-6d", binomial(n, m));
            }

        }



    }

    /**
     * pre: 0 <= m <= n
     */
    public static int binomial(int n, int m) {
        if(m == 0 || m == n ) {
            return 1;
        }else {
            return binomial(n-1, m) + binomial(n-1, m-1);
        }

    }
}
