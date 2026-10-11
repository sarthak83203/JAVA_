class Solution {
    public int minOperations(int[] nums) {
        //=====================Uber,Amazon,Google===================
        //TC=O(n)
        int count=0;
        //this loops takes O(N)
        for(int i=0;i<nums.length-2;i++){//because we want the window size of 3
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){//this nested loop takes O(n*3) 
                //because whenever triggers takes window size of 3
                    nums[j]=1-nums[j];//pehele to 1 banao baki 0 bane to unpe bhi vapis traverse karege

                }
                count++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return -1;
            }
        }
        return count;
        
    }
}