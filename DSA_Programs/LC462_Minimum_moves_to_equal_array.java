import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {
     
       //=========Adobe,Google,Amazon===========//
        //Logical Question


        //====Remember the pattern agar sare element ko array me equal karna he to look for min,median(Sorted),second max==
        //then jo satisfy kiya uske sath minus karke sabka sum nikalo baas
        //Mine mistake i am looking for second largest 
        //but we need to look for median after sorting
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        //Aisa element choose karo jo number nums[i] ko decrease karte chale minimum karne ke liye
        //same type ka question jisme min element se decrease karna tha

        int re=nums[nums.length/2];//ok my mistake is i am taking second largets element but we have to take median 
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+Math.abs(nums[i]-re);

        }
        return sum;

        
    }
}