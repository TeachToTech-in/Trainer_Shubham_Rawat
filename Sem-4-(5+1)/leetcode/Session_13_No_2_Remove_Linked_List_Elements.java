class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // 1. Create a dummy node that points to the head
        // Its value doesn't matter (we'll use 0)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 2. Use a 'prev' pointer starting at the dummy
        ListNode prev = dummy;

        // 3. Traverse the list
        while (prev.next != null) {
            if (prev.next.val == val) {
                // If we find the value, SKIP it by jumping the next pointer
                // IMPORTANT: We do NOT move 'prev' here because the NEW
                // prev.next also needs to be checked!
                prev.next = prev.next.next;
            } else {
                // If it's not a match, it's safe to move 'prev' forward
                prev = prev.next;
            }
        }

        // 4. Return the ACTUAL head (which is dummy.next)
        return dummy.next;
    }
}
// for virtualization https://tinyurl.com/RemoveLinkedListElements