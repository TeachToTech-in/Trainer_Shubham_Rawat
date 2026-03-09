class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Initialize a frequency array (bucket) for 26 lowercase letters.
        int bucket[] = new int[26];

        // Step 2: First Pass (The Census)
        // Iterate through the string and increment the count for each character.
        // (int)ch - 97 maps 'a' to 0, 'b' to 1, etc.
        for (char ch : s.toCharArray()) {
            bucket[(int) ch - 97]++;
        }

        // Step 3: Second Pass (The Search)
        // Iterate through the string again *in order* to find the first character
        // that has a frequency count of exactly 1 in our bucket.
        for (int i = 0; i < s.length(); i++) {
            if (bucket[(int) s.charAt(i) - 97] == 1) {
                // Return the index of the first non-repeating character found.
                return i;
            }
        }

        // Step 4: If the loop finishes without returning, no unique character exists.
        return -1;
    }
}
// For Visualization, https://tinyurl.com/4saufen7