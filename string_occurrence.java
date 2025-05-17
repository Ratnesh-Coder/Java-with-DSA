import java.util.*;
public class string_occurrence {
    public static int occurrence (String word) {
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a word: ");
            String word = sc.next();
            System.out.print(occurrence(word));
        }
        finally {
            sc.close();
        }
    }
}