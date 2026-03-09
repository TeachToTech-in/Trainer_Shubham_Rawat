class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize max (the global best) and cur (the best ending at the current
        // position)
        // We start with the first element because the array length is at least 1.
        int max = nums[0], cur = nums[0];

        for (int i = 1; i < nums.length; i++) {
            /*
             * DECISION POINT:
             * Is the previous sum helping us?
             * If (cur + nums[i]) is greater than just nums[i],
             * it means the previous 'cur' was positive and worth keeping.
             */
            if ((cur + nums[i]) > nums[i]) {
                cur += nums[i]; // Extend the existing subarray
            } else {
                /*
                 * RESET:
                 * If adding nums[i] to 'cur' makes it smaller than nums[i] itself,
                 * it means 'cur' was negative. We "dump" the old subarray
                 * and start a fresh one at the current index.
                 */
                cur = nums[i];
            }

            // Update the global maximum if the current subarray sum is the best we've seen
            if (cur > max) {
                max = cur;
            }
        }

        return max;
    }
}
// for visualization, https://tinyurl.com/4zrtpzrd