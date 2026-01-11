public class LinkedList{
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;

        }

        newNode.next=head;
        head=newNode;


    }
    //adding last
    public void addLast(String data){
        Node newNode=new Node(data);
        Node currNode=head;
        if(head==null){
            head=newNode;
            return;

        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //deleteFirst

    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty list");
        }
        head=head.next;
    }


    //deleteLast

    public void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){ //here hidden case like if head.next==null
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
    }









    //printing element...

    public void print(){
        if(head==null){
            System.out.print("Empty Linklist");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addFirst("Sarthak");
        list.addFirst("Shinde");
        
       
        list.addLast("Shweta");
        list.addLast("Aarti");
        list.print();
        list.deleteFirst();
        list.print();

        

    }
}