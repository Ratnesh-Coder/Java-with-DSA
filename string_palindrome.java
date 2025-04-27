import java.util.*;
public class string_palindrome {
    public static boolean palindrome (String word) {
        for (int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String arg[]) {
        Scanner sc = new Scanner (System.in);
        try {
            String word = "Monkey";
            System.out.print(palindrome(word));
        }
        finally {
            sc.close();
        }
    }
}