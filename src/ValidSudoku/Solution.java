package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isFieldValid = validateField(board);
        if (!isFieldValid)return false;

        for (int row = 0; row < board.length ;row++) {
            Set<Character> rows = new HashSet<Character>();
            Set<Character> columns = new HashSet<Character>();
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col]=='.') continue;
                if (!(rows.add(board[row][col]) && columns.add(board[row][col])))return false;
                if(!cube.add(board[(3 * (row / 3) + col) / 3][(3 * (row % 3) + col) % 3]))return false;
            }
        }
        return true;
    }

    boolean validateField(char [][] board){
        if (board.length != 9) return false;
        for (int i = 0; i < board.length; i++) {
            if (board[i].length != 9) return false;
        }
        return true;
    }
}
