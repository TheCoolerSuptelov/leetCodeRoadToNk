package SingleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] testArray = new int[]{2,2,1};
        System.out.println(singleNumber(testArray));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numberAppireinceTimes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numberAppireinceTimes.put(nums[i], numberAppireinceTimes.getOrDefault(nums[i], 0)+1);
        }
        return numberAppireinceTimes.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList()).get(0);
    }
}
