import java.util.*;
class Solution {
    public int getMaximumGenerated(int n) {
        //============Verizon,Amazon,Google==========//
        if(n==0){
            return 0;
        }
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=1;2*i<=n;i++){//all this condition are given in question
        //1 because in test case i is starting with 1
        //2*i and 2*i+1 given in question
            arr[2*i]=arr[i];
            if(2*i+1<=n){//read the question properly
                arr[2*i+1]=arr[i]+arr[i+1];

            }
            
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
        
        
        
    }
}