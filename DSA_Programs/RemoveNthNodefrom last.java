/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(n==len){//agar first node ho to remove first method use karege
            return head.next;
        }
        int i=1;
        int sz=len-n;
        ListNode prev=head;
        while(i<sz){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return head;

        
    }
}