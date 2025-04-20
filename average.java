import java.util.*;
public class average {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.print("Enter c number: ");
        int c = sc.nextInt();
        sc.close();
        System.out.print("Average: ");
        double average = (a+b+c) / 3;
        System.out.println("Average: " + average);
    }
}