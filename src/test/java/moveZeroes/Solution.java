package moveZeroes;

public class Solution {
    public static void main(String[] args) {
        var xx = new int[]{0,0,1,0,12,22};
        System.out.println(moveZeroes(xx));
    }
    public static int[] moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
