package searching;
// leetcode - https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(firstBadVersion(n));
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); 
    */

    static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        
        while(start < end){
            int mid = start + (end - start)/2;

            if(!isBadVersion(mid)){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
