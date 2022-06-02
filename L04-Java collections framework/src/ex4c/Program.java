package ex4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Map<Integer, Integer> words = new LinkedHashMap<>();
        int total = 0;
        int different = 0;

        File in = new File("C:\\Users\\DaWig\\IdeaProjects\\PRO2-Project\\L04-Java collections framework\\src\\ex4a\\Gjoengehoevdingen.txt"); // use "/" or "\\", not "\"
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase(Locale.ROOT);

                while (word.length() > 0 && !Character.isLetter(word.charAt(word.length()-1))) {
                    word = word.substring(0, word.length()-1);
                }
                if(word.length() > 0 && !Character.isLetter(word.charAt(0))) {
                    word = word.substring(1);
                }
                total++;
                if(!words.containsKey(word.hashCode())) {
                    different++;
                    words.put(word.hashCode(), 1);
                }else {
                    int old = words.get(word.hashCode());
                    words.replace(word.hashCode(), old+1);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }

        for(int w : words.keySet()) {
            if (words.get(w) > 1)
                System.out.print(w + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println(total);
        System.out.println();
        System.out.println(different);
    }
}
