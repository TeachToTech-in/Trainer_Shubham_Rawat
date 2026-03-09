class Solution {
    public int searchInsert(int[] nums, int target) {
        // Since the array is sorted, we can iterate from left to right
        for (int i = 0; i < nums.length; i++) {

            // 1. If we find the target, return its current index
            if (nums[i] == target) {
                return i;
            }

            // 2. If we hit a number GREATER than target, it means the target
            // should have been right here. We return 'i' because everything
            // from 'i' onwards would shift to the right.
            if (nums[i] > target) {
                return i;
            }
        }

        // 3. If the loop finishes, the target is larger than every element
        // in the array, so we return the length (the very last index + 1).
        return nums.length;
    }
}
// for virtualization https://tinyurl.com/5em9kn65
