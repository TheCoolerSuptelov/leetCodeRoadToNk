package ConcatenationofArray;

import java.util.Arrays;

public class Solution {
    public static void main(final String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }
    public static int[] getConcatenation(final int[] nums) {
        final var newArr = new int[nums.length * 2];
        int i = 0;
        for (; i < nums.length; i++) {
            newArr[i] = nums[i];
            if (i == 0) {
                newArr[nums.length] = nums[i];
                continue;
            }

            newArr[i*2] = nums[i];
        }
        for (int j = 0; i < nums.length * 2; i++, j++) {
            newArr[i] = nums[j];
        }
        return newArr;
    }
}
