import java.util.*;
public class palindrome {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int temp = num;
            int rem;
            int rev = 0;
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            if (temp == rev) {
                System.out.println(temp + " is palindrome.");
            }
            else {
                System.out.println(temp + " is not palindrome.");
            }
        }
        finally {
            sc.close();
        }
    }
}