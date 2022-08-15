// question link : https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

class GfG
{
    public static void print(int arr[], int n)
    {
        // your code here
        for(int i=0; i<n; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}
