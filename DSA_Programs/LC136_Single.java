class Solution {
    public int singleNumber(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int freq[]=new int[max-min+1];//beacause zero comes in my case 
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                return i+min;
            }
        }
        return -1;

        
    }
}