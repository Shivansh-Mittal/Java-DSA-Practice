package arrays;
// leetcode - https://leetcode.com/problems/find-the-highest-altitude/
public class FindHighestAltitudeleetcode {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int ans = 0;
        int altitude = 0;
        for(int element: gain){
            altitude += element;
            if(altitude > ans)
                ans = altitude;
        }
        return ans;
    }
}
