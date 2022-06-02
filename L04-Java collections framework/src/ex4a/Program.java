package ex4a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        int total = 0;
        int different = 0;

        File in = new File("C:\\Users\\DaWig\\IdeaProjects\\PRO2-Project\\L04-Java collections framework\\src\\ex4a\\Gjoengehoevdingen.txt"); // use "/" or "\\", not "\"
        try (Scanner scanner = new Scanner(in)) {
            scanner.useDelimiter("[\\W && [^æøåÆØÅ]]+");
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase(Locale.ROOT);

//                while (word.length() > 0 && !Character.isLetter(word.charAt(word.length()-1))) {
//                    word = word.substring(0, word.length()-1);
//                }
//                if(word.length() > 0 && !Character.isLetter(word.charAt(0))) {
//                    word = word.substring(1);
//                }
                total++;
                if(!words.contains(word)) {
                    different++;
                    words.add(word);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }

        System.out.println(words);
        System.out.println();
        System.out.println(total);
        System.out.println();
        System.out.println(different);
    }
}
