import java.util.*;
public class Linkedlist_practise{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addlast(int data){
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

    public void Search(int data){
        int index=0; //Not found
        Node currNode=head;
        if(head==null){
            System.out.println("Empty");
        }
        while(currNode.next!=null){
            if(currNode.data==data){
                System.out.println(index);
                return;
            }
            currNode=currNode.next;
            index++;
        }

    }

    public void print(){
       
        Node currNode=head;
        if(head==null){
           System.out.println("Empty array");
        }
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){
        Linkedlist_practise list=new Linkedlist_practise();
        list.addlast(1);
        list.addlast(5);
        list.addlast(7);
        list.addlast(3);
        list.addlast(8);
        list.addlast(2);
        list.addlast(3);
        list.print();
        list.Search(7);


    }
}