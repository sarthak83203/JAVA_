
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class Solution {
    public ListNode detectCycle(ListNode head) {

        //ye same he remove the cycle from the linkedlist bas isme fasts ya slow dono mese ek ko return karna he 
        //agar cycle detect hogi to hame slow ko head bana dena hoga  and break isliye ki vo fats pointr vohi rahena chahiye
        //kyu ki fats pointer ko hame vohi se chalu karna he 
        //phir slow ko ek ek karke aage badhao and fast ko bhi mathematically vo ek jagah milege
        //agar mujhe cycle ko remove karna ho like linear Linkedlist Banani hoto prev ko null se intialize karo
        //baad me prev me fast pointer store karte raho and prev me last node record ho jayega jo ki last faster node hoga
        //phit prev.next ko null banado so we successfully remove the cycle from the linkedlist


        ListNode slow=head;
        ListNode fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               cycle=true;
               break;   
            }
        }
        if(cycle==false){
            return null;
        }

        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
        
        
        
    }
}