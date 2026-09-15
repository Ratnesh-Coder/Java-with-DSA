import java.util.*;
public class BinaryOddEven {
    public static void OddOrEven (int result) {
            if ((result & 1) == 0) {
                System.out.print("Even.");
            } 
            else {
                System.out.print("Odd.");
            }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int result = sc.nextInt();
        OddOrEven(result);
    }
}