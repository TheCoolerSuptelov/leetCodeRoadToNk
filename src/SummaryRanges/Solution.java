package SummaryRanges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        var testArr = new int[]{0,2,3,4,6,8,9};
        System.out.println("[\"0\",\"2->4\",\"6\",\"8->9\"]");
        System.out.println(summaryRanges(testArr).stream().collect(Collectors.joining(",")));
    }

    public static List<String> summaryRanges(int[] nums) {

        var resultedList = new ArrayList<String>();
        if (nums == null || nums.length == 0) return resultedList;

        if (nums.length == 1) {
            resultedList.add(nums[0] + "");
            return resultedList;
        }

        var sb = new StringBuilder();
        int i = 0;
        sb.append(nums[i]);
        int appendedValue = nums[i];
        for (; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                if (appendedValue != nums[i]) {
                    sb.append("->");
                    sb.append(nums[i]);
                }
                resultedList.add(sb.toString());
                break;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                continue;
            }

            if (appendedValue != nums[i]) {
                sb.append("->");
                sb.append(nums[i]);
            }
            resultedList.add(sb.toString());
            sb.setLength(0);
            appendedValue = nums[i + 1];
            sb.append(appendedValue);

        }
        return resultedList;
    }
}
