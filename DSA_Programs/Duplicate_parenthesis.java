import java.util.*;
public class Duplicate_parenthesis {
    public static boolean Duplicate(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            //ok like hum closing ka dekh lete he opening me bahut sare condition he isliye
            char ch=str.charAt(i);
            int count=0;//kyuki count vapis is 0 se chalu hooga pop ke baad
            if(ch==')'){
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;//yes the duplicate exists
                }else{
                    st.pop();//opening wala bhi nikal do hum while loop se uske tak pahuche the
                }
            }else{
                st.push(ch);//opening,closing,operand sub kuch isme aa gaya and it is push to stack
            }
        }
        return false;



    }
    public static void main(String args[]){
        String str1="((a+b)+(c+d))";
        String str2="((a+b))";
        System.out.println(Duplicate(str2));

    }
    
}
