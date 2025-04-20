import java.util.*;
public class stop {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.println("Press 'R to stop:");
            for (int i=0; sc.next().charAt(0) !='R'; i++) {
                System.out.println("Pass #: " + i);
            }
            System.out.println("You pressed 'R'.");
        }
        finally {
            sc.close();
        }
    }
}