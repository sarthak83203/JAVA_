import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
        //nice question ->Interview Ask question
        //in this i came to know about the custom sort this is new sorting method 
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);

        }
        //smallest concatenation Arrays.sort(arr, (a, b) -> (a + b).compareTo(b + a));
        //now i got the number in String array now i can use custom sort for concatenate
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b)); //tthis gives largest and opposite of that gives smallest
        StringBuilder sb=new StringBuilder();
        for(String t:arr){
            sb.append(t);

        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();


        
    }
}