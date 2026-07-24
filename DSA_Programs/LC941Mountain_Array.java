class Solution {
    public boolean validMountainArray(int[] arr) {
        int flag1=0;//let keep climbing up
        int flag2=0;//
        int i=1;
        while(i<arr.length && arr[i]>arr[i-1]){//this is climbing up
             i++;
             flag1=1;
        }

        while(i<arr.length && arr[i]<arr[i-1]){//this is coming down
            i++;
            flag2=1;
        }

        if(i==arr.length && flag1+flag2==2){
            return true;
        }
        return false;

        
    }
}