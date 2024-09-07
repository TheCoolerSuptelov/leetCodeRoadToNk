package ReduceArraySizetoTheHalf;

import java.util.HashMap;
import java.util.stream.Collectors;

/*
* Input: arr = [3,3,3,3,5,5,5,2,2,7]
Output: 2
Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
Possible sets of size 2 are {3,5},{3,2},{5,2}.
Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5]
* which has a size greater than half of the size of the old array.
*
*
* */
public class Solution {
    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
    }
    public static int minSetSize(int[] arr) {
        var indexAmountHM = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            indexAmountHM.put(arr[i], indexAmountHM.getOrDefault(arr[i], 0) + 1);
        }
        var list = indexAmountHM.entrySet().stream().map(e->e.getValue()).sorted((e1, e2) -> e1 - e2).collect(Collectors.toList());
        var minLength = arr.length/2;
        var counter = 0;
        while (minLength>=0) {
            minLength -= list.get(list.size() -1 - counter);
            counter++;
        }

        return counter;
    }

}
