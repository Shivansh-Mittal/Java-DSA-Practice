package dailyProblems;

import java.util.Arrays;
import java.util.*;

/*    This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass? */

public class Day01{
    public static void main(String[] args) {
        int[] arr = {10,15,3,7};
        int k = 17;
        System.out.println(check2(arr, k));
    }

    static boolean check(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == k)
                    return true;
            }
        }
        return false;
    }

    static boolean check1(int[] arr, int k){
        Arrays.sort(arr);
        return false;
    }

    static boolean check2(int[] arr, int k){
        Collection values = new ArrayList();
        for(int i=0; i<arr.length; i++){
            if(values.contains(k - arr[i]))
                return true;
            values.add(arr[i]);
        }
        return false;
    }
}