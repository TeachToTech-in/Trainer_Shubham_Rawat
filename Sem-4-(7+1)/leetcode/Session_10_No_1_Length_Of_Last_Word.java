class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count the characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
// for virtualization https://tinyurl.com/LengthOfLastWordLeetCode