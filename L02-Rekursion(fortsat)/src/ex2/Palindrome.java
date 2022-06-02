package ex2;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("kurt"));

    }

    public static boolean isPalindrome(String s)
    {
        int length = s.length();

        if (length <= 1) { return true; }
        else {
            char first = Character.toLowerCase(s.charAt(0));
            char last = Character.toLowerCase(s.charAt(length - 1));

            if (first == last) {
                String shorter = s.substring(1, length - 1);
                return isPalindrome(shorter);
            }
            else {
                return false;
            }
        }
    }
}
