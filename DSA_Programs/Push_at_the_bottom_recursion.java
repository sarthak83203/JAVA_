import java.util.*;
public class Push_at_the_bottom_recursion {

    public static void pushAtBottom(Stack<Integer> s,int data){
        //ASK IN AMAZON
        //Approach 
        //isme top ko nikalte rahega and jab stack empty ho jayega tab vo apna jo data he usse push karega and then return karte hi
        //sare top jo top wale element he jo recursion stack me save hua the vo sab stack me add up hoge 
        if(s.isEmpty()){//isEmpty is function in Stack
            s.push(data);
            return;
        }
        int top=s.pop();//ye element ko remove karega and stored akrega kyuki recursion approach he isliye
        pushAtBottom(s, data);
        s.push(top);//after that recursion it will push all the element in it.

    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       

        pushAtBottom(s,4);
        //will verify
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
