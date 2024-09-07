package FourSum;

import java.util.HashMap;

/**
 * Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
 * Output: 2
 * Explanation:
 * The two tuples are:
 * 1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0 *
 * */
public class Solution {
    public static void main(String[] args) {
        var nums1 = new int[]{1,2};
        var nums2 = new int[]{-2,-1};
        var nums3 = new int[]{-1,2};
        var nums4 = new int[]{0,2};

        System.out.println(fourSumCount(nums1, nums2, nums3,nums4));
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        var hm  = new HashMap<Integer, Integer>(nums1.length * nums1.length);

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                hm.put(nums3[i] + nums4[j],hm.getOrDefault(nums3[i] + nums4[j],0)+1);
            }
        }
        int amountOfTuples = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                amountOfTuples += hm.getOrDefault(-1 * (nums1[i] + nums2[j]),0);
            }
        }
        return amountOfTuples;
    }
}
