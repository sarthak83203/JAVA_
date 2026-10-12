class Solution {
    public int minMoves(int[] nums) {

        //==============Indeed,Adobe,Google===================//


        //Logical Question he 
        //isme question me bola he increase karna he par opposite agar socha to ans easily milege
        //Rather then incresing just start decreasing one element only 
        //we choose the smallest element that decreases the element with min operation
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            sum=sum+(nums[i]-min);

        }
        return sum;
        
    }
}