import java.util.*;
class Solution {
    public List<Integer> intersection(int[][] nums) {
        //Time Complexity=>O(n*m)
        ArrayList<Integer> list=new ArrayList<>();
        int count[]=new int[1001]; 
        for(int arr[]:nums){//pehele wale row ko arr me dala
           for(int i:arr){//phir uss array me traverse karo
             count[i]++;
           }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==nums.length){//nums.length he kitne row he mere paas aab
                list.add(i);
            }
        }
        return list;



    }
}