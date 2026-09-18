import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int y=Math.abs(arr[i]-arr[i+1]);
            if(y<min){
                min=y;
                res=new ArrayList<>();//minimum pai hi chahiye agar pichle wale se min aya to usse nikal do
                res.add(Arrays.asList(arr[i],arr[i+1]));//Arrays ko direct List me convert karne ka tarika (remember it)

            }else if(y==min){
                res.add(Arrays.asList(arr[i],arr[i+1]));

            }

        }
        return res;


        
    }
}