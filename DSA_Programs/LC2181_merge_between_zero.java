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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode trav=dummy;
        ListNode curr=head;
        int sum=0;
        while(curr!=null){
            if(curr.val==0){//jabhi value zero hogi tabhi sum bhi check karo kyuki mereko dono ke bich ka tech karna he
                if(sum!=0){
                    ListNode newNode =new ListNode(sum);
                    trav.next=newNode;
                    trav=trav.next;//ek ek karke jagah banani padegi na
                    sum=0;
                }
            }else{
                sum=sum+curr.val;
            }
            curr=curr.next;
           
        }
        return dummy.next;

        
        
    }
}