// The Solution class is required by LeetCode
class Solution {

    // Method to find indices of two numbers whose sum equals the target
    public int[] twoSum(int[] nums, int target) {

        // Array to store the final answer (two indices)
        int[] sol = new int[2];

        // Outer loop: picks the first number
        // Runs from index 0 to second-last index
        for (int i = 0; i < nums.length - 1; i++) {

            // Inner loop: picks the second number
            // Starts from i+1 to avoid repeating the same pair
            for (int j = i + 1; j < nums.length; j++) {

                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {

                    // Store the indices of the two numbers
                    sol[0] = i;
                    sol[1] = j;

                    // Return immediately once the pair is found
                    return sol;
                }
            }
        }

        // Return the result array
        // (Problem guarantees exactly one solution, so this line is mostly for syntax)
        return sol;
    }
}
