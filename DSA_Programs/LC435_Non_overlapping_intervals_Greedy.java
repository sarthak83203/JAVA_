import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //so here the end times are not sorted we have to sort that first

        //========== Visa,JP Morgan,Snowflake,Oracle,Goldman Sachs and many more Company's OA Questions============//

        int n=intervals.length;
        //sorting done based on the end 
        //this is the concept of lambda function
        Arrays.sort(intervals,Comparator.comparingDouble(o->o[1]));
        //Always first Activity should be done
        int maxAct=1;
        int lastEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastEnd){
                maxAct++;
                lastEnd=intervals[i][1];//cols are fixed only row changes

            }

        }
        return n-maxAct;
        


        
        
    }
}