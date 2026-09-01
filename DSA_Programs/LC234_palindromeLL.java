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
    public boolean isPalindrome(ListNode head) {

        //corner case comes first
        if(head==null || head.next==null){//agar kuch nahi he yaa phir he to only one then palindrome
            return true;
        }
        //finding the mid
        ListNode mid=findmid(head);

        //revsre the second half now
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;//prev ki value current ki jagah aa jayegi 
            curr=next;//and curr ki value next ki jagah aayegi
        }

        //now compare the first half is equal to the second half
        ListNode right=prev;//second hald ka head aab prev hoga kyuki curr null hua he
        ListNode left=head;
        while(right!=null){//buss right ko lena he kyu ki even wale case me right pehele null ko jayega
        if(left.val!=right.val){
            return false;
        }
        left=left.next;
        right=right.next;//abb ye piche chalega kyuki aab linkedlist of half reverse ho gayi he to vo aab reversely chalegi next karke

        }
        return true;



        
    }
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}