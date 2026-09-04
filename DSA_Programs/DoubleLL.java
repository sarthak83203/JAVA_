import java.util.*;
public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addfirst
    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;//ek node aya to size badhao aab
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;//isme prev bhi sambhalna padega 
    }

    //remove first
    public int removeFirst(int data){
        if(head==null){
            System.out.print("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){//agar ek node hoga to usse nikalna padega na isliye
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }



    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
        DoubleLL dll=new DoubleLL();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.print();

    }
    
}
