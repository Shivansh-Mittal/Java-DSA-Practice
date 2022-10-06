package binarysearch;
// leetcode - https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }

    static boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        
        long start = 0;
        long end = num/2;

        while(start <= end){
            long mid = start + (end-start)/2;

            if(mid*mid == num)
                return true;
            else if(mid*mid < num)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
