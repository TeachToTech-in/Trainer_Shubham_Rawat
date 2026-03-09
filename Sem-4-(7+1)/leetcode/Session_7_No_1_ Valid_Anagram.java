class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths match.
        // If they don't, they can't possibly be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Initialize a 'bucket' for the 26 lowercase English letters.
        // Each index represents a letter: 0 for 'a', 1 for 'b', etc.
        int bucket[] = new int[26];

        // Step 3: Iterate through string 's' and increment the count for each
        // character.
        // (int)ch - 97 maps the character to its 0-25 index (97 is ASCII for 'a').
        for (char ch : s.toCharArray()) {
            bucket[(int) ch - 97]++;
        }

        // Step 4: Iterate through string 't' and decrement the count for each
        // character.
        // If 't' is an anagram of 's', it should perfectly "empty" the buckets.
        for (char ch : t.toCharArray()) {
            bucket[(int) ch - 97]--;
        }

        // Step 5: Check the bucket.
        // If any value is not 0, it means 's' and 't' had different character counts.
        for (int i : bucket) {
            if (i != 0)
                return false;
        }

        // If we reached here, all counts are zero, confirming they are anagrams.
        return true;
    }
}
// for visualization, https://tinyurl.com/2t3hhfup