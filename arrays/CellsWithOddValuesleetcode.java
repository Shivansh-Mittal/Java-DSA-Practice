package arrays;

// question - https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class CellsWithOddValuesleetcode {
    public static void main(String[] args) {
        int m = 2, n = 2;
        int[][] indices =  {{1,1},
                            {0,0}};
        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int i=0; i<indices.length; i++){
            rowInc(matrix, indices[i][0]);
            colInc(matrix, indices[i][1]);
        }
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]%2==1)
                    count++;
            }
        }
        return count;
    }

    static void rowInc(int[][] mat, int rowNo){
        for(int i=0; i<mat[rowNo].length; i++){
            mat[rowNo][i]++;
        }
    }

    static void colInc(int[][] mat, int colNo){
        for(int i=0; i<mat.length; i++){
            mat[i][colNo]++;
        }
    }
}
