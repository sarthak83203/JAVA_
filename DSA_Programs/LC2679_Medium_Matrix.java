import java.util.*;
class Solution {
    public int matrixSum(int[][] nums) {
        int m=nums.length;     //in each row
        int n=nums[0].length;  //in each coloum

        for(int i=0;i<m;i++){
            Arrays.sort(nums[i]);
        }

        int sum=0;
        //calculate from maximum sum
        for(int j=0;j<n;j++){
            int max=0;
            for(int i=0;i<m;i++){
                max=Math.max(max,nums[i][j]);    
            }
            sum+=max;
        }
        return sum;

        
    }
}