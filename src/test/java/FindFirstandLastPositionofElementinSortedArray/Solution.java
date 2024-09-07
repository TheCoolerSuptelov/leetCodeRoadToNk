package FindFirstandLastPositionofElementinSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] answer = new int[]{-1, -1};
        if (nums.length == 1) {
            if (nums[0] == target) {
                answer[0] = 0;
                answer[1] = 0;
                return answer;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == target) {
                if (answer[0] == -1) answer[0] = i - 1;
                if (nums.length == i + 1 || nums[i] != nums[i + 1]) {
                    answer[1] = i;
                    return answer;
                }
            }

        }

        return answer;
    }

}
