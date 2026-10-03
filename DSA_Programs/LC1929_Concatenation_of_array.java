import java.util.*;
class Solution {
    //==================GOOGLE,APPLE,AMAZON
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int len=2 * nums.length;
        int arr[]=new int[len];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;

        
    }
}