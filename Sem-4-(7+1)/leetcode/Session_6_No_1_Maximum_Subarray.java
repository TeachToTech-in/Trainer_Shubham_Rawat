public class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element of the array
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.size; i++) {
            // Choice: Extend the previous subarray or start a new one at i
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Keep track of the best sum we've seen globally
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
