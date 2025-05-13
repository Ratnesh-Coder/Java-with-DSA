import java.util.*;
public class uppercase {
    public static String toUpperCase (String str) {
        StringBuilder sb = new StringBuilder ("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Write a line: ");
            String str = sc.nextLine();
        }
        finally {
            sc.close();
        }
    }
}