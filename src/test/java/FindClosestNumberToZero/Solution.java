package FindClosestNumberToZero;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(Arguments.of(new int[]{2, -1, 1}, 1),
                Arguments.of(new int[]{-4, -2, 1, 4, 8}, 1)
        );
    }

    public int findClosestNumber(int[] nums) {
        int curMax = Integer.MAX_VALUE;
        int curMaxIndex = 0;
        int curValue;
        for (int i = 0; i <= nums.length-1; i++) {
            curValue = nums[i]<0 ? -nums[i]: nums[i];
            if ( curValue < curMax ){
                curMax = curValue;
                curMaxIndex = i;
            } else if (curValue == curMax){
                if (nums[i]>nums[curMaxIndex]){
                    curMaxIndex = i;
                }
            }

        }
        if (curMax == Integer.MAX_VALUE) {
            return 0;
        }

        return nums[curMaxIndex];
    }

    public int findClosestNumber1(int[] nums) {
        int curMax = Integer.MAX_VALUE;
        int curMaxIndex = 0;
        int curValue;
        for (int i = 0; i < nums.length-1; i++) {
            curValue = nums[i]<0 ? -nums[i]: nums[i];
            if ( curValue < curMax ){
                curMax = curValue;
                curMaxIndex = i;
            }

        }

        return nums[curMaxIndex];
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void findClosestNumberToZeroTest(int[] nums, int res) {

        assertEquals(res,findClosestNumber(nums));

    }

}
