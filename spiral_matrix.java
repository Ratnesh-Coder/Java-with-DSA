import java.util.*;
public class spiral_matrix {
    public static void spiral (int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            for (int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            for (int j=endCol-1; j>=startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            for (int i=endRow-1; i>=startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startRow] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
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
            spiral(matrix);
        }
        finally {
            sc.close();
        }
    }
}