public ListNode reverseBetween(ListNode head, int left, int right){
    //corner case....
    if(head==null||left==right){
        return head;
    }

    //now taking prev as null and shifting all to left....
    ListNode prev=null;
    ListNode curr=head;

    //take left side until left value doesn't comes
    for(int i=1;i<left;i++){
        prev=curr;
        curr=curr.next;
    }

    //now reverse time...

    ListNode n1=curr; //left....
    ListNode n2=curr.next;

    for(int i=0;i<right-left;i++){
        n1.next=n2.next; //now 3 will get detached here.....
        n2.next=curr;
        curr=n2;
        n2=n1.next;
    }
    //reconnect..
    if(prev!=null){
        prev.next=curr;
        return head;

    }else{
        return curr; //all the rest element....
    }


    


}