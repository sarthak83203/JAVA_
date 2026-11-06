import java.util.*;
class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;

       //=============== Capital One,Google,Amazon OA Questions=============//

        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> list=new ArrayList<>();
            //Mine Mistake is checking each number which gives TLE just think about j*j 
            //And j!=u/j this two condition is important
            int u=nums[i];
            for(int j=1;j*j<=u;j++){//so to overcome of TLE we used j*j it means 
            //4 ke aage jayega hi nahi check karne ki jarurat hi nahi
                if(u%j==0){
                    list.add(j);
                    //and agar aage jayega hi nahi to 21 and 7 nahi aa payega according to first test case
                    //so ek divisor he j then think about this conditon j X partner=u
                    //now partner=u/j baas agar equal nahi he to add karo
                    //kyuki loop apna 4 tak chalega aage nahi jayega beacause of j*j which reduces the TLE
                    //this all about the test case of 21 

                    //Mine mistake is in this condition
                    if(j!=(u/j)){//this condition is must

                    list.add(u/j);
                }
                }
                
            }
            if(list.size()==4){
                for(int h:list){
                    sum=sum+h;
                }

            }
           
        }
        return sum;

        
    }
}