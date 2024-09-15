package SpiralMatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(Arguments.of(
                new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                List.of(1, 2, 3, 6, 9, 8, 7, 4, 5)
        ));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        // row:0 - column:0 -> row:0-column:3
        // row:0 - column:3 -> row:3-column:3
        // row:3-column:3 -> row:2-column:0
        // row:2-column:0 -> row:2-column:3


        // 0-0 -> 0-l
        // 0-l -> n-l
        // n-l -> n-0
        // n-0 -> n-1 - l
        // n-1 -l -> n

        var curRow = 0;
        var curCol = 0;

        var endRouteRow = 0;
        var endRouteCol = 0;

        var totalElements = matrix.length * matrix[0].length;
        var travesalElements = 0;
        var curColOffset = 0;
        var curRowOffset = 0;

        var res = new ArrayList<Integer>();

        while(totalElements>travesalElements){
            endRouteCol = matrix[0].length - curColOffset;
            for (int i = 0; i < matrix[0].length; i++) {

            }

            curColOffset++;
            curRowOffset++;



        }


        return List.of();
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(int[][] arr, List<Integer> expected) {

        var res = spiralOrder(arr);

        assertThat(res, containsInAnyOrder(expected));
    }

}
