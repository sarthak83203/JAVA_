import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        for(int num:nums){
            list.add(num);
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum=sum+nums[i];
            }else{
                break;
            }
        }
        while(list.contains(sum)){
            sum++;
        }
        return sum;

        
    }
}