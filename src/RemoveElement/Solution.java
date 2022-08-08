package RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int actualLength = 0;
        int startIdx = 0;
        int endIdx = 0;
        while (endIdx < nums.length) {
            int currValue = nums[endIdx];
            if (currValue == val) {
                while (endIdx < nums.length && nums[endIdx] == val) {
                    endIdx++;
                }
                nums[startIdx++] = nums[endIdx];
            }
            actualLength++;
        }
        for (int i = actualLength; i <= nums.length; i++) {
            nums[i] = 0;
        }
        return actualLength;
    }
}
