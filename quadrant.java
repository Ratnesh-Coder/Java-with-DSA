import java.util.*;
public class quadrant {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter point in x-axis: ");
            double x = sc.nextDouble();
            System.out.print("Enter point in y-axis: ");
            double y = sc.nextDouble();
            // if (x == 0 || y == 0) {
            //     System.out.println("Invalid");
            // }
            // else if (x > 0 && y > 0) {
            //     System.out.println("1st quadrant");
            // }
            // else if (x < 0 && y > 0) {
            //     System.out.println("2nd quadrant");
            // }
            // else if (x < 0 && y < 0) {
            //     System.out.println("3rd quadrant");
            // }
            // else {
            //     System.out.println("4th quadrant");
            // }
            if (x > 0) {
                if (y > 0) {
                    System.out.println("1st quadrant");
                }
                else {
                    System.out.println("4th quadrant");
                }
            }
            else {
                if (y > 0) {
                    System.out.println("2nd quadrant");
                }
                else {
                    System.out.println("3rd quadrant");
                }
            }
        }
        finally {
            sc.close();
        }
    }
}