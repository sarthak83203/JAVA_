public ListNode middleNode(ListNode head){
    ListNode curr=head;
    int len=0;
    while(curr!=null){
        curr=curr.next;
        len++;
    }
    ListNode newHead=head;
    int p=(len+1)/2;
    for(int i=p;i<len;i++){    //Now print all the node from the middle node to last of that linkedlist
        newHead=newHead.next;
    }
    return newHead;
}