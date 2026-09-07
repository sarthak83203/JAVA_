public class Stack_implementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;

        public static boolean isEmpty(){
            return head==null;//if empty then head ko null bana dena

        }
        //push 
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){//agar stack khali he to head bana apna new Node
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        //pop
        public static int pop(){
            if(isEmpty()){//agar element nikal raha hu to dekhana padega ki linkedlist khali he ki nahi
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){//if nothing is there then nothing is top
                return -1;

            }
            return head.data;
        }
        
    }
    public static void main(String args[]){
        Stack s=new Stack();//this is object 
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){//run the loop until our stack is not empty
            System.out.println(s.peek());
            s.pop();

        }


    }
    
}
