class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        //assuming here two lines  L1 and L2
        //L1 increases from 4->7 and L2 from 0->2
        //if the mid lie on the L1 then check the left part
        //if the mid lie on the right part search in right part
        //this is modified Binary Search
        
        while(start<=end){
            int mid=start+(end-start)/2;//in loop
            if(nums[mid]==target){
                return mid;
            }
            //now left case 
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>=target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else{
                if(nums[mid]<=target && nums[end]>=target){
                    start=mid+1;

                }else{
                    end=mid-1;
                    
                }

            }
            
        }
        return -1;
         
        
    }
}