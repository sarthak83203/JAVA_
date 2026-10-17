import java.util.*;
class Solution {
    //===============Zscaler,Paypal,Goldman Sachs OA question=============
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                ans+=nums[i-1]-nums[i]+1;//this is the number of moves
                nums[i]=nums[i-1]+1;//current element ko change karna padega
            }
        }
        return ans;

        
    }
}