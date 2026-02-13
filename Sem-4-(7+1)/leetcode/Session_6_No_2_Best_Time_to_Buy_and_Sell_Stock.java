class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int lowestPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the floor (the cheapest we've seen)
            lowestPrice = Math.min(lowestPrice, prices[i]);
            
            // See if selling today is better than our previous best profit
            maxProfit = Math.max(maxProfit, prices[i] - lowestPrice);
        } 
        
        return maxProfit;
    }
}