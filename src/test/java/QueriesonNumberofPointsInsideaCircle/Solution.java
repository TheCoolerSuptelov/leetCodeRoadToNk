package QueriesonNumberofPointsInsideaCircle;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 
 * Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
 * Output: [3,2,2]
 * Explanation: The points and circles are shown above.
 * queries[0] is the green circle, queries[1] is the red circle, and queries[2] is the blue circle.
 * * 
 */

class Solution {
    public static void main(String[] args) {
        var points = new int[][]{{1,3},{3,3},{5,3},{2,2}};
        var queries = new int[][]{{2,3,1},{4,3,1},{1,1,2}};
        System.out.println(Arrays.stream(countPoints(points, queries)).mapToObj(Integer::toString).collect(Collectors.joining(",")));
    }
    public static int[] countPoints(int[][] points, int[][] queries) {
        var resultedArray = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (
                        ((queries[i][0] - points[j][0])*
                                (queries[i][0] - points[j][0]) +
                                (queries[i][1] - points[j][1])*
                                        (queries[i][1] - points[j][1])) <= (queries[i][2]* queries[i][2])) resultedArray[i]++;
            }
        }
        return resultedArray;
    }
}