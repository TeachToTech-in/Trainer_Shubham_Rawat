class Solution {
    public int missingNumber(int[] nums) {
        // Create a frequency array (bucket) of size n + 1
        // because the range of numbers is [0, n].
        int[] number = new int[nums.length + 1];

        // Fill the buckets: Increment the index corresponding to the number found
        for (int i : nums) {
            number[i]++;
        }

        // Iterate through the buckets
        for (int i = 0; i < number.length; i++) {
            // If a bucket has a count of 0, that index is the missing number
            if (number[i] < 1) {
                return i;
            }
        }

        // Default return (should not be reached based on problem constraints)
        return -1;
    }
}
// for virtualization https://tinyurl.com/MissingNumberLeetCode