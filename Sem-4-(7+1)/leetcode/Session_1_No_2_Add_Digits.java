// LeetCode requires the class name to be Solution
class Solution {

    // Method to repeatedly add digits of a number
    // until a single-digit number is obtained
    public int addDigits(int num) {

        // Convert the number to String to check number of digits
        String str = String.valueOf(num);

        // Continue looping until the number becomes a single digit
        while (str.length() > 1) {

            // Variable to store sum of digits
            int temp = 0;

            // Extract digits one by one and add them
            while (num >= 1) {

                // Get the last digit using modulo operator
                temp += num % 10;

                // Remove the last digit using integer division
                num /= 10;
            }

            // Convert the sum back to String
            // to check if it is still more than one digit
            str = String.valueOf(temp);

            // Update num with the new summed value
            num = temp;
        }

        // Return the final single-digit result
        return num;
    }
}
