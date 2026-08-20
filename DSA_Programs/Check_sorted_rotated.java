class Solution {
    public boolean check(int[] nums,int target) {
        //abhi isme brute force karega to to bade input keliye work nahi karega
        //isme Two pointer appraoch lagana padega 
        //par rotated bola he to samaj jana modulo arithmetic use hoga which helps
        //for rotating lef and right 
        //first step isme breaking point nikal
        int bp=-1;//maan lo koi  breaking point nahi he 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                bp=i;
                break;
            }

        }
        int n=nums.length;
        int leftpointer=bp+1;//which is smaller
        int rightpointer=bp; //which is bigger
        while(leftpointer!=rightpointer){
            if(leftpointer+rightpointer==target){
                return true;
            }

            if(leftpointer+rightpointer<target){
                //target bada he to
                leftpointer=(leftpointer+1)%n;
            }else{
                rightpointer=(n+rightpointer-1);
            }
        }
        return false;
        
    }
}