public ListNode palindrome_linkedlist(ListNode head){
    //it will be easy by array list....
    ArrayList<Integer> list=new ArrayList<>();
    if(head==null || head.next==null){
        return true; //Empty list is palindrome...
    }
    while(head!=null){
        list.add(head.val);
        head=head.next;
    }

    int i=0;
    int j=list.size()-1;
    while(i<j){
        if(!((list.get(i)).equals(list.get(j)))){
            return false;
        }
        i++;
        j--;
    }
    return true;


}