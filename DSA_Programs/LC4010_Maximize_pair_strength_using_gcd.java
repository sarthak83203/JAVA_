class Solution {


    //One mistake i am doing is performing multiplying in int then covert to long
    //Rather i should  conver both the elements to long then perform it so that bigger input passes all the test case
    //TC=O(N^2)
    //Suggested TC=O(N^2)
    public long gcd(long a,long b){
        if(b==0){
            return a;
        }
       return gcd(b,a%b);



    }
    public long maxPairStrength(int[] nums) {
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long gcds=gcd(nums[i],nums[j]);
                long result=(((long)nums[i]*(long)nums[j])/(gcds*gcds));
                max=Math.max(max,result);   
            }
        }
        return (long)max;
        
    }
}