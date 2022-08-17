package MatrixDiagonalSum;
/**
 *
 * Input: mat = [[1,2,3],
                 * [4,5,6],
                 * [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 *
 * */
        /*
        00 11 22
        02 11 20
        * */
/*
 * 02
 * 11
 * 20
 * */

public class Solution {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        for (int i = 0; i < mat.length; i++) {
            if (i == (mat.length-1-i)) continue;
            sum += mat[i][mat.length-1-i];
        }

        return sum;

    }

}

