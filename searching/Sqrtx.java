package searching;
// leetcode - https://leetcode.com/problems/sqrtx/
public class Sqrtx {
    public static void main(String[] args) {
        int num = 9778;
        System.out.println(mySqrt(num));
    }

    static int mySqrt(int x) {
        long start = 0;
        long end = x - 1;

        if(x==0)
            return 0;
        if(x==1 || x==2 || x==3)
            return 1;

        while(start <= end){
            long mid = start + (end-start)/2;

            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid > x)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return (int)end;
    }

}
