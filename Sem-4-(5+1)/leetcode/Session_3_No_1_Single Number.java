class Solution {
    // Method to find the element that appears only once
    // while all other elements appear exactly twice
    public int singleNumber(int[] nums) {

        // Variable to store XOR result
        int index = 0;

        // Loop through all elements in the array
        for (int i = 0; i < nums.length; i++) {

            /*
             * XOR properties used here:
             * 1. a ^ a = 0 (same numbers cancel each other)
             * 2. a ^ 0 = a (XOR with 0 gives the number itself)
             * 3. XOR is commutative and associative
             */

            // XOR current number with index
            index = index ^ nums[i];
        }

        // The remaining value is the number that appears only once
        return index;
    }
}
