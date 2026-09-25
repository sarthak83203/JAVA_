import java.util.*;
class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        HashSet<String> set=new HashSet<>();
        set.add("0,0");
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
            y++;
        }else if(path.charAt(i)=='E'){
            x++;
        }else if(path.charAt(i)=='S'){
            y--;
        }else if(path.charAt(i)=='W'){
            x--;
        }
        String yu=x+","+y;
        if(set.contains(yu)){
            return true;


        }
        set.add(yu);

        }
        
       
        return false;
        
    }
}