import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> result=new ArrayList<>();
        int current=1;
        for(int i=0;i<target.length;i++){
            while(current<target[i]){//agar equal to hoga to direct push  hoga without any condition
                result.add("Push");
                result.add("Pop");
                current++;
            }
            result.add("Push");
            current++;

        }
        return result;
        
        
    }
}