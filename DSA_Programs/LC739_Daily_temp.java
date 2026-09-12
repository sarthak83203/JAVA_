import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //this is the concept of Next greater Element
        //use the Backward look kyuki sub element analysis hone chahiye 
        //stack me hum index dalte rahege
        //and we will create one array in which the number of the days will come
        //the main reason is going backward is like if we go from forward we have to see the all the element  which takes the complexity of O(n^2)

        Stack<Integer> st=new Stack<>();
        int temp[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i]=0;

            }else{
                temp[i]=st.peek()-i;
            }
            st.push(i);
        }
        return temp;

        
    }
}