import java.util.*;
public class r_stop {
    public static void stop (Scanner sc) {
        char ch = ' ';
        while (ch != 'R') {
            System.out.print("Enter a character: ");
            ch = sc.next().charAt(0);
            System.out.println("You entered: " + ch);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
            stop(sc);
        } 
        finally {
            sc.close();
        }
    }
}