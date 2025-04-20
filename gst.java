import java.util.*;
public class gst {
    public static void main (String args [] ) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of an eraser: ");
        float eraser = sc.nextFloat();
        sc.close();
        float total = (pencil + pen + eraser);
        System.out.println("Total: " + total);
        float gstRate = 0.18f;
        float gstAmount = total * gstRate;
        float newTotal = total + gstAmount;
        System.out.println("Total including GST: " + newTotal);
    }
}