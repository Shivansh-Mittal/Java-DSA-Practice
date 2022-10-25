package arrays;

// question - https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinCostMoveChipsSamePosleetcode {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }

    static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int element: position){
            if(element%2 == 0)
                even++;
            else
                odd++;
        }
        return Math.min(even,odd);
    }
}
