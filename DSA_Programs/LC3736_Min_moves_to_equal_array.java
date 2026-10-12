class Solution {
    public int minMoves(int[] nums) {

      //=====Adobe OA questions=====//

        //isme maximum liya he aab
        //Aisa element find karo jisse hum har ek nums[i] me jakar minus kare usse number of operation pata chale
        //vo number min,max,median(Sorted) ho sakta he
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(max-nums[i]);
        }
        return sum;
            
        
        
    }
}