package arrays;

import java.util.*;
import java.util.ArrayList;

public class AddToArrayFormleetcode {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        res = addToArrayForm(num, k);
        // String s = res.;
        System.out.println(res.toString());
    }

    static List<Integer> addToArrayForm(int[] num, int k){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // String a = "";
        int b = 0;
        for(int i: num){
            b = b*10 + i;
        }
        System.out.println(b);
        // a = Arrays.toString(num);
        // b = Integer.valueOf(a);
        b = b + k;
        while(b != 0){
            int digit = b%10;
            arr.add(digit);
            b /= 10;
        }
        reverse(arr);
        return arr;
    }

    static void reverse(List<Integer> arr){
        int s = 0;
        int e = arr.size() - 1;

        while(s<e){
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
    }
}
