class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                minEven=Math.min(minEven,nums1[i]);
            }else{
                minOdd=Math.min(minOdd,nums1[i]);
            }
        }
        if(minOdd==Integer.MAX_VALUE){//because all are even
            return true;
        }

        return minOdd<minEven;//can return true or false

        
    }
}