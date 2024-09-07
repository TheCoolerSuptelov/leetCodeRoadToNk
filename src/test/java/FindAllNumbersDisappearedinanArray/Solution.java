package FindAllNumbersDisappearedinanArray;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        var intArr = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(
                findDisappearedNumbers(intArr)
                        .stream()
                        .map(e->e.toString())
                        .collect(Collectors.joining(",")));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        var length = nums.length;
        List<Integer> range = IntStream.rangeClosed(0, length)
                .boxed().collect(Collectors.toList());
        for (int i = 0; i < length; i++) {
            range.set(nums[i],0);
        }

        return range.stream().filter(e->!e.equals(0)).collect(Collectors.toList());
    }
}
