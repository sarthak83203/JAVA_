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
    public void reorderList(ListNode head) {
        //isme ye logic lagao
        //1st step mid find karo pehele to and (mid 1st half wale ka last node ho baas ye MANTRA yaad rakhna)
        

        //2st step he ki ye  2nd hald wale linkedlist ko reverse karo 
        //first of all hum ye sab isliye kar rahe he kyuki thoa question dekho zig zag ke foem ho raha he
        //so from front it is increaseing and from the last it is decreasing


        //3rd step sabse important he ki alternate node banakar print karo jisme hame two pointer  ki jarurat padegi yaad se kyu jarurat padegi kyu ki (store bhi hoga) like 
        //kisi ka bhi next loge link todoge to usse store karna padega isliye two pointer use hua he

        //now lets go
        


        //2nd step he reverse karo
        ListNode mid=Findmid(head);
        ListNode prev=null;
        ListNode curr=mid.next;
        mid.next=null;//bahut important hhe samj aya aab (agar nahi likha to error hoga(cycle found))
        ListNode next;
        while(curr!=null){//curr jab tak  null nahii hota tab tak to prev ko head bana duga
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;

        }

        //aab dekho linkedlist aise bani ye according to first test acse
        //LP=>1->2  and //RP=>3<-4

        ///now zig zag pattern follow karuga
        ListNode nextL;//this is required to get store the node 
        ListNode nextR;

        ListNode left=head;
        ListNode right=prev;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //now update part starts 
            left=nextL;
            right=nextR;
        }
    }
    //1st step mid find karo
     public ListNode Findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;//this is the important part 
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        }
}