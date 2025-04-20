import java.util.*;
public class binary_decimal {
    public static int con (int binary) {
        int dec = 0;
        int power = 0;
        while (binary > 0) {
        int rem = binary%10;
        dec = dec + rem * (int)Math.pow(2, power);
        binary = binary / 10;
        power++;
        }
        return dec;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();
        System.out.println("The decimal conversion of " + binary + " is " + con (binary));
    }
    finally {
        sc.close();
        }
    }
}