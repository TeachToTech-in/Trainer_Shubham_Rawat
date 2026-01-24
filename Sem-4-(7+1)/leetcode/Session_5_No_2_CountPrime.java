class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;

        // Step 1: Create a boolean array (default is false)
        // isNotPrime[i] = true means the number is composite
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isNotPrime[i] == false) {
                count++;

                // Step 2: Mark all multiples of i as true (not prime)
                // We start marking from i * i because smaller multiples
                // would have already been marked by smaller primes.
                // Use long for 'j' to avoid integer overflow if i*i > 2^31-1
                for (long j = (long) i * i; j < n; j += i) {
                    isNotPrime[(int) j] = true;
                }
            }
        }

        return count;
    }
}