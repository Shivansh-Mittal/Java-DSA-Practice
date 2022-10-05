package arrays;
import java.util.*;
//question  - https://leetcode.com/problems/concatenation-of-array/

public class ConcatArrayleetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<2*n;i++) {
            ans[i] = nums[i%n];
        }
        return ans;
    }
}
