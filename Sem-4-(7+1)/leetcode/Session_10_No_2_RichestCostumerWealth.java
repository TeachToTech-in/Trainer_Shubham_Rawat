class Solution {
    public int maximumWealth(int[][] accounts) {
        // This will store the highest wealth found so far
        int maxAmount = 0;

        // Outer loop: Iterate through each customer (each row in the 2D array)
        for (int i = 0; i < accounts.length; i++) {

            // Reset sum to 0 for the current customer
            int sum = 0;

            // Inner loop: Iterate through each bank account of the current customer
            // You used an enhanced for-loop (for-each) here, which is very clean!
            for (int j : accounts[i]) {
                sum += j; // Add the money in the current bank to the total
            }

            // After summing all accounts for this customer, check if they are the richest
            if (maxAmount < sum) {
                maxAmount = sum; // Update the "High Score"
            }
        }

        // Return the wealth of the richest customer
        return maxAmount;
    }
}
// for virtualization https://tinyurl.com/RichestCostumerWealthLeetCode