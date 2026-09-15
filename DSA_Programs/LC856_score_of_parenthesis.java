import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) {
        //Initially Score zero hoga stack me 
        Stack<Integer> st=new Stack<>();
        st.push(0);//Intially stack will be initialize as 0
        int score=0;
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch=='('){
                st.push(0);
             }else{
                int value=st.pop();//pop isliye ki me element ko nikal kar prev se add kar saku
                if(value==0){//kyuki '(' wala mil gaya
                    value=1;
                }else{
                    value=value*2;
                }
                int prev=st.pop();
                st.push(prev+value);
             }
             

        }
        return st.peek();

        
    }
}