package arrays;
// question - https://leetcode.com/problems/richest-customer-wealth/

public class RichestWealth2DArrayleetcode {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts)); 
    }

    static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int i=0; i<accounts.length; i++) {
            int wealth = 0;
            for(int j=0; j<(accounts[i]).length; j++) {
                wealth = wealth + accounts[i][j];
            }
            if (wealth > richest) {
                richest = wealth;
            }
        }
        return richest;
    }
}
