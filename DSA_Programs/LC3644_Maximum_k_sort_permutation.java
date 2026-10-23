import java.util.*;
class Solution {
    //============Amazon==============//
    public int sortPermutation(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Collections.sort(list);
        int k=-1;
        //hum directly likh nahi sakte ki k&=list.get(i) & nums[i] kyuki k=-1 can't process AND operator properly
        for(int i=0;i<nums.length;i++){
            if(list.get(i)!=nums[i]){
                if(k==-1){//this is for finding the first mismatched 
                    k=list.get(i) & nums[i];

                }else{
                    k&=list.get(i) & nums[i];//then finding the first mismatched then we process first + further mismatch
                }
                
            }
        }
        if(k==-1){
            return 0;
        }
        return k;

        
    }
}