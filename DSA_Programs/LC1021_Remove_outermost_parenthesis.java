import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        //isme pehele to dekho ki stack empty he ya bhara hua he 
        //phir baad me agar size 0> ho to string me append karna phir pehela wala bracket aise hi rah gaya
        //phir jab closing hoga tab tab pehele nikalna kyuki last wala string me nahi jayega phir
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(st.size()>0){
                    sb.append('(');
                }
                st.push('(');
            }else{
                st.pop();
                if(st.size()>0){//last me jo bacha hoga usko pehele hataya baad me condition check 
                    sb.append(')');
                }
            }
        }
        return sb.toString();



       
        
        
    }
}