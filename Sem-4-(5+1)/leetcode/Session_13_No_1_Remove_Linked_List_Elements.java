class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // 1. Save the next node (bookmark)
            ListNode nextTemp = curr.next;

            // 2. Reverse the pointer
            curr.next = prev;

            // 3. Move prev and curr forward one step
            prev = curr;
            curr = nextTemp;
        }

        // prev will be pointing to the new head at the end
        return prev;
    }
}
// for virtualization https://tinyurl.com/ReverseLinkedListLeetCode