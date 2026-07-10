class Solution {
    //in this the question is counting of strictly largest and smallest element 
    //so my approach is to find the largest and smallest elelment and it should not be counted as strictly greater and smaller
    public int countElements(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=smallest && nums[i]!=largest){
                count++;
            }
        }
        return count;

        
    }
}