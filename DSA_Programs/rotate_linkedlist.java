//New method to rotate the Linkedlist......
//The method is make a circular LinkedList then break it at the particular index and make last one as null......
//k times we have to rotate....
public ListNode Rotate(ListNode head,int k){
    //corner case....
    if(head==null || head.next==null){
        return head;
    }

    ListNode curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=head; //here i am making the circular Linkedlist...

    k=k%len;
    int step=len-k;
    ListNode tail=head;
    for(int i=1;i<step;i++){
        tail=tail.next;
    }
    ListNode newHead=tail.next;
    tail.next=null;
    return newHead;
    



}