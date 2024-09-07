package Convert1DArrayInto2DArray;

class Solution {

    public static void main(String[] args) {
        var test = new int[]{1,2};
        var x = construct2DArray(test,1,0);

    }

    public static int[][] construct2DArray(int[] original, int rows, int columns) {

        var resultedArray = new int[rows][columns];
        var emptyArr = new int[]{};
        if (rows*columns < original.length)return new int[][]{emptyArr};
        for (int i = 0,curRow =0 ,curColumn = 0; i < original.length; i++) {
            if(curColumn == columns){
                curRow++;
                curColumn = 0;
            }
            resultedArray[curRow][curColumn] = original[i];
            curColumn++;
        }

        return resultedArray;
    }
}