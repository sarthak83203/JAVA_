import java.util.*;
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        //Logical Questions
        ArrayList<Boolean> list=new ArrayList<>();
       
        ArrayList<Integer> list1=new ArrayList<>();
        int rem=0;
        for(int i=0;i<nums.length;i++){
            //this is the major part of the question
            //in this question IntegerparseInt will not work for bigger input
            //if we put the each number in this expression we will get expected Decimal Number
            rem=(rem*2+nums[i])%5;//isme just ek-ek number dalkar check karo test case match hoga (this we have to think mathematically)
            list1.add(rem);
        }
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)==0){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
        
    }
}