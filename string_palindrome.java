import java.util.*;
public class string_palindrome {
    public static boolean isPalindrome (String word) {
        for (int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a word: ");
            String word = sc.next();
            System.out.print(isPalindrome(word));
        }
        finally {
            sc.close();
        }
    }
}