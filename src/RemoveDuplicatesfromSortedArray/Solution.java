package RemoveDuplicatesfromSortedArray;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] verifiedNumbs = new int[]{0,1,2,3,4,0,0,0,0,0};
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        int actualLength = 0;
        int startingLength = nums.length-1;
        int startIdx = 0;
        int endIdx = 0;
        while (endIdx < nums.length) {
            int currValue = nums[endIdx];
            while (endIdx < nums.length && nums[endIdx] == currValue) {
                endIdx++;
            }
            nums[startIdx++] = currValue;
            actualLength++;
        }
        for (int i = actualLength; i <= startingLength; i++) {
            nums[i] = 0;
        }


        return startIdx;
    }
}
