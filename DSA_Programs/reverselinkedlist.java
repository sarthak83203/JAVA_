public class reverselinkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void addLast(int data){
        Node currNode=head;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;

    }

    //print
    public void print(){
        
        if(head==null){
            System.out.println("Empty nothing to print");
        }
        Node currNode=head;

        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");

    }

    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prev;


    }








    public static void main(String args[]){
        reverselinkedlist list=new reverselinkedlist();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.print();
        list.reverse();
        list.print();


    }
}