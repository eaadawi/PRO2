package ex0;

import java.util.ArrayList;
import java.util.List;

public class Even {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 6, 3, 4, 7));
        System.out.println(evenNumberCounter(list));
    }

    public static int evenNumberCounter(ArrayList<Integer> list) {
        return evenNumberCounter(list,0, 0);
    }

    private static int evenNumberCounter(ArrayList<Integer> list, int counter, int index) {
        if(index >= list.size()) {
            return counter;
        }else {
            if(list.get(index) % 2 == 0) {
                return evenNumberCounter(list, counter +1, index +1);
            }else {
                return evenNumberCounter(list, counter, index+1);
            }
        }

    }

}
