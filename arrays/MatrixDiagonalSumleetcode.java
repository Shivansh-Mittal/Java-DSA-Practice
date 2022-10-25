package arrays;

// question - https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagonalSumleetcode {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        if(n == 1)
            return mat[0][0];
        for(int i=0; i<n/2; i++){
            sum += mat[i][i];
            sum += mat[(n-1) - i][i];
            sum += mat[i][(n-1) - i];
            sum += mat[(n-1) - i][(n-1) - i];
        }
        if(n%2==1){
            int mid = mat[n/2][n/2];
            sum += mid;
        }
        return sum;
    }
}
