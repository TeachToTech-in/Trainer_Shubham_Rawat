// LeetCode requires the class name to be Solution
class Solution {

    // Method to reverse digits of a 32-bit signed integer
    public int reverse(int x) {

        // Variable to store the reversed number
        int rev = 0;

        // Variable to store the last digit (popped digit)
        int pop;

        // Loop until all digits are processed
        while (x != 0) {

            // Extract the last digit of x
            pop = x % 10;

            // Remove the last digit from x
            x /= 10;

            /*
             * Overflow check:
             * If rev is greater than MAX_VALUE/10, multiplying by 10 will overflow.
             * If rev equals MAX_VALUE/10, the last digit (pop) must not exceed 7.
             */
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;

            /*
             * Underflow check:
             * If rev is smaller than MIN_VALUE/10, multiplying by 10 will underflow.
             * If rev equals MIN_VALUE/10, the last digit (pop) must not be less than -8.
             */
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            // Build the reversed number
            rev = rev * 10 + pop;
        }

        // Return the reversed integer
        return rev;
    }
}
