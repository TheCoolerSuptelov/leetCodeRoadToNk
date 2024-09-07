package ArrangingCoins;

public class Solution {
    public int arrangeCoins(int n) {
        if (n == 1) return 1;
        int totalRows = 0;
        int sum = 0;
        while (sum <= n) {
            sum += totalRows + 1;
            totalRows++;
        }
        return totalRows - 1;
    }
}
