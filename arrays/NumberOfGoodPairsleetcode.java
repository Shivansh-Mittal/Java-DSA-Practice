package arrays;

// question - https://leetcode.com/problems/number-of-good-pairs/

public class NumberOfGoodPairsleetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int size = nums.length;
        if(size == 1)
            return 0;
        int count = 0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(nums[i] == nums[j] && j>i)
                    count++;
            }
        }
        return count;
    }
}
