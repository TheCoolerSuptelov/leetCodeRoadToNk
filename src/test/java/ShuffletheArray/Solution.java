package ShuffletheArray;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output:       [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 * */
class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).mapToObj(Integer::toString).collect(Collectors.joining(", ")));
    }
    public static int[] shuffle(int[] nums, int n) {
        var resultedArr = new int[nums.length];

        for (int i = 0; i < n;i++) {
            resultedArr[i+i] = nums[i];
            resultedArr[i+i+1] = nums[i+n];
        }

        return resultedArr;
    }
}