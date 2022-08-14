package NumberofGoodPairs;

import java.util.HashMap;

/**
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
public class Solution {

    // n * (n – 1) // 2

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        var hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        return (int) hm.entrySet().stream().mapToInt(e->e.getValue() * (e.getValue()-1) / 2).sum();
    }

}
