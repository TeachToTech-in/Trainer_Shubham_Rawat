import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Base case: An array with 0 or 1 element cannot have duplicates
        if (nums == null || nums.length < 2) {
            return false;
        }

        // 1. SORTING: O(n log n) time complexity.
        // This puts identical numbers right next to each other.
        Arrays.sort(nums);

        // 2. LINEAR SCAN: O(n) time complexity.
        // We loop until (length - 1) to ensure nums[i+1] never goes out of bounds.
        for (int i = 0; i < nums.length - 1; i++) {

            // Check if the current element is the same as the next one
            if (nums[i] == nums[i + 1]) {
                // If they match, we found a duplicate!
                return true;
            }
        }

        // If we finish the loop without returning true, every number is unique
        return false;
    }
}

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
// for virtualization https://tinyurl.com/ContainsDuplicateLeetCode