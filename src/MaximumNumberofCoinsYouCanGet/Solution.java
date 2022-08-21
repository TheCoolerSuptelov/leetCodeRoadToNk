package MaximumNumberofCoinsYouCanGet;

import java.util.Arrays;

/***
 * Input: piles = [2,4,1,2,7,8]
 * Output: 9
 * Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
 * Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
 * The maximum number of coins which you can have are: 7 + 2 = 9.
 * On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.
 * */
class Solution {

    public static void main(String[] args) {
        System.out.println(maxCoins(new int[]{9,8,7,6,5,1,2,3,4}));
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        var sum = 0;
        for (int i = 0; i < piles.length/3; i++) {
            piles[0+(i*3)] = 0;
            piles[piles.length-(1 + (i*3))]= 0;
            sum += piles[piles.length-(2 + (i*3))];
            piles[piles.length-(2 + (i*3))] = 0;
        }
        return sum;
    }
}