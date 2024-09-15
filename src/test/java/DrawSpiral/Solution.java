package DrawSpiral;

public class Solution {


    public int[][] drawSpiral(int matrixSize) {
        var res = new int[matrixSize][matrixSize];
        var calculated = 0;
        var total = matrixSize * matrixSize;

        var row = 0;
        var col = 0;

        var endRow = 0;
        var endCol = 0;

        var offsetRow = 0;
        var offsetCol = 0;

        while(calculated < total){

            for (int i = matrixSize - offsetRow; i >offsetCol; i--) {
                res[row][i] =1;
            }

            for (int i = matrixSize-offsetCol; i > offsetCol; i--) {
                res[col][i] = 1;
            }

            calculated++;
        }

        return res;
    }

}
