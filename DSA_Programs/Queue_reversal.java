import java.util.*;
import java.util.LinkedList;
public class Queue_reversal {
    //Reversing of Queue using Stack
    public static void reverseQueue(int arr[]){
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        // while(!q.isEmpty()){
        //     System.out.print(q.remove()+" ");
        // }
        System.out.print(q);//direct print also possible

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        reverseQueue(arr);

    }
    
}
