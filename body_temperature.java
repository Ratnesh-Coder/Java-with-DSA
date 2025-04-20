import java.util.*;
public class body_temperature {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your body temperature: ");
        double temp = sc.nextDouble();
        sc.close();
        String result = (temp>100)?"You have a fever":"You don't have a fever";
        System.out.println(result);
    }
}