import java.util.*;
public class Substring {
    public static String substring (String word, int si, int ei) {
        String substr = "";
        for (int i=si; i<ei; i++) {
            substr += word.charAt(i);
        }
        return substr;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a word: ");
            String word = sc.next();
            System.out.println("Substring is: " + word.substring(0, 3)); // Inbuild function
            // System.out.println("Substring is: " + substring(word, 0, 3));
        }
        finally {
            sc.close();
        }
    }
    
}
