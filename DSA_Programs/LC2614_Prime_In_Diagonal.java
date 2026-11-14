class Solution {
    public int diagonalPrime(int[][] nums) {

        //=====Easy HE====//
        //============= IBM,Google OA Questions=============//

        int max=0;
        for(int i=0;i<nums.length;i++){
            //only ye dyan rakh ki nested loop ki jarurat nahi according to question
                boolean ui=prime(nums[i][i]);
                if(ui){
                    max=Math.max(max,nums[i][i]);
                }
                boolean uy=prime(nums[i][nums.length-i-1]);
                if(uy){
                    max=Math.max(max,nums[i][nums.length-i-1]);
                }
           
        }
        return max;

        
    }
    public boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}