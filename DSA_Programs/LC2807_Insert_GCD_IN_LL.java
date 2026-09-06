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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode trav=dummy;
        ListNode curr=head;
        while(curr!=null){
            //new node bane to aage badho
            trav.next=new ListNode(curr.val);//bhai ye pointing nahi he ye assign he 
            trav=trav.next;//ye aab new node pe point karega

          if(curr.next!=null){
            int gcds=gcd(curr.val,curr.next.val);
            trav.next=new ListNode(gcds);
            trav=trav.next;//in shot jo node bana uspe aake ruka hu
          }
          curr=curr.next;      
        }
        return dummy.next;

    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);

    }
}