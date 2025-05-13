import java.util.*;
public class staircase_search {
    public static boolean search (int[][]matrix, int target) {

        // Brute Force. Time complexity O(n^2)
        // for (int i=0; i<matrix.length; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //        if (target == matrix[i][j]) {
        //         return 1;
        //        }
        //     }
        // }
        // return -1;

        // Optimized. Time complexity O(n+m)
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.print("Target is at: " + "(" + row + ", " + col + ")");
                return true;
            }
            else if (target < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Target doesn't exist.");
        return false;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter no. of rows: ");
            int r = sc.nextInt();
            System.out.print("Enter no. of columns: ");
            int c = sc.nextInt();
            System.out.print("Enter elements: ");
            int[][] matrix = new int[r][c];
            for (int i=0; i<r; i++) {
                for (int j=0; j<c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter element you want to search: ");
            int target = sc.nextInt();
            System.out.println(search(matrix, target));
        }
        finally {
            sc.close();
        }
    } 
}