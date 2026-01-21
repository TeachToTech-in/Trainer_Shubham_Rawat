class Solution {
    public int numberOfSteps(int num) {
        // Initialize a counter to keep track of the total number of operations
        int counter = 0;

        // Continue the loop until the number reaches zero
        while (num > 0) {
            /* * Check if the current number is even using the modulo operator.
             * If even (num % 2 == 0), divide it by 2.
             * If odd, subtract 1 from it.
             */
            num = (num % 2 == 0) ? num / 2 : num - 1;

            // Increment the step counter after each operation
            counter++;
        }

        // Return the final count of steps taken
        return counter;
    }
}