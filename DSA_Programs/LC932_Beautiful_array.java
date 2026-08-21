import java.util.*;
class Solution {
    public int[] beautifulArray(int n) {
        //logic is different you should see before OA rounds
        //yaha par hum odd and even method use karege ArrayList ke sath 
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        while(list.size()<n){
            ArrayList<Integer> next=new ArrayList<>();
            //see for Odd one
            for(int num:list){
                int x=2*num-1;
                if(x<=n){
                    next.add(x);

                }
            }
            //see for even one
            for(int num:list){
                int x=2*num;
                if(x<=n){
                    next.add(x);

                }
            }
            list=next;
        }
        int arr[]=new int[list.size()];
        int j=0;
        for(int num:list){
            arr[j++]=num;
        }
        return arr;
        
        
    }
}