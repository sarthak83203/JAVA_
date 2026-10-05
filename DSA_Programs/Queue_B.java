import java.util.*;
public class Queue_B {
    public class Queue{
        static Stack<Integer> st1=new Stack<>();
        static Stack<Integer> st2=new Stack<>();

        // public static boolean isEmpty(){
        //     return st1.isEmpty();
        // }
        //add data
        public static void add(int data){
            while(!st1.isEmpty()){
                st2.push(st1.pop());

            }
            st1.push(data);
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }

    }
    
}
