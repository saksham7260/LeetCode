class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit = 0;
        
        for(int CurrentDay = 1 ; CurrentDay < prices.length ; ++CurrentDay) {
            int DailyProfit = prices[CurrentDay] - prices[CurrentDay - 1];
            MaxProfit = MaxProfit + Math.max(0, DailyProfit);
        }        
        return MaxProfit;
    }
}