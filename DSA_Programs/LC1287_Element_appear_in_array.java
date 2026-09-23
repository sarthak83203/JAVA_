class Solution {
    public int findSpecialInteger(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int len=arr.length;

        for(int i=0;i<freq.length;i++){
           if(freq[i]*100>len * 25) {//isme cross multiply kiya he kyuki bigger number ke liye easy ho jaye 
            //for bigger number division opeaartor doesn't work properly in java
                return i;
            }
            
        }
        return -1;

        
    }
}