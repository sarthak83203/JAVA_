public class total_subarray {
    public long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE;  //MAX ELEMENT
        int min=Integer.MAX_VALUE;  //MIN ELEMENT

        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
       
        //important converting one operant to long 
        return 1L * k * (max-min);

         
        
    }
    
}
