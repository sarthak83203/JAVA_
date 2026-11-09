import java.util.*;
class Solution {
    public int maxSumDivThree(int[] nums) {



        //================ DE Shaw,Goldman Sachs,Amazon,Google,Blooomberg OA Questions===========//




        //This is mine mistake i am removinf only one Divisible by 3 means we have to remove aleast two ye bhi case ho sakta he
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        // }
        // Arrays.sort(nums);
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum-nums[i];
        //     if(sum%3==0){
        //         max=Math.max(max,sum);
        //     }else{
        //         sum=sum+nums[i];

        //     }
        // }
        // return max;

        ArrayList<Integer> one=new ArrayList<>();//remainder one wale element add hoga
        ArrayList<Integer> two=new ArrayList<>();//remainder two wale element add hoga
        //remainder isliye dekha kyuki 3 se divisible he isk matlab 1 or 2 remainder aa sakta he
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        Arrays.sort(nums);
        if(sum%3==0){
            return sum;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==1){
                one.add(nums[i]);

            }else if(nums[i]%3==2){
                two.add(nums[i]);
            }
            
        }

        if(sum%3==1){
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            //This two condition are possibility
            //Dono mese jo minimumnumber dekar sum jyada rakhega baas vohi ans he
            if(one.size()>=1){
                a=one.get(0);//1 remainder 
            } 
            if(two.size()>=2){
                b=two.get(0)+two.get(1);//2+2=>4 Remainder 4%3=1 combination of remainder gives 4 and then divisible by 3 will give one
            }
            return sum-Math.min(a,b);//smallest number means sum jyada
        }else{//remainder 2 aya hoga

            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            if(two.size()>=1){
                a=two.get(0);
            }
            if(one.size()>=2){
                b=one.get(0)+one.get(1);
            }

            return sum-Math.min(a,b);
             
        }
       
    }
}