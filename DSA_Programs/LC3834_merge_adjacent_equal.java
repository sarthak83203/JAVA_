import java.util.*;
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> list=new ArrayList<>();

        // int i=0;
        // while(i<nums.length){
        //     if(i+1<nums.length && nums[i]==nums[i+1]){
        //         nums[i]=nums[i]+nums[i+1];
        //         long h=(long)nums[i];
        //         list.add(h);
        //         i+=2;
        //     }else{
        //         long y=(long)nums[i];
        //         list.add(y);
        //         i++;
        //     }
        // }
        // return list;

        //ye sochana thoda mushkil tha but thike
        
        // int i=0;
        // while(i<nums.length){
        //     long current=nums[i];
        //     i++;
        //     while(i<nums.length && current==nums[i]){
        //         current=current+nums[i];
        //         i++;
        //     }
        //     list.add(current);

        // }
        // return list;
        

        //Upper Two logic will work for only right part man(Remember hum piche nahi dekh rahe like in left side)
        //now the logic is make the arraylist of long as mention in question 
        //agar arraylist ka size bada he and arraylist ka last element 
        //nikalo and check karte raho baas
        
        //take the example of 2 1 1 2 you will easily get this logic(Nice logic of stack)
        for(long i:nums){
             while(!list.isEmpty() && list.get(list.size()-1)==i){
                i+=list.remove(list.size()-1);
        } 
           list.add(i); 
        }

        return list;   
    }
}