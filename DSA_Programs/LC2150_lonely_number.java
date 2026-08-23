import java.util.*;
class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int freq[]=new int[1000001];
        
        for(int num:nums){
            set.add(num);
            freq[num]++;
        }
        ArrayList<Integer> retri=new ArrayList<>(set);
        for(int i=0;i<retri.size();i++){
            int u=retri.get(i)+1;
            int v=retri.get(i)-1;
            if(freq[retri.get(i)]==1 && !set.contains(u) && !set.contains(v)){
                list.add(retri.get(i));
            }
        }
        return list;
        
    }
}