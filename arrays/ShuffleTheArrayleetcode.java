package arrays;

import java.util.Arrays;

// question - https://leetcode.com/problems/shuffle-the-array/

public class ShuffleTheArrayleetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int first = 0;
        int sec = n;
        int[] ans = new int[2*n];
        for(int i=0; i<2*n; i+=2){
            ans[i] = nums[first];
            first++;
        }
        for(int j=1; j<=(2*n)-1; j+=2){
            ans[j] = nums[sec];
            sec++;
        }
        return ans;
    }
}
