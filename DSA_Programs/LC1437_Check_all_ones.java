class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev=-1;
        //isme prev index ko store kareke rakho and index ke hisab se kaam karo
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(prev!=-1){
                    int yu=i-prev-1;
                    if(yu<k){
                        return false;
                    }
                }
                prev=i;//prev index jaha 1 mila he
            }
        }
        return true;
        
    }
}