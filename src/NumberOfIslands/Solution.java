package NumberOfIslands;

public class Solution {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int numberOfIslands = 0;

        for (int i = 0, j = 0; i < grid.length && j<grid[0].length; i++, j++) {

            for (int row=0; row < grid.length; row++)
            {
                for (int col=0; col < grid[row].length; col++)
                {
                    if (grid[row][col] == '0'){
                        continue;
                    }
                    numberOfIslands++;
                    infectAllPieceOfLand(grid, row, col);
                }
            }
        }
        return numberOfIslands;
    }

    public static void infectAllPieceOfLand(char[][] grid, int row, int col){
        if(grid[row][col]=='0'){
            return;
        }
        grid[row][col] = '0';
        if (grid[row].length>col+1){
            infectAllPieceOfLand(grid, row,col+1);
        }
        if (0<=col-1){
            infectAllPieceOfLand(grid, row,col-1);
        }
        if (0<=row-1){
            infectAllPieceOfLand(grid, row-1,col);
        }
        if (grid.length>row+1){
            infectAllPieceOfLand(grid, row+1,col);
        }
    }
}
