//remove the nth node form the last....

public ListNode remove_node_from_last(ListNode head,int n){
    //corner case....
    if(head==null || head.next==null){
        return null;
    }

    //now going up to index...
    int size=0;
    ListNode curr=head;
    while(curr!=null){
        curr=curr.next;
        size++;
    }
    if(size==n){
        return head.next;
    }
    int index=size-n;
    int i=1;
    ListNode prev=head;
    while(i<index){
        prev=prev.next;   
        i++;
    }
    prev.next=prev.next.next;
    return head;

}