import java.util.*;
class MyQueue {

  //==========================Google,MicroSoft OA Questions===================//



    Stack<Integer> st1;
    Stack<Integer> st2;
 
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
        
    }
    //This is the main logic of pushing element in two different stack for generation of Queue
    
    public void push(int x) {
        //Inshot jo current element he usse st1 me dalo and and other older elements will go
        //in st2
        
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        
    }
    
    public int pop() {
        if(st1.isEmpty()){
            return -1;
        }
        return st1.pop();

        
    }
    
    public int peek() {
        if(st1.isEmpty()){
            return -1;
        }
        return st1.peek();
        
    }
    
    public boolean empty() {
        if(st1.isEmpty()){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */