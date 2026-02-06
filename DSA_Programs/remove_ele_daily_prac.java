public int remove(int nums[],int k){
    Arrays.sort(nums);
    int len=nums.length;
    int max=0;
    int start=0;
    for(int end=0;end<len;end++){
        while(nums[end]>(long)nums[start] * k){
            start++;  //increase the index of last element

        }
        max=Math.max(max,end-start+1);  //+1 for distance count
    }
    return len-max;
}