public class palindrome {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int rev = 0;
        while (x > 0) {
            rem = x % 10;
            x /= 10;
            rev = rev * 10 + rem;
        }
        if ( rev == temp) {
            return true;
        }
        return false;
    }
    public static void main (String args[]) {
        int x = 121;
        System.out.print(isPalindrome(x));
    }
}