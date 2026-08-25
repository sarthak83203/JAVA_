import java.util.*;
public class LinkedList_add_middle {

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

    public void add(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;//prev tak pahuchne ka loop lagao
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }


    //adding first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;//important it will go infinite if it is not used then
        }

        newNode.next=head;
        head=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linkedlist is Empty Now");
        }
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList_add_middle ll=new LinkedList_add_middle();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.add(1, 54);
        ll.print();

        


    }
    
}
