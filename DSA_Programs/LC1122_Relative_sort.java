class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len=1001;
        int count[]=new int[len];
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]++;
        }
        int idx=0;
        for(int i:arr2){
            while(count[i]>0){
              arr1[idx++]=i;
              count[i]--;
            }
        }
        for(int i=0;i<len;i++){
            if(count[i]==0){
                continue;
            }
            while(count[i]>0){
                arr1[idx++]=i;
                count[i]--;

            }
        }
        return arr1;

        
    }
}