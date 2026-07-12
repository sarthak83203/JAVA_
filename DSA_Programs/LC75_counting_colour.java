class Solution {
    public void sortColors(int[] nums) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);//want to take  the largest from the array
        }
        //counting sort technique
        int freq[]=new int[largest+1];//sortable array
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){//biggest mistake like keep only one occurance if i use if()
                nums[j]=i;
                j++;
                freq[i]--;
            }
        }



        
    }
}