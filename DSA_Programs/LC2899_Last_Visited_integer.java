import java.util.*;
class Solution {
    //this Approach is O(n^2)
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> seen=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]>0){
                seen.add(0,nums[i]);//ye zero pe add hote rahega and element ek ek position aage badege
                count=0;//this mistake i am doing
            }else{
                count++;
                 if(count>seen.size()){
                   ans.add(-1);
                 
            }else{
                ans.add(seen.get(count-1));

            }
                
            }
        }
       return ans;
        
    }
}