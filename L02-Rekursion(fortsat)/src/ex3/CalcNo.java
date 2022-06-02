package ex3;

import java.util.ArrayList;

public class CalcNo {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            System.out.println(calcNo(i));
        }
        System.out.print("\n i \n \n");

        for(int i = 0; i < 7; i++) {
            System.out.println(calcNoI(i));
        }

    }

    public static int calcNo(int n) {
        if(n == 0) {
            return 2;
        }else if(n == 1) {
            return 1;
        }else if(n == 2) {
            return 5;
        }else if(n % 2 == 0) {
            return (2 * calcNo(n-3)) - calcNo(n-1);
        }else {
            return calcNo(n-1) + calcNo(n-2) + (3 * calcNo(n-3));
        }
    }

    public static int calcNoI(int n) {
        ArrayList<Integer> results = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            if(i == 0) {
                results.add(2);
            }else if(i == 1) {
                results.add(1);
            }else if(i == 2) {
                results.add(5);
            }else if(i % 2 == 0) {
                results.add((2*results.get(i-3)) - results.get(i-1));
            }else {
                results.add(results.get(i-1) + results.get(i-2) + (3*results.get(i-3)));
            }
        }
        return results.get(results.size()-1);
    }
}
