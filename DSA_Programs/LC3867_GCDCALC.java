import java.util.*;
class Solution {
    public long gcdSum(int[] nums) {
        int arr[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr[i]=gcdcalc(nums[i],max);
        }
        Arrays.sort(arr);
        long res=0;
        int start=0;
        int end=nums.length-1;
        while(start<end){
            res+=gcdcalc(arr[start],arr[end]);
            start++;
            end--;
        }
        return res;




        
    }
    //GCD CALCULATION CODE
    public static int gcdcalc(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}