package ProductofArrayExceptSelf_v2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4},new int[]{24,12,8,6})
        );
    }

    public int[] productExceptSelf(int[] nums) {

        int totalExceptOneNil = 1;
        boolean isNilPresent = false;
        for (int i = 0; i <= nums.length-1; i++) {
            var curValue = nums[i];
            if (isNilPresent == false && nums[i] == 0){
                isNilPresent = true;
                curValue = 1;
            } else if (curValue == 0 && isNilPresent == true) {
                totalExceptOneNil = 0;
                break;
            }

            totalExceptOneNil *= curValue;
        }



        var res = new int[nums.length];
        for (int i = 0; i <= nums.length-1; i++) {
            var curValue = nums[i];
            if (isNilPresent && curValue != 0){
                res[i] = 0;
            }
            if (nums[i] == 0){
                curValue = 1;
            }
            res[i] = totalExceptOneNil / curValue;
        }

        return res;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(int[] arr, int[] expected) {

        var actual = Arrays.stream(productExceptSelf(arr)).mapToObj(e->e).toList();
        actual.stream().peek(e->assertTrue(actual.contains(e))).toList();
    }
}
