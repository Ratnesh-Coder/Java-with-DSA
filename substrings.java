import java.util.*;
public class substrings {
    public static String substring (String word, int startIndex, int endIndex) {
        String substr = "";
        for (int i=startIndex; i<endIndex; i++) {
            substr += word.charAt(i);
        }
        return substr;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a word: ");
            String word = sc.next();
            System.out.print("Enter starting index: ");
            int startIndex = sc.nextInt();
            System.out.print("Enter ending index: ");
            int endIndex = sc.nextInt();
            System.out.println("Substring is: " + substring(word, startIndex, endIndex));
            // System.out.println("Substring is: " + word.substring(0, 3)); //Inbuild function
        }
        finally {
            sc.close();
        }
    }
    
}
