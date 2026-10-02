import java.util.*;
class Solution {
    public String simplifyPath(String path) {

        //===============Oracle,Microsoft,Amazon,Open AI=======================//
        Stack<String> st=new Stack<>();
        String res="";
        res=res+'/';
        for(int i=0;i<path.length();i++){
            String dir="";
            while(i<path.length() && path.charAt(i)=='/'){
                i++;
            }
            while(i<path.length() && path.charAt(i)!='/'){
                dir+=path.charAt(i);
                i++;
            }
            if(dir.equals("..")==true){
                if(!st.isEmpty()){
                    st.pop();
                }

            }else if(dir.equals(".")){
                continue;//skip it
            }else if(dir.length()!=0){
                st.push(dir);

            }
        }

        Stack<String> st1=new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        while(!st1.isEmpty()){
             if(st1.size()!=1){//if the size is 1 it means baas ek hi path bacha he uske baad '/' nahi ayega to dierct pop it
            res+=(st1.pop()+"/");
            }else{
            res+=st1.pop();
        }

        }
       

        return res;



        
    }
}