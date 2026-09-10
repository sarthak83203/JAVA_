import java.util.*;
public class Stock_span_prob_impt {
    public static void spanStock(int stock[],int span[]){
        Stack<Integer> st=new Stack<>();//isme prevhigh index store hoga 
         span[0]=1;
         st.push(0);//assuming pehela element high hoga
         for(int i=1;i<stock.length;i++){
            int curr=stock[i];
            while(!st.isEmpty() && curr>stock[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);//be-aware ki stack ke andhar current index jayega

         }

    }
    public static void main(String args[]){
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        spanStock(stock,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
    
}
