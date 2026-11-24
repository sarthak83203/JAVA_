import java.util.*;
class Solution {
    public int maxAdjacentDistance(int[] nums) {

        //========== Bloomberg,Google,Amazon OA Questions===========//
        //===========Easy he=============//
        int max=Integer.MIN_VALUE;
        int diff=Math.abs(nums[0]-nums[1]);
        for(int i=0;i<nums.length;i++){
            //to make it circular baas aage ka index (i+1)%nums.length hoga
            //because for first test case 1 2 4 if we are at 4 then i=2
            //(i+1)%length is 0 it comes to starting now
            if(Math.abs((nums[i]-nums[(i+1)%nums.length]))>diff){
                diff=Math.abs(nums[i]-nums[(i+1)%nums.length]);
            }
        }
        return diff;
        
    }
}