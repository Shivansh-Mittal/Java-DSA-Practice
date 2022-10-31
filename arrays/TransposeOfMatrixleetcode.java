package arrays;
import java.util.*;

// leetcode - https://leetcode.com/problems/transpose-matrix/

public class TransposeOfMatrixleetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("Enter the element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
        sc.close();
    }

    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}