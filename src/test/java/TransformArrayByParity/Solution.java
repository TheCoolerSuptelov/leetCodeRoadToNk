package TransformArrayByParity;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        var sut = new Solution();
        System.out.println(Arrays.toString(sut.transformArray(new int[]{4, 3, 2, 1})));
    }

    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
