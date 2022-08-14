package MinimumSumofFourDigitNumberAfterSplittingDigits;

import java.util.Arrays;

/**
 *
 * Input: num = 2932
 * Output: 52
 * Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
 * The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
 *
 * */
class Solution {
    public int minimumSum(int num) {
        char[] ch = (num+"").toCharArray();
        Arrays.sort(ch);
        return Integer.parseInt(""+ch[0] +ch[2]) + Integer.parseInt(""+ch[1] +ch[3]);
    }
}
