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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        //isme ek fanda he ki grupsize ko 1 lelo kyu ki hum initialize karege as a group 1
       //and two pointer chalega ek curr pointer jo i fix rahega first pe and other pointer 
       //temp jo curr ko chalate rahega(important temp ko head se initialize nahi karege  kyu ki agar maan lo ki curr aage badha to temp t= head se chalu hoga it means breaking of groups)
       //groupsize ye bata rahe he ki kitne node hone chahiye ek group me 
       //important point ye he ki count kyu liya kyu ki agar maan lo ye example le to
       //1->2->3->4->5->6->7
       //1st group is 1
       //2nd group is 2->3
       //3rd group is 4->5->6
       //4th group is 7
       //so only group  size is not enough
       //ye question reverse karne me phasa deta he (important be aware while reversing)
       //lets goo
    ListNode curr=head;
    ListNode before=null;
    int groupsize=1;
    while(curr!=null){
        ListNode temp=curr;
        int count=0;//counting the particular group
        while(temp!=null && count<groupsize){
            temp=temp.next;
            count++;
        }
        if(count%2==0){
            ListNode prev=null;
            ListNode node=curr;//abhi head apna curr he
            ListNode next;
            for(int i=0;i<count;i++){
                next=node.next;
                node.next=prev;
                prev=node;
                node=next;
            }
            if(before!=null){
                before.next=prev;
            }
            curr.next=node;
            before=curr;//pichla wala curr save kiya he
            curr=node;
        }else{
            for(int i=0;i<count;i++){
                before=curr;
                curr=curr.next;
            }
        }
        groupsize++;


    }
    return head;
    

        
    }
}