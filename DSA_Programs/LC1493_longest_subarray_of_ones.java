class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zeroes=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
            //isme ek hi funda he baas ek zero ke liye dekho agar dusra aye to left pointer ko aage badhao
            //in this question i am looking for all ones+one zero 
            while(zeroes>1){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max-1;

        
    }
}