package ex4;


public class Anagrams {
    public static void main(String[] args) {
        printAnagrams("cat");
    }

    public static void printAnagrams(String word) {
        printAnagrams("",word);
    }

    private static void printAnagrams(String prefix, String word) {

        if(word.length() <= 1) {
            System.out.println(prefix + word);
        }else {
            for (int i = 0; i < word.length(); i++) {
                String p = prefix + word.charAt(i);
                String w = word.substring(0,i) + word.substring(i+1);
                printAnagrams(p, w);
            }
        }
    }
}
