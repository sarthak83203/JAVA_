//whenevr want to delete element go by the dummy method easy quizzy
public ListNode remove_kth_element_linkedlist(ListNode head,int val){
    ListNode dummy=new ListNode(0);
    dummy.next=head;  //connects the dummy element with head of Linkedlist.....
    ListNode curr=dummy;
    while(curr.next!=null){
        if(curr.next.val==val){
            curr.next=curr.next.next;

        }else{
            curr=curr.next;
        }

    }
    return dummy.next;
    
}