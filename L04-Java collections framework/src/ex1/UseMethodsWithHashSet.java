package ex1;

import java.util.HashSet;
import java.util.Set;

public class UseMethodsWithHashSet {
    public static void main(String[] args) {
        //A
        Set<Integer> numbers = new HashSet<>();

        //B
        numbers.add(34);
        numbers.add(12);
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        numbers.add(34);
        numbers.add(98);

        //C
        System.out.println(numbers);

        //D
        numbers.add(23);

        //E
        System.out.println(numbers);

        //F
        numbers.remove(67);

        //G
        System.out.println(numbers);

        //H
        System.out.println(numbers.contains(23));

        //I
        System.out.println(numbers.size());
    }
}
