
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode rabbit = head;
        ListNode tortoise = head;
        
        // Hint: This condition needs to be stronger to prevent crashes
        while(rabbit != null && rabbit.next != null){
            rabbit = rabbit.next.next;
            tortoise = tortoise.next;
            if(rabbit == tortoise){
                return true;
            }
        }
        return false;
    }
}
//for virtualization https://tinyurl.com/LinkedListCycleLeetCode