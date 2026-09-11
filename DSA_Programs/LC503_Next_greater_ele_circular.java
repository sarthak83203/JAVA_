import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //important question for interview 
        //Circular Approach
        //isme stack ka concept use hoga and Logic is most important
        //pehele to brute force lagao easy 
        //Real Interview Approach 
        //now tum loop backward lagao the main reason behind is that kyuki tum pehele se hi
        //elements ko pehelese hi analysis kar chuke hoge 
        //Aur Stack me hamesha index push hoga (main important) kyuki index se track karna easy hota he compare to value
        
        //lets go

        Stack<Integer> st=new Stack<>();
        int greater[]=new int[nums.length];
        //in question they told circular to circular ke liye ek trick he ki % lelo len ke sath
        for(int i=2*nums.length-1;i>=0;i--){//circular he to mujhe 1st element ko dekhna padega 
        int index=i%nums.length;//ye baas arrat me fix karne ke liye kiyya gaya he
            while(!st.isEmpty() && nums[st.peek()]<=nums[index]){
                //agar curr element ki value jyada he to nikalo
                //take the example of [6,8,0,1,3]
                st.pop();
            }
            if(st.isEmpty()){
                greater[index]=-1;
            }else{
                greater[index]=nums[st.peek()];//kyuki stack me element nahi index store he 
            }
            st.push(index);//push karo current element ka index
        }
        return greater;


        
        
    }
}