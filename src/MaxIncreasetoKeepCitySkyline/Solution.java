package MaxIncreasetoKeepCitySkyline;

/**
 * Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
 * Output: 35
 * Explanation: The building heights are shown in the center of the above image.
 * The skylines when viewed from each cardinal direction are drawn in red.
 * The grid after increasing the height of buildings without affecting skylines is:
 * gridNew = [8, 4, 8, 7], {3,0,8,4}, 5-4-0-3
           * [7, 4, 7, 7], {2,4,5,7}, 5-0-2-0
           * [9, 4, 8, 7], {9,2,6,3}, 0-2-2-4
           * [3, 3, 3, 3]  {0,3,1,0}  3-0-2-3
 */
public class Solution {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        var totalElevateLevel = 0;
        for (int row = 0; row < grid.length; row++) {
            int maxRow = findMax(grid, row);
            for (int column = 0; column < grid[row].length; column++) {
                int maxColumn = findMaxColumn(grid, column);
                totalElevateLevel += (maxColumn > maxRow ? maxRow : maxColumn) - grid[row][column];
                grid[row][column] = maxColumn > maxRow ? maxRow : maxColumn;
            }
        }
        return totalElevateLevel;
    }

    int findMax(int[][] grid, int row) {
        var curMax = Integer.MIN_VALUE;
        for (int i = 0; i < grid[row].length; i++) {
            if (grid[row][i] > curMax) curMax = grid[row][i];
        }
        return curMax;
    }

    int findMaxColumn(int[][] grid, int column) {
        var curMax = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][column] > curMax) curMax = grid[i][column];
        }
        return curMax;
    }
}
