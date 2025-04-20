import java.util.*;
public class function_even_odd {
    public static boolean isEven (int num) {
        return num%2==0;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.println(num + " is even");
            }
            else {
                System.out.println(num + " is odd.");
            }
        }
        finally {
            sc.close();
        }
    }
}