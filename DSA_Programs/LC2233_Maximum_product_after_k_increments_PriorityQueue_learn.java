import java.util.*;
class Solution {
    public int maximumProduct(int[] nums, int k) {

              
         //=========== Google,Infosys OA Questions===========//
         //====Is Question me Priority Queue ka Concept Revise hoga=====//

       
       //Mine mistake i am giving to only one element it should be discributed properly 
       //like taking one example =>[1,2,3]=> [3,3,3] and k=3
         
        // int min=Integer.MAX_VALUE;
        // int index=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //         index=i;
        //     }
        // }
        // nums[index]=min+k;
        // int pro=1;
        // for(int i=0;i<nums.length;i++){
        //     pro=pro*nums[i];

        // }
        // return pro;
        
      //This will give TLE Beacuse for each iteration i am sorting it will take lot of time

        // Arrays.sort(nums);
        // for(int i=0;i<k;i++){
        //     nums[0]++;
        //     Arrays.sort(nums);
        // }
        // long pro=1;
        // for(int i=0;i<nums.length;i++){
        //     pro=(pro*nums[i])%1000000007;

        // }
        // return (int)pro;

         //PriorityQueue
         //This gives the smallest  element at the top

         //For Priority Queue it will sort automatically

         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
         }

         //now i will remove one elemnt and add 1 to it and append it in PriorityQueue
         //Mistake sudharo ek ko pura mat do just distribute karte raho jab tak k ki value alive he
         for(int i=0;i<k;i++){
            int x=pq.poll();
            pq.add(x+1);
         }
         long pro=1;
         while(!pq.isEmpty()){
            pro=(pro*pq.poll())%1000000007;//the remainder is important because int will get overflow
            //multiplication will get large value can return modulo as given in Question
         }
         return (int)pro;

    
        
    }
}