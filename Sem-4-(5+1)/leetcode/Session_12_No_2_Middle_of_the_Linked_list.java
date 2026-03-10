class Solution {
    public ListNode middleNode(ListNode head) {
        // Both start at the beginning
        ListNode rabbit = head; // Fast pointer
        ListNode tortoise = head; // Slow pointer

        /*
         * The rabbit moves twice as fast as the tortoise.
         * When the rabbit reaches the end (null), the tortoise
         * will be exactly at the halfway point.
         */
        while (rabbit != null && rabbit.next != null) {
            // Tortoise moves 1 step
            tortoise = tortoise.next;
            // Rabbit moves 2 steps
            rabbit = rabbit.next.next;
        }

        // When rabbit hits the end, tortoise is at the middle
        return tortoise;
    }
}
// for virtualization https://tinyurl.com/MiddleOfLinkedListLeetCode