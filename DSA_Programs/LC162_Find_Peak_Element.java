class Solution {
    public int findPeakElement(int[] nums) {
        //============zepto,Meta,Samsung,PayPal and Many more Company's OA Question==========//
        int start=0;
        int end=nums.length-1;
        if(nums.length<2){
            return 0;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //so go left side
                end=mid;//mid khud bhi peak element ho sakta he 
                
            }else{
                //go right side
                start=mid+1;//now it will start from mid+1

            }
            
        }
        return start;
        
        
        
        
        
    }
}