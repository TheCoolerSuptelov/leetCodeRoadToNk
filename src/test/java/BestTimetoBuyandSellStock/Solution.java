package BestTimetoBuyandSellStock;

class Solution {
    public static void main(String[] args) {
        int[] testArr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(testArr));
    }
    public static int maxProfit(int[] prices) {
        //Map<Integer, Integer> dayMaxValue = new HashMap<>(prices.length);
        var curMaxProfit = 0;
        int buyAt = prices[0];
        for (int curDay = 0; curDay < prices.length; curDay++) {
            if (prices[curDay] - buyAt > curMaxProfit) curMaxProfit = prices[curDay] - buyAt;
            if (buyAt > prices[curDay]) {
                buyAt = prices[curDay];
            }
        }
        return curMaxProfit;
    }
}
