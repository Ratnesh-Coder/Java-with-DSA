import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class inbuild_sort {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {

            // Input array

            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            System.out.print("Enter elements: ");
            Integer[] arr = new Integer[size]; // Collections doesn't work on primitive int[]
            for (int i=0; i<size; i++) {
                arr[i] = sc.nextInt();
            }

            //Ascending (increasing) sorting
            Arrays.sort(arr);
            System.out.print("Sorted Array: ");
            for (int i=0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }

            //Partial ascending (increasing) sorting
            Arrays.sort(arr, 0, 4); //staring index, ending index (ending index should be +1)
            System.out.print("Half sorted Array: ");
            for (int i=0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }

            //Descending (decreasing) sorting
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.print("Sorted Array: ");
            for (int i=0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }

            //Partial descending (decreasing) sorting
            Arrays.sort(arr, 0, 4, Collections.reverseOrder());
            System.out.print("Sorted Array: ");
            for (int i=0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}