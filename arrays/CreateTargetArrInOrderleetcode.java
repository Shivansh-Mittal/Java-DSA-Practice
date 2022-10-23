package arrays;

// question - https://leetcode.com/problems/create-target-array-in-the-given-order/

public class CreateTargetArrInOrderleetcode {
    public static void main(String[] args) {
        
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(index[i] < i){
                int j = i;
                while(j != index[i]){
                    result[j] = result[j-1];
                    j--;
                }
                result[index[i]] = nums[i];
            }
            else{
                result[index[i]] = nums[i];
            }
        }
        return result;
    }
}
