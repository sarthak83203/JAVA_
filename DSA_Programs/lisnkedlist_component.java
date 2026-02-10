//So in this question we have to return the number of connected nodes in nums...
public ListNode Linkedlist_components(ListNode head,int nums[]){
    ListNode curr=head;
    //NOw i am putting nums in Hashset as Hashset 'contains' as Hashset "contains" have good complexity then arraylist..
    HashSet<Integer> list=new HashSet<>();
    int count=0;
    for(int i:nums){
        list.add(i);

    }
    ListNode curr=head;
    while(curr!=null){
        if(list.contains(curr.val) && (curr.next==null ||!list.contains(curr.next.val))){   //it means i should contain both like 0->1
            //it will count as that if it will not contain.then link will get break...
            count++;
        }
    }
    return count;


}