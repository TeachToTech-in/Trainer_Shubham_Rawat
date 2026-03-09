class Solution {
    public int removeElement(int[] nums, int val) {
        // 'count' acts as the write-pointer.
        // It tracks where the next valid (non-val) element should be placed.
        int count = 0;

        // Iterate through the array with 'i' as the read-pointer
        for (int i = 0; i < nums.length; i++) {

            // If the current element is NOT the value we want to remove
            if (nums[i] != val) {

                // Copy the valid element to the 'count' position
                nums[count] = nums[i];

                // Move the write-pointer forward
                count++;
            }
        }

        // Return the count of elements that are not equal to 'val'
        // The judge will only look at the first 'count' elements of the array.
        return count;
    }
}
// for virtualization https://tinyurl.com/mtcrstm2
