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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;

        }
        //isme maan lo kit three lements are there 1->2->3
        //isme prev null he curr=1 he nad next ass a pointer chalta rahega
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){//curr jab tak null nahi hota tab tak karo
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;

        }
        head=prev;//kyuki curr to null ho gaya isliye 
        return head;



        
    }
}