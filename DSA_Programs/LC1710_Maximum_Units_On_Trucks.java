import java.util.*;
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

       //=========== IBM,JP Morgan,SalesForce,Amazon OA Questions=============//

        //this is the concept of the fractional Knapsack
        //in this weight and ratio is given
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        //Java's type inference ambiguous
        // Arrays.sort(boxTypes, Comparator.comparingDouble((int[] a) -> a[1]).reversed());
        int result=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>=boxTypes[i][0]){//take full 
                result+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
                
            }else{
                result+=truckSize*boxTypes[i][1];//[i][1] is the ratio one
                truckSize=0;
                break;

            }
        }
        return result;
        

        
    }
}