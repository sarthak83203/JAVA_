import java.util.*;
class Solution {
    public static void findSubset(int nums[],ArrayList<Integer> ans,int i,List<List<Integer>> result){
        if(i==nums.length){
            //ye same he like subset me include karna he ki nahi 
            //now isme new ArrayList isliye banana padha kyuki result and ans ek hi jagah point kar raha tha agar direct ans likhu to output change ho jayega
            //In shot we will not get our expected output
            result.add(new ArrayList<>(ans));
            return;
        }
        //yes we want to include in subset then
        ans.add(nums[i]);
        findSubset(nums,ans,i+1,result);//real recurssion

        //NO we don't want
        ans.remove(ans.size()-1);
        findSubset(nums,ans,i+1,result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        //this is the concept of the backtracking
        //now isme hum ek function banyege jisse question easy hoga solve karne me
        List<List<Integer>> result=new ArrayList<>();
        findSubset(nums,new ArrayList<>(),0,result);


        return result;




        
        
    }
}