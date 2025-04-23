import java.util.*;
public class Matrices {
    public static boolean search (int[][] matrix, int target) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at index " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found!");
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

            // System.out.println("Matrix: ");
            // for (int i=0; i<r; i++) {
                //     for (int j=0; j<c; j++) {
                    //         System.out.print(matrix[i][j] + " ");
                    //     }
                    //     System.out.println();
                    // }

                    System.out.print("Enter elements you want to search: ");
                    int target = sc.nextInt();

                    boolean result = search(matrix, target);
                    System.out.print(result);
        }
        finally {
            sc.close();
        }
    }
}