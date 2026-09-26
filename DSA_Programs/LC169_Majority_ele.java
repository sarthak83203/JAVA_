class Solution {
    public int majorityElement(int[] nums) {
       
        //This is Brute Force takes O(n^2) which gives TLE
        // for(int i=0;i<nums.length;i++){
        //      int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return 0;
        
        //To solve this problem their is one method call Boyer Moore Voting Algo TC=>(O(n))
        int count=0;
        int candidate=0;
        //here candidate represents i am assuming this is the majority element
        for(int i=0;i<nums.length;i++){
            if(count==0){//iske matlab uska vote khatam hua he now assuming other element as candidate and calculate the vote
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }

        }
        return candidate;
      
       
        
    }
}