import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {


        //==============Amazon,Meta,Google===============//
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            // Mujhe freq ka index positive banana he isliye minus
            freq[nums[i]-min]++;//here min se minus kyuki i want to make positive index
        }

        for(int i=0;i<freq.length;i++){
           if(freq[i]>=1){
            list.add(min+i);//Adding original number now
           }
           if(freq[i]>=2){
            list.add(min+i);//now i am adding original number so min se add karo
           }

        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();


        
    }
}