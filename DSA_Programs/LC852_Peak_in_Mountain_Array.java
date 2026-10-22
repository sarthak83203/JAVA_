class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //Logical Question

        //========Qualcomm,Amazon,Google,DE Shaw=============//
        //agar jyada information nahi di ho to mid se hi question solve ho jayega
        int start=1;//because this is mountain array so the peak element 1st and last me nahi hoga
        int end=arr.length-2;
        while(start<=end){//'=' ayega because start and end ek jagah aakar vohi peak ho sakta he
        //see first test case
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;//agar mid dono adjacent element se badha hoga to return mid
            }
            if(arr[mid]>arr[mid-1]){
                start=mid+1;//exist in right side
            }else if(arr[mid]<arr[mid-1]){
                end=mid-1;//exits in left side
            }
        }

        return -1;
     
        

        
    }
}