package MergeIntervals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution {
    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 4}, {0, 2}, {3, 5}}, new int[][]{{0, 5}}),
                Arguments.of(new int[][]{{1, 4}, {0, 4}}, new int[][]{{0, 4}}),
                Arguments.of(new int[][]{{1,3},{2,6},{8,10},{15,18}},new int[][]{{1,6},{8,10},{15,18}})
        );
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length; i++) {
            var isIntervalCanBeMergeWithNext = i+1 < intervals.length;
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (!isIntervalCanBeMergeWithNext) {
                intervals[i][0] = start;
                intervals[i][1] = end;
                break;
            }

            var nextInterval = intervals[i+1];

            if (end >= nextInterval[0]){

                nextInterval[0] = Math.min(start, nextInterval[0]);
                nextInterval[1] = Math.max(nextInterval[1], end);
                intervals[i][0] = -1;
                intervals[i][1] = -1;
            } else {
                intervals[i][0] = start;
                intervals[i][1] = end;
            }
        }

        var newLenght = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0]!=-1&&intervals[i][1]!=-1) {
                newLenght++;
            }
        }


        var finalResult = new int[newLenght][2];
        var lenght = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0]==-1&&intervals[i][1]==-1) {
                continue;
            }
            finalResult[lenght][0] = intervals[i][0];
            finalResult[lenght][1] = intervals[i][1];
            lenght++;
        }


        return finalResult;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(int[][] arr, int[][] expected) {

        var res = merge(arr);

        for (int i = 0; i < expected.length; i++) {
            var curArr = expected[i];
            var expectedArr = res[i];
            assertTrue(curArr.length == expectedArr.length);
            for (int j = 0; j < curArr.length; j++) {
                assertTrue(curArr[j] == expectedArr[j]);
            }

        }
    }

}
