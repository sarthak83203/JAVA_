public ListNode PartitionList(ListNode head,int x){
    ArrayList<Integer> list =new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();

    ListNode curr=head;
    while(curr!=null){
        list.add(curr.val);
        curr=curr.next;
    }

    for(int i:list){
        if(i<x){
            list.add(i);
        }
    }
    for(int val:list){
        if(val>=x){
            list.add(val);
        }
    }

    ListNode dummy=new ListNode(0);
    ListNode trav=dummy;

    for(int val:list2){
        trav.next=new ListNode(val);
        trav=trav.next;


    }
    return dummy.next;

}