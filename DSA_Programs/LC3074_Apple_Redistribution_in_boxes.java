import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        //========== Apple,Bloomberg,Google OA Questions==========//
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int y=0;
        for(int i=capacity.length-1;i>=0;i--){
            y+=capacity[i];
            if(sum>y){
                list.add(capacity[i]);
            }else{
                list.add(capacity[i]);
                break;
            }
        }
        return list.size();
        
    }
}