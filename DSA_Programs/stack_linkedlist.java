public int[] nextnode(ListNode head){
    ListNode curr=head;
    ArrayList<Integer> list=new ArrayList<>();
    whiel(curr!=null){
        list.add(curr.val);
        curr=curr.next;
    }

    int arr[]=new int[list.size()];
    Stack<Integer> s=new Stack<>();
    
    for(int i=0;i<list.size();i++){
        while(!s.isEmpty() && list.get(i)>list.get(s.peek())){  //it will get added by one itself....
            ans[s.pop()]=list.get(i);   //Becuase if not possible that much amount of space will get deducted....
        }
        s.push(i);

    }
    return ans;

}