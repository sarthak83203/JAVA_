public ListNode merge_sort(ListNode list1,ListNode list2){
    ListNode dummy=new ListNode(0);   //Setting value as 0 for dummy variable...
    ListNode curr=dummy; // moving Pointer 

    //Now compairing all list-1 value with one by one list-2
    while(list1!=null && list2!=null){
        if(list1.val<list2.val){
            curr.next=list1;
            list1=list1.next;
        }else{
            curr.next=list2;
            list2=list2.next;
        }
        //now i am creating the linked list so the coming result should be increase by one
        curr=curr.next;
    }
    
    //now whatever element are remaining add them at last
    if(list1!=null){
        curr.next=list1; //like all the element ..

    }else{
        curr.next=list2;
    }
    return dummy.next;  

}