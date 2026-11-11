import java.util.*;
class Solution {
    public int maximumSum(int[] nums) {

      //============ Amazon OA Question===========//

        //Mine mistake i am trying with PQ which will make too much complicated
        //isme remainder theory se kaam karge
        //like divisible by 3 ho and max and min ka kuch keh rah aho to samaj jana Remainder method easy way
        //now 0 remainder,1 and 2 remainder ko arraliast me alag se dalkar decending sorting kkaro
        //jisse largest element pehele aa jayega
        //uske baad three condition pe kaam karna he
        //1st condition he 0+0+0 =>0 three element agar 0 remainder wale le to vo three se divisible hoga usse max me store kar lo
        //2nd condtion 1+1+1=3 which will be divisible by three now takke three element from there also
        //3rd condition 2+2+2 we will take three element from the remainder 2 now it will be divisible by three see for dry run it want
        //4rd condition combination condition hogi 0+1+2 ye bhi divisible hoga
        //isme diya he randomly select karna he subarray ki form me nahi karna he

        ArrayList<Integer> remainder0=new ArrayList<>();
        ArrayList<Integer> remainder1=new ArrayList<>();
        ArrayList<Integer> remainder2=new ArrayList<>();

        for(int i:nums){
            if(i%3==0){
                remainder0.add(i);
            }else if(i%3==1){
                remainder1.add(i);
            }else{
                remainder2.add(i);
            }
        }

        Collections.sort(remainder0,Collections.reverseOrder());
        Collections.sort(remainder1,Collections.reverseOrder());
        Collections.sort(remainder2,Collections.reverseOrder());
        int max=0;

        if(remainder0.size()>=3){
            max=Math.max(max,remainder0.get(0)+remainder0.get(1)+remainder0.get(2));
        }
        if(remainder1.size()>=3){
            max=Math.max(max,remainder1.get(0)+remainder1.get(1)+remainder1.get(2));
        }
        if(remainder2.size()>=3){
            max=Math.max(max,remainder2.get(0)+remainder2.get(1)+remainder2.get(2));
        }
        if(remainder0.size()>=1 && remainder1.size()>=1 && remainder2.size()>=1){
            //kyuki mereko ek ek element hi chahiye teno mese
            //teno mese first element which will give maximum sum
            max=Math.max(max,remainder0.get(0)+remainder1.get(0)+remainder2.get(0));

        }
        return max;

        
    }
}