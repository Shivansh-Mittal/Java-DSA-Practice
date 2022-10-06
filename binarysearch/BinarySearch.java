package binarysearch;

// leetcode - https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,99};
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid])
                end = mid - 1;
            else if(target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
