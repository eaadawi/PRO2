package ex2;

import java.util.ArrayList;
import java.util.List;

public class CountZeros {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(List.of(1, 0, 3, 0, 5 ,6 ,0, 0, 9, 10));
        System.out.println(countZeros(intList));
    }
    public static int countZeros(ArrayList<Integer> list) {
        return countZeros(list, 0, list.size()-1, 0);
    }

    private static int countZeros(ArrayList<Integer> list, int l, int h, int counter) {
        if (l == h) {
            return list.get(l) == 0 ? 1 : 0;
        } else {
            int m = (l + h) / 2;
            int cnt1 = countZeros(list, l, m, counter);
            int cnt2 = countZeros(list, m + 1, h, counter);
            return cnt1 + cnt2;
        }
    }
}
