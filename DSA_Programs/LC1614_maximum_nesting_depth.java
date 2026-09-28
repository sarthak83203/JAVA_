import java.util.*;
class Solution {
    public int maxDepth(String s) {


        //====================Amazon,Google,Intel=================//
        //just noticed from the question hat baas apne paas three parenthesis is open he 
        //baas un open walo ko count karo and max me store karo 
        //just we have to see the open parenthesis
        //so i we see the first test case 8 tak maximum depth 3 hoga
        //(important) maximum  depth we want
        Stack<Character> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char d=s.charAt(i);
            if(d=='('){
                st.push(d);
                max=Math.max(max,st.size());//kitna maximum open ho sakta he 
            }else if(d==')'){
                st.pop();
            }
        }
        return max;
        
    }
}