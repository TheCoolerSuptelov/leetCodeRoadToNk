package MergeSimilarItems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
 * Output: [[1,6],[3,9],[4,5]]
 * */
class Solution {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,1},{4,5},{3,8}};
        int[][] nums1 = new int[][]{{3,1},{1,5}};
        var xx = mergeSimilarItems(nums, nums1);
        var a = 1;
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        var hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < items1.length; i++) {
            hm.put(items1[i][0],items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            hm.put(
                    items2[i][0],
                    hm.getOrDefault(items2[i][0],0) + items2[i][1]);
        }
        return hm.entrySet().stream().map(e->List.of(e.getKey(),e.getValue())).sorted((o1, o2) -> o1.get(0) - o2.get(0)).collect(Collectors.toList());
    }
}
