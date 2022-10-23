package arrays;

import java.util.*;

// question - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class KidsWithGreatNoOfCandiesleetcode {
    public static void main(String[] args) {
        
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        for(int i=0; i<n; i++){
            if(candies[i] > max)
                max = candies[i];
        }
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for(int i=0; i<n; i++){
            if((candies[i]+extraCandies)>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
