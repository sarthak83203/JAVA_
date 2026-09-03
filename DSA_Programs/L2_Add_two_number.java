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
        //good question
        //isme value add karne he to isme ek unique kaam ye  mostly adding kaise hota he vaise nahi he
        //Example test case=> 9 9 9 9 9 9 9
        //                    9 9 9 9
        //they are adding in this way so the carry will get transferred to other nodes
        //we will us the dummy Linkedlist to make the solution proper 

        //now l1 is my head
        ListNode dummy=new ListNode(0);
        ListNode trav=dummy;//this is the tranverse pointer in dummy
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){//hume ye tak tak chalate jan he jab tak dono null nahi ho jata
        //agar l1 list khatam hua to bhi l2 to chalte rahna chahiye this is the addition mean
        //ye carry!=0 wala isliye laga kyuki agar l1 and l2 dono null hote he and acrry bass bacha raheta he to 
        //usse bhi node ke form mme represent karna he
        int digit1;
        int digit2;
          if(l1!=null){
            digit1=l1.val;

          }else{
            digit1=0;
          }
          if(l2!=null){
            digit2=l2.val;
          }else{
            digit2=0;
          }

          int sum=digit1+digit2+carry;
          int digit=sum%10;//ye wala node banega
          carry=sum/10;//ye carry jayega
          ListNode newNode=new ListNode(digit);
          trav.next=newNode;
          trav=trav.next;

          if(l1!=null){
            l1=l1.next;
          }
          if(l2!=null){//agar finish ho gaya to usko next kyu hi karna
            l2=l2.next;
          }


        }
        return dummy.next;


        
    }
}