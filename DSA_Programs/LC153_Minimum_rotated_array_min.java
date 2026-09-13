import java.util.*;
class Solution {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     min=Math.min(min,nums[i]);

        // }
        // return min;
        //Minimum Sorted Array me Binary search se easily find kar sakte he ki Minimum element konsa he
        int low=0;
        int high=nums.length-1;
        while(low<high){
            if(nums.length==1 || nums[0]<nums[nums.length-1]){
                return nums[0];//minimum pehela element hi hoga
            }
            int mid=low+(high-low)/2;
            if(nums[mid]<=nums[high]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        
    }
}