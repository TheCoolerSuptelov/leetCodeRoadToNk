package RunningSumof1dArray;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Solution {
    public static void main(String[] args) {
        var testArray = new int[]{1,2,3,4};
        System.out.println(Arrays.stream(runningSum(testArray)).mapToObj(Integer::toString).collect(Collectors.joining(",")));
    }
    public static int[] runningSum(int[] nums) {
        var resultedArray = new int[nums.length];
        resultedArray[0] = nums[0];
        int cumulativeTotal = resultedArray[0];
        for (int i = 1; i < nums.length; i++) {
            cumulativeTotal = cumulativeTotal + nums[i];
            resultedArray[i] = cumulativeTotal;
        }
        return resultedArray;
    }
}
