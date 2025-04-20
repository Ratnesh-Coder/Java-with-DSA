import java.util.*;
public class array_repeat {
    public static boolean repeat (int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            int arr[] = new int[5];
            System.out.print("Enter elements: ");
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if (repeat (arr)) {
                System.out.println("There are repeating elements.");
            }
            else {
                System.out.println("All elements are unique.");
            }
        }
        finally {
            sc.close();
        }
    }
}
