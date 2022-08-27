package MinimumNumberofOperationstoMoveAllBallstoEachBox;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Input: boxes = "110"
 * Output: [1,1,3]
 * Explanation: The answer for each box is as follows:
 * 1) First box: you will have to move one ball from the second box to the first box in one operation.
 * 2) Second box: you will have to move one ball from the first box to the second box in one operation.
 * 3) Third box: you will have to move one ball from the first box to the third box in two operations,
 * and move one ball from the second box to the third box in one operation.
 *
 * */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(minOperations("110")).mapToObj(Integer::toString).collect(Collectors.joining(",")));
    }

    public static int[] minOperations(String boxes) {
        var resultedArr = new int[boxes.length()];
        int totalmvs = 0;
        for (int i = 0; i < resultedArr.length; i++) {
            totalmvs = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '0')continue;
                if (j == i) {
                    continue;
                }
                totalmvs += Math.abs(i - j);
            }
            resultedArr[i] = totalmvs;
        }

        return resultedArr;
    }

}
