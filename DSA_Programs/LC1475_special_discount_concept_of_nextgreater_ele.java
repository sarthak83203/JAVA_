import java.util.*;
class Solution {
    public int[] finalPrices(int[] prices) {
        //Same logic of Next Greater element Stack me index save karne wala
        Stack<Integer> st=new Stack<>();
        int pri[]=new int[prices.length];
        //reverse loop isliye kyuki me sabhhi element ko analysis kar chuka hoga
        //which helps to decrease the complexity
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && prices[i]<prices[st.peek()]){
                st.pop();
                
            }
            if(st.isEmpty()){
                pri[i]=prices[i];
            }else{
                pri[i]=prices[i]-prices[st.peek()];
            }
            st.push(i);
        }
        return pri;
        
    }
}