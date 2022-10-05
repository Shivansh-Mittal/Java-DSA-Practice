package arrays;
import java.util.*;
// question - https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum1DArrayleetcode {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
