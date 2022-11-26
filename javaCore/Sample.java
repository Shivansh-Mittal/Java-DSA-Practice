package javaCore;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        int[][] arr = new int[noOfRows][];
        int colsInRow = 0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter number of columns for the row");
            colsInRow = sc.nextInt();
            arr[i] = new int[colsInRow];
            System.out.println("Enter values for the row");
            for(int j=0; j<colsInRow; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] row : arr) {
            for (int element : row) {
                System.out.println(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));
        sc.close();
    }
}
