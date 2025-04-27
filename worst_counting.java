import java.util.*;
public class worst_counting {
    public static int count (int[] arr, int size) {
        for (int i=0; i<size; i++) {
            int count = 0;
            for (int j=0; j<size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            System.out.print("Enter elements: ");
            int[] arr = new int[size];
            for (int i=0; i<size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(count(arr, size));
        }
        finally {
            sc.close();
        }
    }
}