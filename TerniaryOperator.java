import java.util.*;
public class TerniaryOperator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your marks: ");
            float marks = sc.nextInt();
            String result = (marks >= 33)?"Pass":"Fail";
            System.out.println("You're " + result);

    }
}