import java.util.*;
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        //In this question i want to find the maximum substring continious
        //Approach
        //first put the element -1 in the stack
        //1st test case=>"(()"
        //so put st[-1,0,1] now else part remove that 0 from the stack now stack ia not empty
        //st becomes[-1,0] now index i=2 is ')' then 2-st.peek() that gives 2 we have to do same  process till we can't found the maximum substring(Continous)
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    max=Math.max(max,i-st.peek());

                }
            }
        }
        return max;
        
    }
}