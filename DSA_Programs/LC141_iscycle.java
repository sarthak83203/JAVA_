
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;//slow pointer 
        ListNode fast=head;//fast pointer
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;
            if(slow==fast){//agar cycle exist hogi to ye dono ek jagah milege tab true 
                return true;
            }
        }
        return false;//nahi to false
        
    }
}
    

