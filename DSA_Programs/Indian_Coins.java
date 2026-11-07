import java.util.*;
class Solution {

    //This is basically the Greedy Approach 
    //DP Approach can also solve this question
    public int coinChange(int[] coins, int amount) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            list.add(coins[i]);
        }  
    
        Collections.sort(list,Collections.reverseOrder());//now the list is reversed
        int count=0;
        for(int i=0;i<list.size();i++){
            if(amount>=list.get(i)){
                while(amount>=list.get(i)){
                    count++;
                    amount=amount-list.get(i);
                }
            }
           
        } 
        if(amount!=0){
            return -1;
        }
        return count;
    }
}