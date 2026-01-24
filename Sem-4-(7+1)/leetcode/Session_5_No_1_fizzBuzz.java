class Solution {
    public List<String> fizzBuzz(int n) {
        // Create an ArrayList to store the result strings
        ArrayList<String> list = new ArrayList<String>();

        // Iterate from 1 up to and including n
        for (int i = 1; i <= n; i += 1) {
            // Check if the number is divisible by both 3 and 5 (i.e., divisible by 15)
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }
            // Check if the number is divisible only by 3
            else if (i % 3 == 0) {
                list.add("Fizz");
            }
            // Check if the number is divisible only by 5
            else if (i % 5 == 0) {
                list.add("Buzz");
            }
            // If not divisible by 3 or 5, add the number itself as a String
            else {
                list.add(i + "");
            }
        }

        // Return the populated list
        return list;
    }
}