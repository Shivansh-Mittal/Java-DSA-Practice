package dailyProblems;

/*
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division? 
*/

public class Day02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = new int[arr.length];

        res[0] = 1;
        for(int i=1; i<arr.length; i++){
            res[i] = res[i-1]*arr[i-1];
        }

        int x = 1;
        for(int i=arr.length-1; i>0; i--){
            x = x*arr[i];
            res[i-1] = x*res[i-1];
        }

        for(int i:res){
            System.out.println(i);
        }
    }
    
}
