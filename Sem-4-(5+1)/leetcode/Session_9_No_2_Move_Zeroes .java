class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Step 1: Reach into 'nums' and move non-zeros forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Step 2: Fill the remaining original slots with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
// for virtualization https://tinyurl.com/4f8fm6cb