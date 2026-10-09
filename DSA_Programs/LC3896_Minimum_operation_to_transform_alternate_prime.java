class Solution {
    public int minOperations(int[] nums) {

        //====================Google OA Questions===============//
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                //agar prime nahi he to operation perform hoge
                while(!(prime(nums[i]))){//agar prime hua to ruk jao 
                    nums[i]++;//this chanegs in while condition  only not otside the while 
                    count++;
                    
                }
            }else if(i%2!=0){
                while(prime(nums[i])){//baas mistake yaha ho rahi thi while loop me 
                //in question we have to perform operation jab tak prime ya non-prime nahi hota
                    nums[i]++;
                    count=count+1;
                }

            }

        }
        return count;

        
    }
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}