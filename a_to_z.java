
import java.util.*;
public class a_to_z {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
            char ch = 'a';
            while (ch<='z') {
                System.out.print(ch + " ");
                ch++;
            }
        }
        finally {
            sc.close();
        }
    }
}