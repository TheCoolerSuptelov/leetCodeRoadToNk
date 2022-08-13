package NumberofArithmeticTriplets;

import java.util.HashMap;

/**
 * Input: nums = [0,1,4,6,7,10], diff = 3
 * Output: 2
 * Explanation:
 * (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
 * (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 *
 * */
class Solution {
    public static void main(String[] args) {
        var nums = new int[]{0,1,4,6,7,10};
        System.out.println(arithmeticTriplets(nums,3));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        var amountTriplets = 0;
        var hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i],i);
        }
        for (int i = nums.length -1 ; i >=0; i--) {
            if (nums[i]- diff < 0) continue;
            if (hm.getOrDefault(nums[i] - diff, -1) !=-1 && hm.getOrDefault(nums[i]+diff, -1)!=-1)amountTriplets++;
        }

        return amountTriplets;
    }

}
