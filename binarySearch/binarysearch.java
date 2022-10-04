package binarySearch;
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,99};
        int target = 9;
        System.out.println(binarysearch(arr, target));
    }

    static int binarysearch(int[] nums, int target){
        int start = 0;
        int end = nums.length;

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
