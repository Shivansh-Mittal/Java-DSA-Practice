package arrays;
// question link : https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

public class PrintAlternateElementsgfg{
    public static void main(String[] args) {
        int[] arr = {6,7,4,6,89};
        int n = arr.length;
        print(arr, n);
        System.out.println("");
    }

    static void print(int arr[], int n)
    {
        // your code here
        for(int i=0; i<n; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}
