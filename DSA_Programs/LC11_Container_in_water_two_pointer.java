class Solution {
    public int maxArea(int[] height) {
        //can use brute force also but it will give TLE for larger input
        //using two pointer Approach
        //like in this questio I am taking a left pointer and right pointer
        //first calculating the height min and index diff then if the left height is less
        //then left++ else right++ dekh height to min aajegi left and right pointer jo
        //bada advantage he
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            max=Math.max(max,h * width);

            if(height[left]<height[right]){//ye jyada area cover karega 
            //par agar tu condition reverse karega like jo bada he ussi ko age badaya to 
            //hame min area milega
                left++;

            }else{
                right--;
            }
        }
        return max;
        
    }
}