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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //isme list1 hi head he 
        //isme me ye appraoch laga raha hu ki me list1 me travel karuga and 13 tak jauga
        //13 tak bole to delete karne ke pehele element ke pass according to 1st test i said 13
        //uske baad ek poinetr me 13 ka next store karege like according to first test case 
        //phir uss pointer ko hum aage badhayege and vo last element ko point karega 
        //phir jo hamne list1 ko tranverse karke 13 tak aye the usko list2 se joint karege
        //inShot link break karke join karna he agar arraylist use karega 
        // to space Complexity O(n) Hogi (it means taking extra space(can get reject in interview)
        //isme O(1) use hogi 

        //let's do

        //1st step list1 ko curr1 leke traverse karo
        ListNode curr=list1;
        for(int i=0;i<a-1;i++){
            curr=curr.next; //hum 13 pe aagaye according to 1st case
        }

        ListNode sec=curr.next;//aab hum gaye 6 pe
        for(int i=a;i<b+1;i++){
            sec=sec.next;//ab mera sec aa gaya he 5 pe according to first test case
        }

        //now list2 me traverse karo
        ListNode curr2=list2;
        while(curr2.next!=null){//isme me aa gaya hu 10000002 pe according to 1st test case
            curr2=curr2.next;
        }

        //aab link todo and jodo
        curr.next=list2;
        curr2.next=sec;
        return list1;
        






        
    }
}