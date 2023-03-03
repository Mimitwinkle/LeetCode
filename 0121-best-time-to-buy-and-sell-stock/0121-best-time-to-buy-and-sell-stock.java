class Solution {
    public int maxProfit(int[] prices) {
     
        int smallNum = prices[0];
        int profit = 0;
            
        for(int i = 0; i < prices.length; i++) {
            smallNum = Math.min(prices[i], smallNum);
            profit = Math.max(profit, (prices[i] - smallNum));
        }
        
        return profit;
    }
}