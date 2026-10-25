import java.util.*;
class Solution {
    //==============Google OA question===================//
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String u=String.valueOf(nums[i]);
            
            char a[]=u.toCharArray();
            for(int j=0;j<a.length;j++){
                int ui=Integer.parseInt(String.valueOf(a[j]));//Integer.parseInt string pe use hota he
                list.add(ui);
            }
            // while(u>0){
            //     int r=u%10;
            //     list.add(r);
            //     u=u/10;
            // }
        }
        int arr[]=new int[list.size()];
        int j=0;
        for(int i:list){
            arr[j++]=i;

        }
        return arr;
        
    }
}