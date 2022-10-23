package arrays;

// question - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class NumbersSmallerthanCurrentleetcode {
    public static void main(String[] args) {
        
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(nums[j]<nums[i] && j!=i)
                    result[i]++;
            }
        }
        return result;
    }
}
