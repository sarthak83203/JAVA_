class Solution {
    public int maxSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(m<3 || n<3){
            return 0;
        }
        //if in this 5X5 matrix is also given then we have to take the case of 3X3 and do and calculate the hourglass in nested for loop
        //after that finding maximum
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                max=Math.max(max,sum);
            }
        }
        return max;
        
    }
}