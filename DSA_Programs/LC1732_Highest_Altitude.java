import java.util.*;
class Solution {

    //========== Zoho,Amazon,Google,Bloomberg OA questions===========//
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<gain.length;i++){
            list.add(list.get(i)+gain[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i:list){
            max=Math.max(max,i);
        }
        return max;

        
    }
}