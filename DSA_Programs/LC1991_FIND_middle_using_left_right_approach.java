class Solution {
    public int findMiddleIndex(int[] nums) {
        //Remember one Appraoch agar ek hi array me tumhe middle part nikalna ho to
        //LeftSum and rightSum appraoch pata kar lena (Easy Appraoch he)
        //iss Approach me right Sum me pura sum dalo phir baad me har ek element par jakar
        //right se element nikal kar left se compare karo baas

        //lets go
        int sum=0;
        for(int i:nums){
            sum=sum+i;
        }
        //to understand take this Example=> 1 7 3 6 7 6
        //in this if we are on 7 then remove seven and compare sum of left and rightone
        //rightone is having all the things so we have to just subtract....
        //like agar 7 ko nikala to  3 6 7 6 ka hi sum bacha in right one
        int leftSum=0;
        int rightSum=sum;
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum=leftSum+nums[i];
        }
        return -1;

    }
}