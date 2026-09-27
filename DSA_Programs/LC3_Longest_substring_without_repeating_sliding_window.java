import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //This is the Concept of the Sliding window 
        //isme hum ek set banyege jisme sabhi unique element jane chahiye
        //agar element exists karta he set me to left se remove karte jayege jab tak duplicate element nikal na jaye
        //iska ye sliding window ka tarika test case 3rd dekhkar pata chala
        //Test Case->"pwwkew"
        //dry run
        //Set me p,w dala ab w exists karta he set me to left se nikalao p,w nikla
        //now current char to add hoga w hua add,k,e add hua now wapis w pe aye left most
        //element nikala kew is the valid string of length 3 
        //Inshot lement nikalo left se jab tak duplicate na nikale
        //TC=>O(N)

        HashSet<Character> list=new HashSet<>();
        int left=0;//left pointer string me traverse kar raha he
        int max=0;
        for(int i=0;i<s.length();i++){
            while(list.contains(s.charAt(i))){
                list.remove(s.charAt(left));//this removes charcater form the set
                left++;
            }
            list.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        return max;
        

        
    }
}