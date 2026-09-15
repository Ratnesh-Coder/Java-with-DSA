import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int rem;
        int rev = 0;
        while (x > 0) {
            rem = x % 10;
            x /= 10;
            rev = rev * 10 + rem;
        }
        return rev == temp;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print(isPalindrome(x));
    }
}