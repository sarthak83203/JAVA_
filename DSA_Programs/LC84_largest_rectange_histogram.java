import java.util.*;
class Solution {


             //========================================//
             //Microsoft,FaceBook,Paytm OA Question
             //========================================//



    //Approach
    //isme nextSmaller from right and next smaller from left nikalege
    //ye bilkul similar he "Next Greater Element" se but isme thoda twist like ulta karna he
    //to mene  next smaller from left and next smaller from right ko store kar liya in two arrays
    //Next smaller nikalna utna Hard nahi baas ye logic sochna thoda mushkil tha
    //To next smaller nikalne ke liye stack ka use kiya
    //Important Stack me baas Index jayega Element nahi 
    //And jaise hi next smaller from left and right array me store hote hi hum width nikalege
    //width hogi j-i-1 means j is nextsamller from right and 'i' is next smaller from left 
    //just understand the left and right kaise lena he
    //and baas current height ko loo and width se multiply kar lena
    public int largestRectangleArea(int[] heights) {
        int nextrl[]=new int[heights.length];
        int nextle[]=new int[heights.length];
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){//isme me nextrl
           while(!st1.isEmpty() && heights[i]<=heights[st1.peek()]){//because agar duplicate height ayi to phir '=' sign lagana padega
            st1.pop();
           }
           if(st1.isEmpty()){
            nextrl[i]=heights.length;
             
           }else{
            nextrl[i]=st1.peek();
           }
           st1.push(i);

        }
         for(int i=0;i<heights.length;i++){//isme me nextle
           while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           }
           if(st.isEmpty()){
            nextle[i]=-1;
             
           }else{
            nextle[i]=st.peek();
           }
           st.push(i);
        }
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nextle.length;i++){
            int height=heights[i];
            int width=nextrl[i]-nextle[i]-1;
            max=Math.max(max,height*width);
        }
        return max;


        
    }
}