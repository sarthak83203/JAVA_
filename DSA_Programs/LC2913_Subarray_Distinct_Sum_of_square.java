import java.util.*;
class Solution {
    public int sumCounts(List<Integer> nums) {
        int res=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> set=new HashSet<>();//2 ke liye hashset will become empty for  1st test case
            for(int j=i;j<nums.size();j++){
                set.add(nums.get(j));
               int d=set.size();
               res+=d*d;
            }
        }
        return res;

        
    }
}