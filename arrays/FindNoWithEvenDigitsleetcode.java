package arrays;

// question - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNoWithEvenDigitsleetcode {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        
        for(int num : nums) {
            if(even(num))
                count++;
        }
            
        return count;
    }
    
    static boolean even(int num) {
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
    }
    
    static int digits(int num) {
        if(num<0) {
            num = num * -1;
        }
        
        return (int)(Math.log10(num)) + 1;
    }
}
