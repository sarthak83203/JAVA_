import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        
        int index=0;
        int arr[]=new int[k];
        for(int f=nums.length;f>=1;f--){
            for(int i=0;i<freq.length;i++){
                if(freq[i]==f){
                    //isme me freq of 1 is storing at index zero now 
                    //inshot index ke sath khela gaya he beacause of the negative numbers in array
                    //actual number:  -2  -1   0   1   2   3
                      //               ↓   ↓   ↓   ↓   ↓   ↓
                    //freq index:      0   1   2   3   4   5//isme min se minus karke ye sab huua he



                    arr[index]=i+min;
                    index++;
                }
                if(index==k){
                    return arr;
                }
            }

        }
        return arr;

        



        
        
    }
}