package SummaryRanges_v2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, List.of("0->2", "4->5", "7")));
    }

    public List<String> summaryRanges(int[] nums) {
        var sb = new StringBuilder();
        var res = new ArrayList<String>();
        for (int i = 0; i <= nums.length-1 ; i++) {
            if (i==0){
                sb.append(nums[i]);
            }
            if (i == nums.length-1){
                if (sb.isEmpty()){
                    res.add(sb.append(nums[i]).toString());
                }
                break;
            }

            if (sb.isEmpty()){
                sb.append(nums[i]);
            }

            if (nums[i]+1 == nums[i+1]) {
                continue;
            } else if (nums[i]+1 != nums[i+1]) {
                res.add(sb.append("->").append(nums[i]).toString());
                sb = new StringBuilder();
            }
        }

        return res;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(int[] arr, List<String> expected) {
        assertEquals(expected, summaryRanges(arr));
    }
}
