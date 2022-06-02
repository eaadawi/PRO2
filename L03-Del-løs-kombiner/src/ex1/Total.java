package ex1;

import java.util.ArrayList;
import java.util.List;

public class Total {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5 ,6 ,7, 8, 9, 10));
        System.out.println(total(intList));
    }
    public static int total(ArrayList<Integer> list) {
        return total(list, 0, list.size()-1);
    }

    private static int total(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int tot1 = total(list, l, m);
            int tot2 = total(list, m + 1, h);
            return tot1 + tot2;
        }
    }
}
