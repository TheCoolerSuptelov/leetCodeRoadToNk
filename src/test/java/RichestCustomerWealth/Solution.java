package RichestCustomerWealth;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int curMax = 0;
        for (int i = 0; i < accounts.length; i++) {
            var sumInCurrentAccount = Arrays.stream(accounts[i]).sum();
            if (sumInCurrentAccount > curMax)curMax = sumInCurrentAccount;
        }
        return curMax;
    }
}
