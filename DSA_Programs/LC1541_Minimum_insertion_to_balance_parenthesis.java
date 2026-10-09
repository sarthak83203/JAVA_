import java.util.*;
class Solution {
    public int minInsertions(String s) {
        Stack<Integer> st=new Stack<>();
        //=========JP Morgan,Amazon,Google============//
        int open=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
                
            }else{
                //if we take this example
                //( ()) )
                //so second open ke liye satisfied hua two opens
                //open -- hua
                //now open=1 ans last me 
                // for ) we are not having other ) so if condition does not satisfied
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;//agar two parenthesis aya to skip karo
                }else{
                    ans++;
                }
                if(open>0){
                    open--;//agar open >0 he iska matlab two parenthesis aa gaye so it satisfied so remove it 
                }else{
                    ans++;
                }
            }

        }
        return ans+open*2;

        
    }
}