class Solution {
    public boolean isMiddleElementUnique(int[] nums) {


    //=========== EASY HE=============//
  
     
    // TC=O(n+m)
    //     int mid=nums[nums.length/2];
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         max=Math.max(max,nums[i]);

    //     }
    //     int freq[]=new int[max+1];
    //     for(int i=0;i<nums.length;i++){
    //         freq[nums[i]]++;
    //     }
    //    if(freq[mid]>=2){
    //     return false;
    //    }
    //    return true;
        
    //One more method to solve this

    // TC=O(n)

    int mid=nums[nums.length/2];
    int count=0;
    for(int i:nums){
        if(i==mid){
            count++;
        }
    }
      if(count>1){
            return false;
        }
       return true;

    }
}