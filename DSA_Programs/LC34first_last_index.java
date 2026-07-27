class Solution {
    public int[] searchRange(int[] nums, int target) {
        //this approach will not work like if i found in one side then it is not work for few testcase
    //    int first=-1;
    //    int second=-1;
    //     int  start=0;
    //     int end=nums.length-1;
    //     while(start<=end){
    //         if(first==-1 && nums[start]==target){
    //             first=start;
    //         }
    //         if(second==-1 && nums[end]==target){
    //             second=end;
    //         }
    //          start++;
    //          end--;
    //     }
    //     return new int[]{first,second};
    int first=-1;
    int second=-1;

    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            first=i;
            break;
        }
    }
    for(int i=nums.length-1;i>=0;i--){
        if(nums[i]==target){
            second=i;
            break;
        }
    }
    return new int[]{first,second};

       
       
       
        
    }
}