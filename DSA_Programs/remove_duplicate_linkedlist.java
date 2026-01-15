public ListNode remove_duplicate_linkedlist{
    ListNode n=head; //storing head in random variable
    while(head!=null && head.next!=null){
        if(head.val==head.next.val){
            head.next=head.next.next;

        }else{
            head=head.next;  //connection of head to head.next
        }
    }
    return n;


}