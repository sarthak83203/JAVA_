import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        int start=0;
        int end=numbers.length-1;
        while(start<end){
           int sum=numbers[start]+numbers[end];
           if(sum==target){
               list.add(start+1);
               list.add(end+1);
               break;//because when it comes to 2 and seven that is 0<1 which is true then it will go for infinite loop for this case

           }else if(sum<target){
            start++;

           }else{
            end--;
           }
           
        }
        int arr[]=new int[list.size()];
        int j=0;
        for(int num:list){
            arr[j++]=num;
        }
        return arr;
        
    }
}