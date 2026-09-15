import java.util.*;
public class DecimalToBinary {
    public static int con (int decimal) {
        int rem;
        int binary = 0;
        int power = 0; 
        while (decimal > 0) {
            rem = decimal % 2;
            binary = binary + rem * (int)Math.pow(10, power);
            power++;
            decimal = decimal / 2;
        }
        return binary;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("The binary conversion of decimal " + decimal + " is " + con (decimal));
        System.out.print("Binary: " + Integer.toBinaryString(decimal));
    }
}