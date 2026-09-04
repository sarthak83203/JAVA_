/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        //isme child pointer extra add he 
        //isme child he to usme niche niche jate raho agar last child node ho to child ke last tak chale jana
        //and jis node pe child milege uss node ke next ko store kara do
        //phir last child hoga to uske last tak jayege and uss last ko curr.next se join karege
        //par par isme ek chij check karni padegi ki next node null to nahi na
        //kyu ki aise case bhi ho sakta he jaise ki => 1<->2
            //                                             3<->4
            //aab ye 3 child he and 4 last node he child ka to isko last child wale node ko 
            //connect karege to kisse curr.next to null he to vohi se apna child pointer null hoga

        //now let's go

        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node next=curr.next;//store kar diya mene 

                //kya pata child ke bhi child ho sakte he (according to question so recursion)
                Node child=flatten(curr.child);//ye return karega to upne aap vo apni jagah aa jayega
                //every function has it's known local varibale agar recusrion hoga to sab kuch pehelese run hoga na to har ek ka alag local variable banega na

                curr.next=child;//connection ho gaya
                child.prev=curr;

                //node child list ko pura karo
                Node tail=child;
                while(tail.next!=null){
                    tail=tail.next;
                }
                
                tail.next=next;
                if(next!=null){
                    next.prev=tail;     
                }

                //at last all the child pointer will be null (according to question)
                curr.child=null;

            }
            curr=curr.next;//agar child nahi to age badhao easily
        }
        return head;
        
    }
}