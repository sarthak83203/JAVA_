import java.util.*;
class Solution {
    public int maximizeSum(int[] nums, int k) {

      //========== Amazon OA Question===========//

        // Arrays.sort(nums);
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int j:nums){
        //     list.add(j);
        // }
        // int sum=0;
        // for(int i=0;i<k;i++){
        //     int h=list.size()-1;
        //     sum+=list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     list.add(h+1);
        // }
        // return sum;
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            int h=list.get(list.size()-1);
            sum+=h;
            h++;
            list.add(h);

        }
        return sum;

        
    }
}