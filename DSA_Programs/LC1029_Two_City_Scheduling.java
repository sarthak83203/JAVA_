import java.util.*;
class Solution {
    public int twoCitySchedCost(int[][] costs) {

        //========== Bloomberg,Swiggy,Google,Amazon OA Questions============//
     
        //isme meri galti ye thi ki me direct dekhne chala gaya kitne element chote he each row me 
        //but the question is something else=>READ IT PROPERLY
        //Once Thihnnk about the diffrence like 
        //agar diffrence liya to pehele two city's A jayege and 
        //Dusre two city's B jayege
        //Once dry run it pata chalega ki agar difference liya he to 1st half jo hoga 
        //vo minimum cost wala hoga and second half city's jo he vo col 2 ke elements minimum hoge
        //DRY RUN
        //10 20 diff=>-10
        //30 200 diff=>-170
        //400 50 diff=>350
        //30 20 diff=>10
        
        //now sort them accroding to diff
        //30 200
        //10 20
        //30 20
        //400 50
        //now see properly baas half tak jaao city's A col 0 is minimum
        //same for city's B col 1 is minimum

        //for sorting using Lambda Function

        //BAAS EK FUNDA HE DIFF KE BASIS PE SORTING 

        Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1])); //ye ascending sorting he
        //diff lena he a[0]-a[1] ascending lena he b[0]-b[1] ye chiz hoti he

        int n=costs.length;
        int sum=0;
        for(int i=0;i<n/2;i++){//now taking 1st col
            sum+=costs[i][0];
        }
        for(int i=n/2;i<n;i++){
            sum+=costs[i][1];
        }
        
        return sum;







        // int sum=0; 
        // for(int i=0;i<costs.length;i++){
        //     int min=Integer.MAX_VALUE;
        //     for(int j=0;j<costs[0].length;j++){
        //         min=Math.min(min,costs[i][j]);
                
        //     }
        //     sum=sum+min;
        // }
        // return sum;
        
    }
}