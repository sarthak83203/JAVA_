class Solution {
    public int minimumDeletions(int[] nums) {
        //first time me logic click nahi hua tha nice question expected (Interview Question)
        //isme delete karna he like three cases possible he
        //1)Remove from the left only
        //2)Remove from the right only
        //3)Remove from each side now
    

        //aab isme calculate karte he min and max ka index
        //phir jabhi calculate karo to isme 1st case le to minindex=5 and maxindex=1
        //par isme ulta he agar mujhe left se sabhi delete karna hoga to kasie karuga
        //phir ek solution he two variable le lo jisme left and right me minindex and maxindex
        //aab hum value se nahi to index ke hisab se dekh rahe he
        
        int minIndex=0;
        int maxIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIndex]){
                minIndex=i;
            }
            if(nums[i]>nums[maxIndex]){
                maxIndex=i;

            }
        }
        //so yaha pe ata he left and right wala isme left me minIndex ko dalo and right me maxIndex ko dalo tabhi hum pata kar payegi ki fronnt and back se kaise delete hoga
        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);

        //remove from the front
        int option1=right+1;//+1 because of the zero index
        
        //remove from the back
        int option2=n-left;
        //remove from each side
        int option3=(left+1)+(n-right);//dono se delete karo left and right both

        return Math.min(option2,Math.min(option1,option3));



        
    }
}