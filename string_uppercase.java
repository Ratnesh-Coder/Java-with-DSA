import java.util.*;
public class string_uppercase {
    public static String toUpperCase (String str) {
        StringBuilder sb = new StringBuilder ("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Write a line: ");
            String str = sc.nextLine();
            System.out.print(toUpperCase(str));
        }
        finally {
            sc.close();
        }
    }
}