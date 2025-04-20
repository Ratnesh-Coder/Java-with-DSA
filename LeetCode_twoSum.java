import java.util.*;
public class LeetCode_twoSum {
    public static int[] twoSum (int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target)
                return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            int arr[] = {8, 7, 2, 6, 3};
            int target = 78;
            int indices[] = twoSum(arr, target);
            System.out.println("The indices are: {" + indices[0] + ", " + indices[1] + "}");

        }
        finally {
            sc.close();
        }
    }
}