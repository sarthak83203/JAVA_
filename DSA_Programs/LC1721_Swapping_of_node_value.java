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
    public ListNode swapNodes(ListNode head, int k) {
        //easy tha baas tereko value ko swap karna he na bhaii
        //baas isme two pointer lo jo ki first wala jayega first node we have to swap 
        //and second wala chalu hoga head se jabhi first.next==null hoga tabhi apne aap 
        //head wala pointer second wale par aa gaya baas uske baad to value swap karo
        ListNode first=head;
        for(int i=0;i<k-1;i++){
            first=first.next;
        }

        ListNode temp=first;
        ListNode second=head;
        while(temp.next!=null){
            temp=temp.next;
            second=second.next;
        }
        int temper=first.val;
        first.val=second.val;
        second.val=temper;


        return head;
    
    }
}