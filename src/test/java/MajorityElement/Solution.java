package MajorityElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(Arguments.of(new int[]{3,2,3},3));
    }

    public int majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>nums.length/2) {
                return entry.getKey();
            }
        }
        return 1;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(int[] arr, int expected) {

        var res = majorityElement(arr);

    }

}
