package searching;
// leetcode - https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNumber {
    public static void main(String[] args) {
        
    }

    /** 
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
    */

    static int guessNumber(int n) {
        long start = 1;
        long end = n;

        while(start <= end){
            long mid = start + (end-start)/2;
            int res = guess((int)mid);

            if(res == 0)
                return (int)mid;
            else if(res == -1)
                end = mid - 1;
            else
                start = mid + 1; 
        }

        return -1;
    }
}
