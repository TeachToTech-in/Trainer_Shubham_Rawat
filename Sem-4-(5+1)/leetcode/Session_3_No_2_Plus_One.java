// LeetCode requires the class name to be Solution
class Solution {

    // Method to add one to a number represented as an array of digits
    public int[] plusOne(int[] digits) {

        // Length of the digits array
        final int n = digits.length;

        // Traverse the array from last digit to first digit
        for (int i = n - 1; i >= 0; i--) {

            // Add 1 to the current digit
            digits[i]++;

            // If digit becomes less than 10, no carry is generated
            // We can directly return the result
            if (digits[i] < 10)
                return digits;

            // If digit becomes 10, set it to 0 and continue loop
            // Carry will be added to the next left digit
            digits[i] = 0;
        }

        /*
         * If control reaches here, it means all digits were 9
         * Example: [9, 9, 9]
         * Result will be [1, 0, 0, 0]
         */

        // Create a new array with one extra space
        digits = new int[n + 1];

        // Set the first digit as 1
        digits[0] = 1;

        // Remaining digits are already 0 by default
        return digits;
    }
}
