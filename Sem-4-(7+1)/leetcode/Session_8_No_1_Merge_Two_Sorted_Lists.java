// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // BASE CASES: If one list is empty, return the other one
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        // RECURSIVE STEP: Pick the smaller value
        if (list1.val < list2.val) {
            // list1 is smaller, so it's our current 'result'
            // We link its '.next' to whatever the NEXT merge returns
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            // list2 is smaller (or equal)
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
// for virtualization https://tinyurl.com/4saufen7