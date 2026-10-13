import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i+=2){
    //         if(nums[i]<nums[i+1]){
    //             int temp=nums[i];
    //             nums[i]=nums[i+1];
    //             nums[i+1]=temp;  
    //    }      
    //     }
    //     long sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(i%2==0){
    //             sum=sum+(long)(nums[i]*nums[i]);
    //         }else{
    //             sum=sum-(long)(nums[i]*nums[i]);
    //         }
    //     }
    //     return sum;

    //So here my mistake is i am swapping the original number
    //sqaure element ko array me store kiya 
    //and usse sort kiya first half ko subtract and second half ko add 
    //Baas ye socho ki mid lena padega
    long arr[]=new long[nums.length];
    for(int i=0;i<nums.length;i++){
        arr[i]=(long)nums[i]*nums[i];
    }
    Arrays.sort(arr);
    int mid=arr.length/2;
    long sum=0;
    for(int i=0;i<mid;i++){
        sum-=arr[i];
    }
    for(int i=mid;i<nums.length;i++){
        sum=sum+arr[i];

    }

    return sum;

        


        
    }
}