package HowManyNumbersAreSmallerThantheCurrentNumber;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 *
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 *
 * */
class Solution {
    public static void main(String[] args) {
        var testArr = new int[]{8,1,2,2,3};
        System.out.println(Arrays.stream(smallerNumbersThanCurrent(testArr)).mapToObj(Integer::toString).collect(Collectors.joining()));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        var resultedArr = new int[nums.length];

        for (int i = 0; i < resultedArr.length; i++) {
            var lessCounter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) lessCounter++;
            }
             resultedArr[i] =  lessCounter;
        }

        return resultedArr;
    }
}
