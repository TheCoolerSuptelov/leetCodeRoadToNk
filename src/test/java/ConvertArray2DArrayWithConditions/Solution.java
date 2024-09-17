package ConvertArray2DArrayWithConditions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class Solution {

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        var curRow = new ArrayList<Integer>();

        var countNegative = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length && countNegative == nums.length){
                result.add(curRow);
                return result;
            } else if (i == nums.length && countNegative != nums.length){
                i=0;
                result.add(curRow);
                curRow = new ArrayList<>();
                continue;
            }
            var curValue = nums[i];
            if (curValue < 0){
                continue;
            }

            if (curRow.contains(curValue)){
                continue;
            }

            nums[i] = -nums[i];
            countNegative++;
            curRow.add(curValue);
        }

        return result;
    }

    @Test
    public void test1() {
        var qqs = findMatrix(new int[]{1,3,4,1,2,3,1});

        assertThat(qqs.get(0), containsInAnyOrder(1,3,4,2));
        assertThat(qqs.get(1), containsInAnyOrder(1,3));
        assertThat(qqs.get(2), containsInAnyOrder(1));
    }
}
