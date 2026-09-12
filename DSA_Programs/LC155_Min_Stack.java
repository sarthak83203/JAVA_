import java.util.*;
class MinStack {
    Stack<Integer> s;
    Stack<Integer> st;

    public MinStack() {
        s=new Stack<>();
        st=new Stack<>();

        
    }
    
    public void push(int value) {
        if(st.isEmpty() || value<=st.peek()){
            st.push(value);
        }   
    }
    
    public void pop() {
        //important part
        //example is [5,3,7,2] and other one [5,3,2]
        if(s.peek().equals(st.peek())){
            st.pop();
        }
        s.pop();
        
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
          if(st.isEmpty()){
            return -1;
        }
        return st.peek();
        
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */