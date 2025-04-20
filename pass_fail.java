import java.util.*;
public class pass_fail {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();
        sc.close();
        String result = (marks>=33)?"Pass":"Fail";
        System.out.println(result);
    }
}