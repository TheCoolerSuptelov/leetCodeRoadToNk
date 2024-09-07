package Subset;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrace(answer, 0, new ArrayList<>(), nums);
        return answer;
    }

    public static void backtrace(List<List<Integer>> answer, int start, List<Integer> curArr, int[] nums) {
        answer.add(new ArrayList<>(curArr));
        for (int i = start; i < nums.length; i++) {
            curArr.add(nums[i]);
            backtrace(answer, i + 1, curArr, nums);
            curArr.remove(curArr.size() - 1);
        }

    }
}
















/*



    backtrace(nums, 0, new ArrayList<Integer>(), answer);
        return answer;
}

    public static void backtrace(int[] nums, int start, List<Integer> track, List<List<Integer>> answer) {
        answer.add(new ArrayList<>(track));
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrace(nums, i + 1, track, answer);
            track.remove(track.size() - 1);
        }
    }*/
