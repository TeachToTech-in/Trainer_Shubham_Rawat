// LeetCode requires the class name to be Solution
class Solution {

    // Method to check whether a number is a palindrome
    public boolean isPalindrome(int x) {

        // Convert the integer into a String
        String str = Integer.toString(x);

        // Convert the String into a character array
        char[] charArr = str.toCharArray();

        // Loop through the string from the beginning
        for (int y = 0; y < str.length(); y++) {

            // Compare character from start and end
            if (charArr[y] == charArr[str.length() - 1 - y]) {

                // If we reach the middle of the string,
                // no further comparison is needed
                if (y == (str.length() / 2)) {
                    break;
                }

            } else {
                // If characters do not match, it is not a palindrome
                return false;
            }
        }

        // If all matching characters are equal, it is a palindrome
        return true;
    }
}