import java.util.*;
public class largest_string {
    public static String largestString (String[] fruits) {
        String largest = fruits[0];
        for (int i=0; i<fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    } 
    public static void main (String argds[]) {
        Scanner sc = new Scanner (System.in);
        try {
            String[] fruits = {"apple", "banana", "mango"};
            System.out.println(largestString(fruits));
        }
        finally {
            sc.close();
        }
    }
}