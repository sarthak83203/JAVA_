import java.util.*;
class Solution {

        //==================Oracle,Google,Apple,Amazon,Meta OA question=============//

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder(s);//aab isme hi update karte rahege
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
                //seeing the first example
                //1)in that last wala mismatch found hua to assign that as '*'
                
            }else if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    sb.setCharAt(i,'*');//mismatch found hua 
                }
            }
        }
        //this is for the starting agar opening he and closing nahi he to dono mismatch hua 
        while(!st.isEmpty()){//ye while loop isliye he ki agar maan lo ki s contains 
        //string like this "a((" 
        //beacuse here no closing brackets comes
            int index=st.pop();
            sb.setCharAt(index,'*');
        }
        
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='*'){
                ans.append(sb.charAt(i));
            }
        }
        return ans.toString();



        
    }
}