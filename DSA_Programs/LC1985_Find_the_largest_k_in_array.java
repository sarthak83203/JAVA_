import java.util.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {

     //========================Google OA Question===================//


        //this will not work for the larger number
        // ArrayList<String> list=new ArrayList<>();
        // for(String s:nums){
        //     list.add(s);
        // }
      //this  approach will not work as java sort the string by character by character
        // Collections.sort(list,Collections.reverseOrder());
        // return list.get(k-1);
        
        //So we will use the custom sorting method
        ArrayList<String> list=new ArrayList<>();
        for(String h:nums){
            list.add(h);
        }
        //Basically in custom sort 
        //agar hum chahate he ki b greater ho and vo smaller proved ho jaye to swap it in list array itself
        //agar b badha he and proved ho jaye vo badha he to keep it on it position 
        //i have taken b because i want to sort in decending order

       //No rearrangement
        Collections.sort(list,(a,b)->{
            if(a.length()!=b.length()){
                //me chahata hu ki yaha par b badha ho agar b is smaller then -1
                //agar b> then 1
                //and this Integer.toCompareTo will automatically sort 
                return Integer.compare(b.length(),a.length());
                //compareTo tell which element comes first
            }
            return b.compareTo(a);//this will only result positive or negative
        });
        String d=list.get(k-1);
        return d;


        
        
    }
}