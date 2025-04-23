import java.util.*;
public class diagonal_sum {
    public static int sum (int[][] matrix) {
        int sum = 0;

        // Brute Force. Time complexity O(n^2)
        // for (int i=0; i<matrix.length; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i+j==matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // Optimized. Time complexiyt O(n)
        for (int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length-1-i)
            sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter no.of rows: ");
            int r = sc.nextInt();
            System.out.print("Enter no.of columns: ");
            int c = sc.nextInt();
            if (r != c) {
                System.out.println("Rows and columns should be same.");
            }

            System.out.print("Enter elements: ");
            int[][] matrix = new int[r][c];
            for (int i=0; i<r; i++) {
                for (int j=0; j<c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Sum of all the diagonals of the matrix: " + sum(matrix));
        }
        finally {
            sc.close();
        }
    }
}