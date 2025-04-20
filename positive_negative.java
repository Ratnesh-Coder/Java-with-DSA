import java.util.*;
public class positive_negative {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        sc.close();
        String val = (integer < 0)?"negative":"positive";
        System.out.println("The number is: " + val); 
    }
}