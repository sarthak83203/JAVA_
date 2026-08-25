public class LinkedList_practise_after {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    //here methods will come now
    public void addFirst(int data){//isme static nahi use hoga because hum linklist object se call laga rahe he na liye
        //step1:create an node
        Node newNode=new Node(data);  //Node class ka naam he

        if(head==null){
            head=tail=newNode;
            return;

        }
        //step2:new node ke next=head this is joining process now
        newNode.next=head;//link now bole to isme address aa gaya he

        //step3=new node abhi head ban jaye
        head=newNode;




    }
    
    //addLast
    public void addLast(int data){
          //step1:create a new Node
        Node newNode=new Node(data);
        
        if(head==null){//agar linkedlist khali he to by default apneko head ko hi null manana he
            head=tail=newNode;
            return;

        }
      
        //step2:tail ko point karo newNode pe
        tail.next=newNode;

        //step3:now make the last node as tail
        tail=newNode;


    }





    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp=head; //never change the head and tail in the linkedlist just take thhe temp and solve 
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){
        LinkedList_practise_after ll=new LinkedList_practise_after();
        // ll.addFirst(1);
        // ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.print();



    }

    
}
