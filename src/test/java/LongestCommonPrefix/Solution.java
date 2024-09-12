package LongestCommonPrefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"cir","car"}, "c")

        );
    }

    public String longestCommonPrefix(String[] strs) {
        var charArrs = new char[strs.length][];
        var minArrLength = Integer.MAX_VALUE;
        for (int i = 0; i <= strs.length - 1; i++) {
            charArrs[i] = strs[i].toCharArray();
            minArrLength = Math.min(minArrLength, charArrs[i].length);
        }
        var counter = 0;
        for (int i = 0; i <= minArrLength - 1; i++) {
            var presentInAll = true;
            for (int j = 0; j <= charArrs.length - 1; j++) {
                if (charArrs.length > j + 1) {
                    if (charArrs[j][i] != charArrs[j + 1][i]) {
                        presentInAll = false;
                    }
                }
            }
            if (presentInAll) {
                counter++;
            } else {
                break;
            }
        }

        return strs[0].substring(0, counter);
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(String[] arr, String expected) {
        assertEquals(expected, longestCommonPrefix(arr));
    }
}
