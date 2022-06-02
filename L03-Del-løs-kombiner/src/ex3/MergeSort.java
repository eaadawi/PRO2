package ex3;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(8, 56, 45, 34, 15, 12, 34, 44));
        mergesort(list);
        System.out.println(list);
    }

    public static void mergesort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i1 = low;
        int i2 = middle+1;
        while (i1 <= middle && i2 <= high) {
            if (list.get(i1) <= list.get(i2)) {
                temp.add(list.get(i1));
                i1++;
            }
            else {
                temp.add(list.get(i2));
                i2++;
            }
        }
        while (i1 <= middle) {
            temp.add(list.get(i1));
            i1++;
        }
        while (i2 <= high) {
            temp.add(list.get(i2));
            i2++;
        }
        for(int i = 0; i < temp.size(); i++) {
            list.set(i+low, temp.get(i));
        }
    }

}
