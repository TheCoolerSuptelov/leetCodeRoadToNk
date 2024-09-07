package MakeArrayZerobySubtractingEqualAmounts;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
    }
    public static int minimumOperations(int[] nums) {
        if (nums.length == 1 && (nums[0] == 0)) {
            return 0;
        }
        var counter = 0;
        while (true) {
            var min = chooseMinimumNonZero(nums);
            if (min == 0) return counter;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] - min < 0) {
                    nums[i] = 0;
                    continue;
                }

                nums[i] = nums[i] - min;
            }
            counter++;
        }
    }

    static int chooseMinimumNonZero(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min && nums[i]>0) min = nums[i];
        }
        return min==Integer.MAX_VALUE?0:min;
    }

}
