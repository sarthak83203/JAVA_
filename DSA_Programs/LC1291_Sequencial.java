import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
         //In this question i have to do the sequencial pattern like 123->234..
         //now i will take the first loop as the length and second loop to see till where the //array goes
         ArrayList<Integer> list=new ArrayList<>();
         String s="123456789";//maximum up to 9 only
         for(int len=2;len<=9;len++){  //minimum two group will form
            for(int j=0;j<=9-len;j++){
                int y=Integer.parseInt(s.substring(j,j+len));
                if(y>=low && y<=high){
                    list.add(y);
                }
            }

         }
         return list;


        
    }
}