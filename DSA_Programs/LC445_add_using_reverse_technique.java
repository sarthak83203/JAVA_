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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //mera logic ye he ki me pehele reverse karuga  dono LL ko
        //phir me head and head ko compare karte chaluga
        //using while loop i can do this now
        //lets go
        ListNode prev1=null;
        ListNode curr1=l1;
        ListNode next1;
        while(curr1!=null){
            next1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=next1;
        }
        //abhi mera prev bana he head samjha
        //now for second LL i can do
        ListNode prev2=null;
        ListNode curr2=l2;
        ListNode next2;
        while(curr2!=null){
            next2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next2;

        }
        //now both are revsred now apply logic
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode trav=dummy;
        while(prev1!=null || prev2!=null || carry!=0){
            int digit1;
            int digit2;
            if(prev1!=null){
                digit1=prev1.val;
            }else{
                digit1=0;
            }
            if(prev2!=null){
                digit2=prev2.val;
            
            }else{
                digit2=0;
            }
            int sum=digit1+digit2+carry;
            int digit=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(digit);
            trav.next=newNode;
            trav=trav.next;

            if(prev1!=null){//ye condition isliye ayi kyuki agar prev1 null hua too usko age mat badhana
                prev1=prev1.next;
            }
            if(prev2!=null){
                prev2=prev2.next;
            }



        }
        return reverse(dummy.next);


        
    }
    public ListNode reverse(ListNode head){//pura linkedlist aa gaya he isme
       ListNode prev=null;
       ListNode curr=head;
       ListNode next;
       while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       return prev;
       
       

    }
}