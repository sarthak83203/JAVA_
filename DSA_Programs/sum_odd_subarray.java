public int sum_odd_subarray(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if((j-i+1)%2!=0){     //remember this (j-i+1) is the size of subarrays(Shotcut...)
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }

            }
        }
    }
    return sum;
}