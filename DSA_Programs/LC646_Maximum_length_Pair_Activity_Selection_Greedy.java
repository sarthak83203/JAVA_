import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {

        
        //============ Amazon,Google ONLY OA Questions=============//

        //This question has same concept of non-overlapping LC435
        //just similar to Activity Selection
        //1st sorting based on the second number means ending point 
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int maxAct=0;
        maxAct=1;//consider the first activity beacause after sorting the first chain will be small itself
        //isme same concept he ki jitna jyada jaldi activity ho utna jyada count
        int lastEnd=pairs[0][1];
        //agar samajna ho to notes refer kar 
        //Inshot staright line bana and points ko plot kar apne aap samaj jayega
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastEnd){
                maxAct++;
                lastEnd=pairs[i][1];//col 1 is ending point
            }
        }
        return maxAct;
        
    }
}