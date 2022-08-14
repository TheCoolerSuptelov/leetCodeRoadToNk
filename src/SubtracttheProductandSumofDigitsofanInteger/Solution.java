package SubtracttheProductandSumofDigitsofanInteger;

import java.util.ArrayList;

/**
 *
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 *
 * */
class Solution {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        //int[] arrTest = new int[(int) Math.log10(n)];
        var arrTest = new ArrayList<Integer>();
        int someData = n;
        int jj = 1;
        for (int i = n; i >0 ; ) {
            arrTest.add(i % 10);
            i = i / 10;
            jj++;
        }
        var sum = 0;
        for (int i = 0; i < arrTest.size(); i++) {
            sum = sum + arrTest.get(i);
        }

        var multiply = 1;
        for (int i = 0; i < arrTest.size(); i++) {
            multiply = multiply * arrTest.get(i);
        }

        return multiply - sum;
    }
}