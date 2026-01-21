class Solution {
    public boolean isPowerOfTwo(int n) {
        // Start with an exponent of 0 (2^0 = 1)
        int pow = 0;

        /*
         * * Loop while 2^pow is less than or equal to n.
         * The added condition 'n < Integer.MAX_VALUE' ensures we are
         * within the standard integer bounds, though 2^31 would exceed it.
         */
        while ((int) Math.pow(2, pow) <= n && n < Integer.MAX_VALUE) {

            // Check if the current power of 2 matches the input n
            if ((int) Math.pow(2, pow) == n) {
                return true;
            }

            // Move to the next exponent
            pow++;
        }

        // Return false if no power of 2 matches n
        return false;
    }
}